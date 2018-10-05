package com.csse.transport.service.FeeFactory;

import com.csse.transport.model.Fee;
abstract public class FeeAbs {

    private double initialPrice;
    private double priceFactor;
    protected double distance;
    private double classFactor;
    private int feeDataId;
    protected Fee feeData;



    public double applyAlgorithm(){
        double result;

        result = initialPrice + (distance * priceFactor);

        return result;
    }

    abstract public double calcFee();

    public int getFeeDataId() {
        return feeDataId;
    }

    public void setFeeDataId(int feeDataId) {
        this.feeDataId = feeDataId;
    }

    public Fee getFeeData() {
        return feeData;
    }

    public void setFeeData(Fee feeData) {
        this.feeData = feeData;
    }



    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public double getPriceFactor() {
        return priceFactor;
    }

    public void setPriceFactor(double priceFactor) {
        this.priceFactor = priceFactor;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getClassFactor() {
        return classFactor;
    }

    public void setClassFactor(double classFactor) {
        this.classFactor = classFactor;
    }
}
