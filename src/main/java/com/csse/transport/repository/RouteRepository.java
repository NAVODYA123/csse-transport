package com.csse.transport.repository;

import com.csse.transport.model.Route;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called routeRepository

public interface RouteRepository extends CrudRepository<Route,Integer> {
}
