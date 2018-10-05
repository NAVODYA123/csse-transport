package com.csse.transport.controller;

import com.csse.transport.model.Route;
import com.csse.transport.repository.RouteDataViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/routing")
public class RouteDataViewControler {

    @Autowired
    private RouteDataViewRepository routeDataViewRepository;

    @GetMapping(path="/getroutedata")
    public @ResponseBody
    Route getRouteByRouteID(@RequestParam int routeid){
        //This returns a JSON or XML with the users
        return routeDataViewRepository.findByRouteID(routeid);
    }
}
