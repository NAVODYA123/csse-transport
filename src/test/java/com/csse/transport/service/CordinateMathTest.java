package com.csse.transport.service;

import com.csse.transport.model.BusStop;
import com.csse.transport.model.Journey;
import com.csse.transport.repository.RouteRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class CordinateMathTest {

    @Autowired
   private RouteRepository repo ;
    @Test
    public  void test(){
        CordinateMath cm = new CordinateMath();

        double result = cm.calcDistance(6.650631,80.701887,6.933802,79.850090);
        System.out.println(result);
        assertEquals(99181.48,result,100);


    }

//    @Test
//    public void test2(){
//
//
//        CordinateMath cm2 = new CordinateMath();
//        Journey journey = new Journey();
//        Set<BusStop> set = repo.findByRouteID(98).getBusStop();
//        List bslist  = new ArrayList(set);
//
//      BusStop tbs =   cm2.findNearestHalt(bslist,6.640694, 80.505431);
//        String result = tbs.getTown();
//
//            assertEquals("Pelmadulla",result);
//    }

}