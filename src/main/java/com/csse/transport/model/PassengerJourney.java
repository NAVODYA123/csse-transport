package com.csse.transport.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity(name = "PassengerJourney")
@Table(name = "passenger_journey")
public class PassengerJourney implements Serializable {


    @EmbeddedId
    private PassengerJourneyId id = new PassengerJourneyId();

    @ManyToOne
    @MapsId("JourneyId")
    @JsonIgnore
    private Journey journey;

    @ManyToOne
    @MapsId("PassengerId")

    @JsonIgnore
    private Passenger passenger;

    @Column
    private String origin;
    @Column
    private String destination;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Column
    private  double originLat;
    @Column
    private double originLon;
    @Column
    private double destLat;
    @Column
    private double destLon;
    @Column
    private  double fee;
    @Column
    private boolean status;

    public PassengerJourneyId getId() {
        return id;
    }

    public void setId(PassengerJourneyId id) {
        this.id = id;
    }

    public PassengerJourney(){};

    public PassengerJourney(Journey j, Passenger p){
        this.journey = j;
        this.passenger = p;
        this.id = new PassengerJourneyId(j.getJourneyId(),p.getPid());
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Journey getJourney() {
        return journey;
    }

    public void setJourney(Journey journey) {
        this.journey = journey;
    }


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PassengerJourney that = (PassengerJourney) o;
        return Objects.equals(journey, that.journey) &&
                Objects.equals(passenger, that.passenger);
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(Journey, Passenger);
//    }

}
