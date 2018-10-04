package com.csse.transport.controller;

import com.csse.transport.model.BusStop;
import com.csse.transport.model.Fee;
import com.csse.transport.repository.BusStopRepository;
import com.csse.transport.repository.FeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller  // This means that this class is a Controller
@RequestMapping(path="/fee-algo") // This means URL's start with /demo (after Application path)
public class FeeController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired   // This means to get the bean called userRepository
    private FeeRepository feeRepository;



//    @GetMapping(path="/")

    //get bus fair algorithm details

    @GetMapping(path="/get-fee-algo")
    public @ResponseBody Fee getDetail_one(@RequestParam int id){

        return feeRepository.findById(id);
    }

    @GetMapping(path="/get-all-fee-algo")
    public @ResponseBody
    Iterable<Fee> getDetail_all(){

        return feeRepository.findAll();
    }
}
