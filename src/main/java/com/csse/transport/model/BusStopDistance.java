package com.csse.transport.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.annotation.Generated;
import javax.persistence.*;


@Entity
@Table(name ="bus_stop_distance")
public class BusStopDistance {
    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

    private String busHalt1;
    private String busHalt2;
    private  double distance;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "RouteID",nullable = false)
    @JsonIgnore
    private Route route;





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


}
