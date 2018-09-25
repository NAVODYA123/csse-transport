package com.csse.transport.repository;

import com.csse.transport.model.BusFare;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository

public interface BusFareRepository extends CrudRepository<BusFare,Integer> {
}
