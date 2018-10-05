package com.csse.transport.service.FeeFactory;

import com.csse.transport.controller.FeeController;
import com.csse.transport.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


public class NormalBus extends FeeAbs{

    NormalBus(double distance){
        super();
        calcFee();
        this.distance = distance;
    }
    @Autowired
    FeeService fc ;
    @Override
    public double calcFee(){

        setInitialPrice(fc.getDetail(1).getInitialprice());
        setClassFactor(fc.getDetail(1).getClassFactor());

        return getClassFactor()*applyAlgorithm();
    }
}
