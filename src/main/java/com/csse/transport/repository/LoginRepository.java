package com.csse.transport.repository;

import com.csse.transport.model.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Passenger,String> {
    public Passenger findByPidAndPassword(String pid, String password);
}
