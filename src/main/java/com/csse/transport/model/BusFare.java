package com.csse.transport.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BusFare {
    @Id
    ///@GeneratedValue(strategy = GenerationType.AUTO)
    private String BusFareID;

    private String RouteID;
    private String Halt_1ID;
    private String Halt_2ID;
    private float Halt1Latitude;
    private float Halt1Longitude;
    private float Halt2Latitude;
    private float Halt2Longitude;
    private float DistanceBetweenHalts;


    public String getBusFareID() {
        return BusFareID;
    }

    public void setBusFareID(String busFareID) {
        BusFareID = busFareID;
    }

    public String getBusStopID() {
        return BusStopID;
    }

    public void setBusStopID(String busStopID) {
        BusStopID = busStopID;
    }

    public String getRouteID() {
        return RouteID;
    }

    public void setRouteID(String routeID) {
        RouteID = routeID;
    }

    public String getHalt_1ID() {
        return Halt_1ID;
    }

    public void setHalt_1ID(String halt_1ID) {
        Halt_1ID = halt_1ID;
    }

    public String getHalt_2ID() {
        return Halt_2ID;
    }

    public void setHalt_2ID(String halt_2ID) {
        Halt_2ID = halt_2ID;
    }

    public float getHalt1Latitude() {
        return Halt1Latitude;
    }

    public void setHalt1Latitude(float halt1Latitude) {
        Halt1Latitude = halt1Latitude;
    }

    public float getHalt1Longitude() {
        return Halt1Longitude;
    }

    public void setHalt1Longitude(float halt1Longitude) {
        Halt1Longitude = halt1Longitude;
    }

    public float getHalt2Latitude() {
        return Halt2Latitude;
    }

    public void setHalt2Latitude(float halt2Latitude) {
        Halt2Latitude = halt2Latitude;
    }

    public float getHalt2Longitude() {
        return Halt2Longitude;
    }

    public void setHalt2Longitude(float halt2Longitude) {
        Halt2Longitude = halt2Longitude;
    }

    public float getDistanceBetweenHalts() {
        return DistanceBetweenHalts;
    }

    public void setDistanceBetweenHalts(float distanceBetweenHalts) {
        DistanceBetweenHalts = distanceBetweenHalts;
    }
}
