package com.csse.transport.model;

import javax.persistence.*;


@Entity
public class BusStop {

    @Id
    @Column(name="BusHaltID",nullable = false,unique=true,columnDefinition="VARCHAR(12)")
    private String BusHaltID;
    private String Town;
    private String BusHaltName;
    private float BusHaltLatitude;
    private float BusHaltLongitude;

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