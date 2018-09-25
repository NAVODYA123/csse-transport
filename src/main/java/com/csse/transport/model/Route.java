package com.csse.transport.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

///this class handles the route information for all routes
@Entity
public class Route {
    @Id
    private int RouteID;
    private String Origin;
    private String Destination;
    private float OriginLatitude;
    private float OriginLongitude;
    private float DesLatitude;
    private float DesLongitude;

    public int getRouteID() {
        return RouteID;
    }

    public void setRouteID(int routeID) {
        RouteID = routeID;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
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
}