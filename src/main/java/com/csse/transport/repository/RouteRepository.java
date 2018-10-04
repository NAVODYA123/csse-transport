package com.csse.transport.repository;

import com.csse.transport.model.Route;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called routeRepository

public interface RouteRepository extends CrudRepository<Route,Integer> {

    public Route findByRouteID(int RouteID);

    public static final String FIND_ROUTEIDS = "SELECT routeid FROM route";

    @Query(value = FIND_ROUTEIDS, nativeQuery = true)
    public List<Integer> findrouteIds();
}
