package com.csse.transport.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BusStop {
    @Id
    ///@GeneratedValue(strategy = GenerationType.AUTO)
    private String BusHaltID;

    private String RouteID;
    private String TownID;
    private String BusHaltName;
    private float BusHaltLatitude;
    private float BusHaltLongitude;

    public String getBusHaltID() {
        return BusHaltID;
    }

    public void setBusHaltID(String busHaltID) {
        BusHaltID = busHaltID;
    }

    public String getRouteID() {
        return RouteID;
    }

    public void setRouteID(String routeID) {
        RouteID = routeID;
    }

    public String getTownID() {
        return TownID;
    }

    public void setTownID(String townID) {
        TownID = townID;
    }

    public String getBusHaltName() {
        return BusHaltName;
    }

    public void setBusHaltName(String busHaltName) {
        BusHaltName = busHaltName;
    }

    public float getBusHaltLatitude() {
        return BusHaltLatitude;
    }

    public void setBusHaltLatitude(float busHaltLatitude) {
        BusHaltLatitude = busHaltLatitude;
    }

    public float getBusHaltLongitude() {
        return BusHaltLongitude;
    }

    public void setBusHaltLongitude(float busHaltLongitude) {
        BusHaltLongitude = busHaltLongitude;
    }
}