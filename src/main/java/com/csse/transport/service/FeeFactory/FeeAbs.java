package com.csse.transport.service.FeeFactory;

import com.csse.transport.model.Fee;
import com.csse.transport.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
abstract public class FeeAbs {

    private double initialPrice;
    private double priceFactor;
    protected double distance;
    private double classFactor;
    private int feeDataId;
    protected Fee feeData;

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

    @Autowired
    protected FeeRepository feeRepository;

    public FeeAbs(int id){
        this.feeDataId = id;
        this.feeData = feeRepository.findById(this.feeDataId);
    }

    public double applyAlgorithm(){
        double result;

        result = initialPrice + (distance * priceFactor);

        return result;
    }

    abstract public double calcFee();

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
