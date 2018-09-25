package com.csse.transport.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PassengerJourney implements Serializable{

    @Column(name = "journey_id")
    private Long JourneyId;

    public Long getJourneyId() {
        return JourneyId;
    }

    public void setJourneyId(Long journeyId) {
        JourneyId = journeyId;
    }

    public Long getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(Long passengerId) {
        PassengerId = passengerId;
    }

    @Column(name = "passenger_id")
    private Long PassengerId;
}
