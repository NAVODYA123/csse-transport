package com.csse.transport.controller;

import com.csse.transport.model.BusStop;
import com.csse.transport.repository.BusStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Controller  // This means that this class is a Controller
@RequestMapping(path="/bus-stop") // This means URL's start with /demo (after Application path)
public class BusStopController {

    @Autowired   // This means to get the bean called userRepository
    private BusStopRepository busstopRepository;


    @PostMapping("/add-bus-halt")
    public ResponseEntity<Object> addNewBusStop(@Valid @RequestBody BusStop bs) {

        busstopRepository.save(bs);

        String message = "Successfull";
        return ResponseEntity
                .ok()
                .body(message);

    }

    @GetMapping(path="/all-stops")
    public @ResponseBody Iterable<BusStop> getAllBusStops(){
        //This returns a JSON or XML with the users
        return busstopRepository.findAll();
    }
}
