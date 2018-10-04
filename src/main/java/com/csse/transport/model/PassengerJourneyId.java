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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassengerJourneyId that = (PassengerJourneyId) o;

        if (!(JourneyId==that.JourneyId)) return false;
        return PassengerId.equals(that.PassengerId);
    }

//    @Override
//    public int hashCode() {
//        int result = JourneyId.;
//        result = 31 * result + PassengerId.hashCode();
//        return result;
//    }
}
