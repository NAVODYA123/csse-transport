package com.csse.transport.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "journey")
public class Journey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int journeyId;
    private String busID;
    private Date date_journey;


    //configuring many to many relationship with passenger
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Passenger> passengers = new ArrayList<>();


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RouteID", nullable = false)
        private Route route;


    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    public String getBusID() {
        return busID;
    }

    public void setBusID(String busID) {
        this.busID = busID;
    }

    public Date getDate_journey() {
        return date_journey;
    }

    public void setDate_journey(Date date_journey) {
        this.date_journey = date_journey;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "pid", nullable = false)
////    @OnDelete(action = OnDeleteAction.CASCADE)
////    @JsonIgnore
//    private Set<LocalPassenger> f_passengers = new HashSet<>();


//    public List<Passenger> getPassengers() {
//        return passengers;
//    }
//
//    public void setPassengers(List<Passenger> passengers) {
//        this.passengers = passengers;
//    }