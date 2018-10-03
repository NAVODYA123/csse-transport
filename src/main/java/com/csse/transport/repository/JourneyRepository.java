package com.csse.transport.repository;

import com.csse.transport.model.Journey;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository

public interface JourneyRepository extends CrudRepository<Journey,Integer> {

    public Journey findByjourneyId(int journeyId);

//    public Journey findByBusIDAndDate_journeyAAndRouteID(String BusID, Date d, int routeID);
}
