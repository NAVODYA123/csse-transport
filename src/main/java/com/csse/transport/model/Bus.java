package com.csse.transport.model;

import javax.persistence.*;

//@Entity
public class Bus {

  @Id
  @Column(name="busId",nullable = false,unique=true,columnDefinition="VARCHAR(15)")
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
