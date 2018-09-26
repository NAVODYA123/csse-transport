package com.csse.transport.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

///this class handles the route information for all routes
@Entity
public class Route {
    @Id
    private int RouteID;
    private String Origin;
    private String Destination;
    private float OriginLatitude;
    private float OriginLongitude;
    private float DesLatitude;
    private float DesLongitude;

    @ManyToMany(mappedBy = "route")
    private Set<BusStop> busStop = new HashSet<>();

    public Set<BusStop> getBusStop() {
        return busStop;
    }

    public void setBusStop(Set<BusStop> busStop) {
        this.busStop = busStop;
    }

    public int getRouteID() {
        return RouteID;
    }

    public void setRouteID(int routeID) {
        RouteID = routeID;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public float getOriginLatitude() {
        return OriginLatitude;
    }

    public void setOriginLatitude(float originLatitude) {
        OriginLatitude = originLatitude;
    }

    public float getOriginLongitude() {
        return OriginLongitude;
    }

    public void setOriginLongitude(float originLongitude) {
        OriginLongitude = originLongitude;
    }

    public float getDesLatitude() {
        return DesLatitude;
    }

    public void setDesLatitude(float desLatitude) {
        DesLatitude = desLatitude;
    }

    public float getDesLongitude() {
        return DesLongitude;
    }

    public void setDesLongitude(float desLongitude) {
        DesLongitude = desLongitude;
    }
}