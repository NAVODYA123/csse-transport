package com.csse.transport.model;

import javax.persistence.*;
import java.util.*;
import java.io.Serializable;

@Entity
@Table(name = "journey")
public class Journey implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int journeyId;
    private String busID;
    private Date date_journey;
    private int routeID;

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    //configuring many to many relationship with passenger
    @OneToMany(mappedBy = "journey", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PassengerJourney> passengerJourneys ;


//    @ManyToOne(fetch = FetchType.EAGER, optional = false)
//    @JoinColumn(name = "RouteID", nullable = false)
//        private Route route;

    public void addPassenger(Passenger pas){
        PassengerJourney pj = new PassengerJourney(this,pas);
        passengerJourneys.add(pj);
        pas.getPassengerJourneys().add(pj);
    }

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

    public Set<PassengerJourney> getPassengerJourneys() {
        return passengerJourneys;
    }

    public void setPassengerJourneys(Set<PassengerJourney> passengerJourneys) {
        this.passengerJourneys = passengerJourneys;
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