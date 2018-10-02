package com.csse.transport.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PassengerJourneyId implements Serializable {
    @Column(name = "journey_id")
    private int JourneyId;

    @Column(name = "passenger_id")
    private String PassengerId;

    public PassengerJourneyId(){}
    public PassengerJourneyId(int jid,String pid){
        this.JourneyId = jid;
        this.PassengerId = pid;
    }
    public int getJourneyId() {
        return JourneyId;
    }

    public void setJourneyId(int journeyId) {
        JourneyId = journeyId;
    }

    public String getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(String passengerId) {
        PassengerId = passengerId;
    }
}
