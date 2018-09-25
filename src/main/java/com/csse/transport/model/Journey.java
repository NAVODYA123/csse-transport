package com.csse.transport.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "journey")
public class Journey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //attributes
   private int jID;
    private  int route;
    private String busID;
    private Date date_journey;
    private  double originLat;
    private double originLon;
    private double destLat;
    private double destLon;
    private  double fee;




    //configuring many to many relationship with passenger
    @ManyToMany(fetch = FetchType.LAZY,
    cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "passenger_journey",
    joinColumns = {@JoinColumn(name="journey_id")},
    inverseJoinColumns = {@JoinColumn(name="passenger_id")})
    private List<Passenger> passengers = new ArrayList<>();


//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "pid", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    private Passenger passengers;

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

    public int getjID() {
        return jID;
    }

    public void setjID(int jID) {
        this.jID = jID;

    }

    public int getRoute() {

        return route;
    }

    public void setRoute(int route) {
        this.route = route;
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

    public double getOriginLat() {
        return originLat;
    }

    public void setOriginLat(double originLat) {
        this.originLat = originLat;
    }

    public double getOriginLon() {
        return originLon;
    }

    public void setOriginLon(double originLon) {
        this.originLon = originLon;
    }

    public double getDestLat() {
        return destLat;
    }

    public void setDestLat(double destLat) {
        this.destLat = destLat;
    }

    public double getDestLon() {
        return destLon;
    }

    public void setDestLon(double destLon) {
        this.destLon = destLon;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
