package com.csse.transport.controller;


import com.csse.transport.model.*;
import com.csse.transport.repository.*;
import com.csse.transport.service.CordinateMath;
import com.csse.transport.service.JourneyService;
import javafx.application.Application;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping(path="/journey")
public class JourneyController {

    @Autowired
    private JourneyRepository journeyRepository;
    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private PassengerJourneyRepository passengerJourneyRepository;
    @Autowired
    private RouteRepository  routeRepository;
// Trigger this method by driver before starting the journey
    @PostMapping("/journey-start")
    public ResponseEntity startJourney(@RequestBody Map<String, String> body) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        Journey j = new Journey();
    j.setBusID(body.get("bus_id"));
    j.setDate_journey(date);
    j.setRouteID(Integer.parseInt(body.get("route_id")));

//        JourneyService journeyService = new JourneyService();
//        boolean flag = journeyService.addJourney(j);
//        Passenger pas = passengerRep.findByPid(body.get("passengerID"));
        Journey savedJourney = journeyRepository.save(j);

        System.out.println(savedJourney.getJourneyId());
//            return new ResponseEntity<Journey>(savedJourney,HttpStatus.NO_CONTENT);
            return ResponseEntity
                    .unprocessableEntity()
                    .body("Journey record saved successfully.");



    }

    //This method is triggered whenever a passenger enter his/her card to the card reader
    @PostMapping("/slide-card-start")
    public ResponseEntity slideTheCard(@RequestBody Map<String,String> body){

        String pid = body.get("pid");
        int jid = Integer.parseInt(body.get("jid"));
        double cLati =Double.parseDouble(body.get("originLat"));
        double cLon = Double.parseDouble(body.get("originLon"));

        Journey journey = journeyRepository.findByjourneyId(jid);
        Passenger passenger = passengerRepository.findByPid(pid);

        System.out.println(passenger.getName());

        Set<BusStop> set = routeRepository.findByRouteID(journey.getRouteID()).getBusStop();
        List bslist  = new ArrayList(set);

        //get nearest bus stop for the passenger geo cordinates
        CordinateMath cm = new CordinateMath();
        BusStop originBusStop = cm.findNearestHalt(bslist,cLati,cLon);

        System.out.println(originBusStop.getTown());
        PassengerJourney passengerJourney = passengerJourneyRepository.findByid(new PassengerJourneyId(jid,pid));

        PassengerJourney pj  = new PassengerJourney(journey,passenger);

        if(passengerJourney.isStatus() == true || !passengerJourney.equals(null)){
            pj.setStatus(false);
            pj.setDestLat(originBusStop.getBusHaltLatitude());
            pj.setDestLon(originBusStop.getBusHaltLongitude());
            pj.setDestination(originBusStop.getBusHaltName());

        }else{
            pj.setStatus(true);
            pj.setOriginLat(originBusStop.getBusHaltLatitude());
            pj.setOriginLon(originBusStop.getBusHaltLongitude());
            pj.setOrigin(originBusStop.getBusHaltName());

        }
        PassengerJourney saved = passengerJourneyRepository.save(pj);
        return ResponseEntity
                .ok()
                .body("success");

    }
    @GetMapping(path="/get-journey")
    public @ResponseBody PassengerJourney getJourneyByj(){
        //This returns a JSON or XML with the users
//        return passengerJourneyRepository.findByPassengerJourneyIdJourneyId(jid);
        PassengerJourneyId pk =new PassengerJourneyId(1,"940");
        PassengerJourney pi =passengerJourneyRepository.findByid(pk);
        System.out.println(pi.getOrigin());
        return  pi;
    }


}


