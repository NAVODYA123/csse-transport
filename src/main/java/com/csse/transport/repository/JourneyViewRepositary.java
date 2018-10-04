package com.csse.transport.repository;

import com.csse.transport.model.Journey;
import com.csse.transport.model.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface JourneyViewRepositary extends CrudRepository<Journey,Integer> {

    public Journey findByJourneyId(int  journeyId);
}
