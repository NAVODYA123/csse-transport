package com.csse.transport.repository;

import com.csse.transport.model.Fee;
import org.springframework.data.repository.CrudRepository;

public interface FeeRepository extends CrudRepository<Fee,Integer> {

    public Fee findById(int id);
}
