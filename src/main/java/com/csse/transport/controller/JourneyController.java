package com.csse.transport.controller;


import com.csse.transport.model.Journey;
import com.csse.transport.repository.JourneyRepository;
import com.csse.transport.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/sl-trans")
public class JourneyController {
//
//    @Autowired
//    private JourneyRepository journeyRepository;
//
//    @PostMapping("/add-journey")
//    public ResponseEntity<Object> addJourney(@RequestBody Journey journey) {
//        Journey savedJourney = journeyRepository.save(journey);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//                .buildAndExpand(savedStudent.getId()).toUri();
//
//        return ResponseEntity.created(location).build();
//
//    }
//
//    @GetMapping(path="/all-users")
//    public @ResponseBody Iterable<User> getAllUsers(){
//        //This returns a JSON or XML with the users
//        return userRepository.findAll();
//    }
}


