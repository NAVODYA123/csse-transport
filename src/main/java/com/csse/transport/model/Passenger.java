package com.csse.transport.model;

import javax.persistence.*;
import java.util.*;


@Entity
public class Passenger {
    @Id
    @Column(name="pid",nullable = false,unique=true,columnDefinition="VARCHAR(12)")
    private String pid;
    private String name;
    private String email;
    private String sex;
    private int phoneNo;
    private Boolean status;
    private String address;
    private String type;
    private double amountAvailable;
    private String country;   //foreign
    private Date startDate;  //foreign
    private Date endDate;  //foreign

//
//    public Set<Journey> getJourneys() {
//        return journeys;
//    }
//
//    public void setJourneys(Set<Journey> journeys) {
//        this.journeys = journeys;
//    }

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Journey> journeys = new ArrayList<>();

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
