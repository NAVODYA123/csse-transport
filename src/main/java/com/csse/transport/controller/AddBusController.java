package com.csse.transport.controller;

import com.csse.transport.model.Bus;


import com.csse.transport.repository.AddBusRepositry;

import com.csse.transport.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



import java.util.Map;
import java.util.Optional;

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
      p.setRoute(routeRepository.findByRouteID(routeId));


      p.setOwnerName(OwnerName);

        AddBusReposirory.save(p);
        return "Bus Registered successfully";
    }
    @GetMapping(path="/getBus")
    public @ResponseBody
    Bus getBusByBusID (@RequestParam String BusID){
        //This returns a JSON or XML with the users
        return AddBusReposirory.findByBusID(BusID);
    }
    @GetMapping(path="/allbus")

    public @ResponseBody Iterable<Bus> getABuses(){
        //This returns a JSON or XML with the users
        System.out.println();

        return AddBusReposirory.findAll();
    }
    @RequestMapping(value = "bus/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public  void delete(@PathVariable String id){
        AddBusReposirory.deleteById(id);
    }

@RequestMapping(value = "busupdate/{id}",method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updatebus(@PathVariable String id,@RequestBody Map<String, String> body){
        Bus p=AddBusReposirory.findByBusID(id);
        if(p==null){
            throw  new IllegalStateException("no bus id with "+id);
        }

    String BusID=body.get("BusID");
    String make=body.get("make");
    String type=body.get("type");
    int routeId= Integer.parseInt(body.get("route"));
    String OwnerName=body.get("OwnerName");


    Bus pe = new Bus();
    pe.setBusID(BusID);
    pe.setMake(make);
    pe.setType(type);
    pe.setRoute(routeRepository.findByRouteID(routeId));


    pe.setOwnerName(OwnerName);

        AddBusReposirory.save(pe);

}

}
