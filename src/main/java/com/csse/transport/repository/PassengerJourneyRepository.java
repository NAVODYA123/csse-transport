package com.csse.transport.repository;

import com.csse.transport.model.Passenger;
import com.csse.transport.model.PassengerJourney;
import com.csse.transport.model.PassengerJourneyId;
import org.springframework.data.repository.CrudRepository;

public interface PassengerJourneyRepository extends CrudRepository<PassengerJourney,PassengerJourneyId> {

//  public PassengerJourney findByPassengerJourneyIdJourneyIdAndPassengerJourneyIdPassengerId(int jid,String pid);

//  public PassengerJourney findByIdJourneyAndIdPassenger(int jid,String pid);

    public PassengerJourney findByid(PassengerJourneyId id);

}


