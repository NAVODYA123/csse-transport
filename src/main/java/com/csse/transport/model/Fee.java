package com.csse.transport.model;

import javax.persistence.*;

@Entity
@Table(name = "fee")
public class Fee{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double initialprice;
    private double priceFactor;
    private double classFactor;
    private String BusClass;
    private String userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getInitialprice() {
        return initialprice;
    }

    public void setInitialprice(double initialprice) {
        this.initialprice = initialprice;
    }

    public double getPriceFactor() {
        return priceFactor;
    }

    public void setPriceFactor(double priceFactor) {
        this.priceFactor = priceFactor;
    }

    public double getClassFactor() {
        return classFactor;
    }

    public void setClassFactor(double classFactor) {
        this.classFactor = classFactor;
    }

    public String getBusClass() {
        return BusClass;
    }

    public void setBusClass(String busClass) {
        BusClass = busClass;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
