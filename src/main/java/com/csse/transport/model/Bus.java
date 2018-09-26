package com.csse.transport.model;

import org.hibernate.annotations.Fetch;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class Bus {

  @Id
    private String BusID;
    private String make;
    private String type;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "RouteID",nullable = false)
    private Route route;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public String getBusID() {
        return BusID;
    }

    public void setBusID(String busID) {
        BusID = busID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
