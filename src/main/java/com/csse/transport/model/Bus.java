package com.csse.transport.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "bus_Details")
public class Bus {

  @Id
  @Column(name="busId",nullable = false,unique=true,columnDefinition="VARCHAR(15)")
    private String busID;
    private String make;
    private String type;

 @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "RouteID",nullable = false)
 @JsonIgnore
    private Route route;

    private  String OwnerName;


    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

   public Route getRoute() {
       return route;
    }

   public void setRoute(Route route) {
      this.route = route;
   }

    public String getBusID() {
        return busID;
    }

    public void setBusID(String busID) {
        this.busID = busID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
