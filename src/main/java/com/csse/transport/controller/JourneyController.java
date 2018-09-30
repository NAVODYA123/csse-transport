package com.csse.transport.controller;


import com.csse.transport.model.Journey;
import com.csse.transport.model.Passenger;
import com.csse.transport.repository.JourneyRepository;
import com.csse.transport.repository.PassengerRepository;
import com.csse.transport.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/journey")
public class JourneyController {

    @Autowired
    private JourneyRepository journeyRepository;
    private    PassengerRepository passengerRep;

//    @PostMapping("/journey-start")
//    public ResponseEntity<Object> startJourney(@RequestBody  String passengerID,int routeId,String busId) {
//
//
//
//        Passenger pas = passengerRep.findByPid(passengerID);
//
////        Journey savedJourney = journeyRepository.save(journey);
//
////        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
////                .buildAndExpand(savedStudent.getId()).toUri();
//
//        return ResponseEntity.created(location).build();
//
//    }

}


