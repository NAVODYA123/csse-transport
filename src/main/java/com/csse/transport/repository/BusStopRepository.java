package com.csse.transport.repository;

import com.csse.transport.model.BusStop;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called busstopRepository

public interface BusStopRepository extends CrudRepository<BusStop,Integer> {
}
