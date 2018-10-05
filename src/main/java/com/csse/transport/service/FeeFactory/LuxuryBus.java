package com.csse.transport.service.FeeFactory;

import com.csse.transport.service.FeeService;

public class LuxuryBus extends FeeAbs{


    LuxuryBus(double distance){
        super();
        calcFee();
        this.distance = distance;
    }
    FeeService fc = new FeeService();
    @Override
    public double calcFee(){

        setInitialPrice(fc.getDetail(3).getInitialprice());
        setClassFactor(fc.getDetail(3).getClassFactor());

        return getClassFactor()*applyAlgorithm();
    }
}
