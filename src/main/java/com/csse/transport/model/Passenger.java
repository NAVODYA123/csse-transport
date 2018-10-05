package com.csse.transport.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.*;
import java.io.Serializable;

@Entity
@Table(name = "passenger")
public class Passenger implements Serializable{


    @Id
    @Column(name="pid",columnDefinition="VARCHAR(12)")
    private String pid;
    private String name;
    private String email;
    private String sex;
    private int phoneNo;
    private boolean status;
    private String address;
    private String type;
    private double amountAvailable;
    private String country;   //foreign
    private String startDate;  //foreign
    private String endDate;  //foreign
    private String password;
    private String accLevel;
    private  int loanamount;

    @OneToMany(mappedBy = "passenger", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private Set<PassengerJourney> passengerJourneys;


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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    public int getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(int loanamount) {
        this.loanamount = loanamount;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccLevel() {
        return accLevel;
    }

    public void setAccLevel(String accLevel) {
        this.accLevel = accLevel;
    }

    public Set<PassengerJourney> getPassengerJourneys() {
        return passengerJourneys;
    }

    public void setPassengerJourneys(Set<PassengerJourney> passengerJourneys) {
        this.passengerJourneys = passengerJourneys;
    }
}
