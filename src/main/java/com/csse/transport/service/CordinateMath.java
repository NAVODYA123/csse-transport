package com.csse.transport.service;

import com.csse.transport.model.Bus;
import com.csse.transport.model.BusStop;

import java.util.List;

public class CordinateMath {

    public  double calcDistance(double lat1, double lon1, double lat2,double lon2) {

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

//        double height = el1 - el2;
//
//        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return distance;
    }

    public BusStop findNearestHalt(List<BusStop> busHalts,double cLat,double cLon){

        double temp_distance,min_distance;
//        String passengerHalt;
        BusStop bs,bus_stop;

        bus_stop=busHalts.get(0);
//        passengerHalt= busHalts.get(0).getBusHaltName();
        min_distance = calcDistance(cLat,cLon,busHalts.get(0).getBusHaltLatitude(),busHalts.get(0).getBusHaltLongitude());

        for(int i =0;i<busHalts.size();i++){
            bs = busHalts.get(i);
            temp_distance = calcDistance(cLat,cLon,bs.getBusHaltLatitude(),bs.getBusHaltLongitude());
            if(temp_distance>min_distance)
                continue;
            else{
                min_distance = temp_distance;
                bus_stop= bs;
//                passengerHalt = bs.getBusHaltName();
            }


        }
        return bus_stop;
    }
}
