package com.csse.transport.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

///this class handles the route information for all routes
@Entity
public class Route {
    @Id
    ///@GeneratedValue(strategy = GenerationType.AUTO)
    private String RouteID;
    private String OriginID;
    private String DestinationID;
    private float OriginLatitude;
    private float OriginLongitude;
    private float DesLatitude;
    private float DesLongitude;
    private Integer NumberOfStops;


    public String getRouteID() {
        return RouteID;
    }

    public void setRouteID(String routeID) {
        RouteID = routeID;
    }

    public String getOriginID() {
        return OriginID;
    }

    public void setOriginID(String originID) {
        OriginID = originID;
    }

    public String getDestinationID() {
        return DestinationID;
    }

    public void setDestinationID(String destinationID) {
        DestinationID = destinationID;
    }

    public float getOriginLatitude() {
        return OriginLatitude;
    }

    public void setOriginLatitude(float originLatitude) {
        OriginLatitude = originLatitude;
    }

    public float getOriginLongitude() {
        return OriginLongitude;
    }

    public void setOriginLongitude(float originLongitude) {
        OriginLongitude = originLongitude;
    }

    public float getDesLatitude() {
        return DesLatitude;
    }

    public void setDesLatitude(float desLatitude) {
        DesLatitude = desLatitude;
    }

    public float getDesLongitude() {
        return DesLongitude;
    }

    public void setDesLongitude(float desLongitude) {
        DesLongitude = desLongitude;
    }

    public Integer getNumberOfStops() {
        return NumberOfStops;
    }

    public void setNumberOfStops(Integer numberOfStops) {
        NumberOfStops = numberOfStops;
    }
}