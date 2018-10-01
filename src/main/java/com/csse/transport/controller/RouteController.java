package com.csse.transport.controller;

import com.csse.transport.model.BusStop;
import com.csse.transport.model.Route;
import com.csse.transport.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller  // This means that this class is a Controller
@RequestMapping(path="/bus-route") // This means URL's start with /demo (after Application path)
public class RouteController {

    @Autowired   // This means to get the bean called userRepository
    private RouteRepository routeRepository;


    @PostMapping("/add-route")
    public ResponseEntity<Object> addNewRoute(@Valid @RequestBody Route r) {

//        Route r = new Route();
//        r.setRouteID(Integer.parseInt(body.get("routeId")));
//        r.setOrigin(body.get("origin"));
//        r.setOriginLatitude(Double.parseDouble(body.get("originLatitude")));
//        r.setOriginLongitude(Double.parseDouble(body.get("originLongitude")));
//        r.setDestination(body.get("destination"));
//        r.setDesLatitude(Double.parseDouble(body.get("DesLatitude")));
//        r.setDesLongitude(Double.parseDouble(body.get("DesLongitude")));

//        r.setRouteID(body.getRouteID());
//        r.setOrigin(body.getOrigin());
//        r.setOriginLatitude(body.getOriginLatitude());
//        r.setOriginLongitude(body.getOriginLongitude());
//        r.setDestination(body.getDestination());
//       r.setDesLatitude(body.getDesLatitude());
//       r.setDesLongitude(body.getDesLongitude());

     Set<BusStop> busHalts = new HashSet<>();
       for( BusStop b:r.getBusStop()){
        busHalts.add(b);
           System.out.println(b.getTown());
        }
        r.setBusStop(busHalts);



        routeRepository.save(r);

        String message = "Successfull";
        return ResponseEntity
                .ok()
                .body(message);

    }

    @GetMapping(path = "/all-routes")
    public @ResponseBody
    Iterable<Route> getAllRoutes() {
        //This returns a JSON or XML with the users
        return routeRepository.findAll();
    }
}


//testing
//http://localhost:8080/sl-trans/add?username=nadun&password=112233
//http://localhost:8080/sl-trans/all-users