package com.csse.transport.repository;

import com.csse.transport.model.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger,String>{
    public Passenger findByPid(String pid);
}
