package com.csse.transport.service.FeeFactory;

public class FeeFactory {

    private double distance;

    public FeeFactory(double distance) {
        this.distance = distance;
    }
    public FeeAbs getFeeFactory(String busClass){

        if(busClass == null) return null;

        if(busClass.equalsIgnoreCase("normal")){
            return  new NormalBus(this.distance);
        }
        else if(busClass.equalsIgnoreCase("semi")){
            return new SemiLuxuryBus(this.distance);
        }
        else if(busClass.equalsIgnoreCase("luxury")){
            return new LuxuryBus(distance);
        }
        return null;
    }
}
