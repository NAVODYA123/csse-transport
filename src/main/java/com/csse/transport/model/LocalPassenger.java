package com.csse.transport.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//@Entity
//@Table(name = "local_passenger")
public class LocalPassenger extends Passenger{


    private String address;
    private double amountAvailable;

//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            },
//            mappedBy = "passenger")
//    private Set<Journey> journeys = new HashSet<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public Set<Journey> getJourneys() {
//        return journeys;
//    }
//
//    public void setJourneys(Set<Journey> journeys) {
//        this.journeys = journeys;
//    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }
}
