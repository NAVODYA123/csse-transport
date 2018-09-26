package com.csse.transport.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CordinateMathTest {

    @Test
    public  void test(){
        CordinateMath cm = new CordinateMath();

        double result = cm.calcDistance(6.650631,80.701887,6.933802,79.850090);
        System.out.println(result);
        assertEquals(99181.48,result,100);


    }

}