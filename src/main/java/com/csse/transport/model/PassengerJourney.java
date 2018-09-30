package com.csse.transport.model;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "PassengerJourney")
@Table(name = "passenger_journey")
public class PassengerJourney {


    @EmbeddedId
    private PassengerJourneyId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("JourneyId")
    private Journey journey;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("PassengerId")
    private Passenger passenger;

    @Column
    private  double originLat;

    public PassengerJourneyId getId() {
        return id;
    }

    public void setId(PassengerJourneyId id) {
        this.id = id;
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

    @Column
    private double originLon;
    @Column
    private double destLat;
    @Column
    private double destLon;
    @Column
    private  double fee;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//
//        if (o == null || getClass() != o.getClass())
//            return false;
//
//        PassengerJourney that = (PassengerJourney) o;
//        return Objects.equals(Journey, that.Journey) &&
//                Objects.equals(Passenger, that.Passenger);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(Journey, Passenger);
//    }

}
