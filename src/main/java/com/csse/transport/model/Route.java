package com.csse.transport.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    private double OriginLatitude;
    private double OriginLongitude;
    private double DesLatitude;
    private double DesLongitude;

//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            })
//    @JoinTable(name = "route_bus_stops",
//            joinColumns = { @JoinColumn(name = "routeID") },
//            inverseJoinColumns = { @JoinColumn(name = "busHaltID") })

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "route_bus_stop", joinColumns = @JoinColumn(name = "RouteID", referencedColumnName = "RouteID"),
            inverseJoinColumns = @JoinColumn(name = "BusHaltID", referencedColumnName = "BusHaltID"))
    @JsonIgnoreProperties
    private Set<BusStop> busStop ;

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

    public double getOriginLatitude() {
        return OriginLatitude;
    }

    public void setOriginLatitude(double originLatitude) {
        OriginLatitude = originLatitude;
    }

    public double getOriginLongitude() {
        return OriginLongitude;
    }

    public void setOriginLongitude(double originLongitude) {
        OriginLongitude = originLongitude;
    }

    public double getDesLatitude() {
        return DesLatitude;
    }

    public void setDesLatitude(double desLatitude) {
        DesLatitude = desLatitude;
    }

    public double getDesLongitude() {
        return DesLongitude;
    }

    public void setDesLongitude(double desLongitude) {
        DesLongitude = desLongitude;
    }

    public Set<BusStop> getBusStop() {
        return busStop;
    }

    public void setBusStop(Set<BusStop> busStop) {
        this.busStop = busStop;
    }
}