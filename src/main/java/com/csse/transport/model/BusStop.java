package com.csse.transport.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "bus_stop")
public class BusStop {

    @Id
    @Column(name="BusHaltID",nullable = false,unique=true,columnDefinition="VARCHAR(12)")
    private String BusHaltID;
    private String Town;
    private String BusHaltName;
    private double BusHaltLatitude;
    private double BusHaltLongitude;


    @ManyToMany (mappedBy = "busStop", fetch = FetchType.EAGER)
    private Set<Route> route;

    public String getBusHaltID() {
        return BusHaltID;
    }

    public void setBusHaltID(String busHaltID) {
        BusHaltID = busHaltID;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String town) {
        Town = town;
    }

    public String getBusHaltName() {
        return BusHaltName;
    }

    public void setBusHaltName(String busHaltName) {
        BusHaltName = busHaltName;
    }

    public double getBusHaltLatitude() {
        return BusHaltLatitude;
    }

    public void setBusHaltLatitude(double busHaltLatitude) {
        BusHaltLatitude = busHaltLatitude;
    }

    public double getBusHaltLongitude() {
        return BusHaltLongitude;
    }

    public void setBusHaltLongitude(double busHaltLongitude) {
        BusHaltLongitude = busHaltLongitude;
    }

    public Set<Route> getRoute() {
        return route;
    }

    public void setRoute(Set<Route> route) {
        this.route = route;
    }
}