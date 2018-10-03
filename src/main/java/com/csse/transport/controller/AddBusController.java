package com.csse.transport.controller;

import com.csse.transport.model.Bus;

import com.csse.transport.repository.AddBusRepositry;

import com.csse.transport.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Map;

@Controller
@RequestMapping(path="/Bus_details")
public class AddBusController {
    @Autowired
    private AddBusRepositry AddBusReposirory;
    @Autowired
    private RouteRepository routeRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String AddBusDetails (@RequestBody Map<String, String> body){



        String BusID=body.get("BusID");
        String make=body.get("make");
        String type=body.get("type");
        int routeId= Integer.parseInt(body.get("route"));
        String OwnerName=body.get("OwnerName");


        Bus p = new Bus();
      p.setBusID(BusID);
      p.setMake(make);
      p.setType(type);
//      p.setRoute(routeRepository.findByRouteID(routeId));


      p.setOwnerName(OwnerName);

        AddBusReposirory.save(p);
        return "Bus Registered successfully";
    }
}
