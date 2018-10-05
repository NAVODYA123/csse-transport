package com.csse.transport.service.FeeFactory;

import com.csse.transport.controller.FeeController;
import com.csse.transport.service.FeeService;

public class SemiLuxuryBus extends FeeAbs{

    SemiLuxuryBus(double distance){
        super();
        calcFee();
        this.distance = distance;
    }
        FeeService fc = new FeeService();
    @Override
    public double calcFee(){

        setInitialPrice(fc.getDetail(2).getInitialprice());
        setClassFactor(fc.getDetail(2).getClassFactor());

        return getClassFactor()*applyAlgorithm();
    }
}
