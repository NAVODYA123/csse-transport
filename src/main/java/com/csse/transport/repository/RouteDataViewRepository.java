package com.csse.transport.repository;

import com.csse.transport.model.Route;
import org.springframework.data.repository.CrudRepository;

public interface RouteDataViewRepository extends CrudRepository<Route,Integer> {

    public Route findByRouteID(int RouteID);
}
