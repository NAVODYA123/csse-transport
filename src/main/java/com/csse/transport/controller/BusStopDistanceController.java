package com.csse.transport.controller;

import com.csse.transport.model.BusStop;
import com.csse.transport.repository.BusStopDistanceRepository;
import com.csse.transport.repository.RouteRepository;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping(path="/bus-fare")
public class BusStopDistanceController {

    @Autowired
    private BusStopDistanceRepository busFareRepository;
    @Autowired
    private RouteRepository routeRepository;

    //populate all posible distinct pairs of bus halts in a particular route
    @GetMapping(path="/all-bus-halt-combinations")
    public @ResponseBody ArrayList<Pair<String,String>> getAllUsers(@RequestParam int routeID){
        ArrayList<Pair<String,String>>al = new ArrayList<>();
        List<BusStop> bslist = new ArrayList(routeRepository.findByRouteID(routeID).getBusStop());

        for(int i=0;i<bslist.size();i++){
           for(int j = i+1; j<bslist.size();j++){
                al.add(new Pair<String, String>(bslist.get(i).getBusHaltName(),bslist.get(j).getBusHaltName()));
           }
        }
        return al;
    }



}
