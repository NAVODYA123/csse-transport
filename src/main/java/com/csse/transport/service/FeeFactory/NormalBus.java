package com.csse.transport.service.FeeFactory;

public class NormalBus extends FeeAbs{

    NormalBus(double distance){
        super(1);
        calcFee();
        this.distance = distance;
    }

    @Override
    public double calcFee(){

        setInitialPrice(feeData.getInitialprice());
        setClassFactor(feeData.getClassFactor());

        return applyAlgorithm();
    }
}
