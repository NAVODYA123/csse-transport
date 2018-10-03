package com.csse.transport.service.FeeFactory;

public class LuxuryBus extends FeeAbs{

    LuxuryBus(double distance){
        super(3);
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
