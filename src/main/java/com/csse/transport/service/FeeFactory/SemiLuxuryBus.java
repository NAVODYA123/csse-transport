package com.csse.transport.service.FeeFactory;

public class SemiLuxuryBus extends FeeAbs{

    SemiLuxuryBus(double distance){
        super(2);
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
