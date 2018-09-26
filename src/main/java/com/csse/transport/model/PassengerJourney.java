package com.csse.transport.model;

import javax.persistence.*;

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
    @Column
    private double originLon;
    @Column
    private double destLat;
    @Column
    private double destLon;
    @Column
    private  double fee;

}
