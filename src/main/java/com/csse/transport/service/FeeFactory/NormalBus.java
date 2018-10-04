package com.csse.transport.service.FeeFactory;

import com.csse.transport.controller.FeeController;
import com.csse.transport.service.FeeService;

public class NormalBus extends FeeAbs{

    NormalBus(double distance){
        super();
        calcFee();
        this.distance = distance;
    }
    FeeService fc = new FeeService();
    @Override
    public double calcFee(){

        setInitialPrice(fc.getDetail(1).getInitialprice());
        setClassFactor(fc.getDetail(1).getClassFactor());

        return getClassFactor()*applyAlgorithm();
    }
}
