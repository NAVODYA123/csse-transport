package com.csse.transport.repository;

import com.csse.transport.model.Fee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeRepository extends CrudRepository<Fee,Integer> {

    public Fee findById(int id);
}
