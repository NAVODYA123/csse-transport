package com.csse.transport.controller;

import com.csse.transport.model.BusStop;
import com.csse.transport.model.BusStopDistance;
import com.csse.transport.repository.BusStopDistanceRepository;
import com.csse.transport.repository.RouteRepository;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.util.Pair;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
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

  @PostMapping("/add-bus-stop-distance")
  @SuppressWarnings("unchecked")
  @JsonProperty("bs")
//    @RequestMapping(value="/add-bus-stop-distance", method=RequestMethod.POST,consumes="application/json",produces="application/json")
        public ResponseEntity<Object> addBusStopDistance(@Valid @RequestBody Map<String,Object> body) throws IOException {

//       body.get("bs");
     System.out.println(body.get("bs"));


//        for(int i=0;i<body.get("bs").length;i++){
//
//            System.out.println(body.get(i));
////            busFareRepository.save(body.get(i));
//        }
      ObjectMapper mapper = new ObjectMapper();

//          List<MapperBusStop> myObjects = mapper.readValue(body.get("bs"), new TypeReference<List<MapperBusStop>>(){});

//      List<MapperBusStop> myObjects = mapper.readValue(a, mapper.getTypeFactory().constructCollectionType(List.class, MapperBusStop.class));
//              .readerFor(MapperBusStop.class)
//              .readValue( body.get("bs").toString());

        String message = "Successfully updated the list";
        return ResponseEntity
                .ok()
                .body(message);

    }
    public class MapperBusStop {

        private String busHalt1;
        private String busHalt2;
        private String distance;

//        @SuppressWarnings("unchecked")
//        @JsonProperty("bs")
//        private void unpackNested(Map<String,Object> bs) {
//            this.busHalt1 = (String)bs.get("busHalt1");
//            this.busHalt2 = (String)bs.get("busHalt2");
//            this.distance = (String)bs.get("distance");
////            Map<String,String> owner = (Map<String,String>)brand.get("owner");
////            this.ownerName = owner.get("name");
//        }

        public String getBusHalt1() {
            return busHalt1;
        }

        public void setBusHalt1(String busHalt1) {
            this.busHalt1 = busHalt1;
        }

        public String getBusHalt2() {
            return busHalt2;
        }

        public void setBusHalt2(String busHalt2) {
            this.busHalt2 = busHalt2;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }
    }

}
