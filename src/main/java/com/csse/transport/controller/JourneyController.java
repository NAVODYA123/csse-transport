package com.csse.transport.controller;


import com.csse.transport.model.Journey;
import com.csse.transport.model.Passenger;
import com.csse.transport.repository.JourneyRepository;
import com.csse.transport.repository.PassengerRepository;
import com.csse.transport.repository.UserRepository;
import com.csse.transport.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping(path="/journey")
public class JourneyController {

    @Autowired
    private JourneyRepository journeyRepository;
    private    PassengerRepository passengerRep;

    @PostMapping("/journey-start")
    public ResponseEntity<Object> startJourney(@RequestBody Map<String, String> body) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        Journey j = new Journey();
    j.setBusID(body.get("bus_id"));
    j.setDate_journey(date);
    j.setRouteID(body.get("route_id"));

        JourneyService journeyService = new JourneyService();
        boolean flag = journeyService.addJourney(j);
//        Passenger pas = passengerRep.findByPid(body.get("passengerID"));
        Journey savedJourney = journeyRepository.save(j);


        if(flag == true){
            return ResponseEntity
                    .unprocessableEntity()
                    .body("Journey record saved successfully.");
        }else{
            return ResponseEntity
                    .ok()
                    .body("Journey record saved failed.");
        }



    }

}


