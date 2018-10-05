package com.csse.transport.service.FeeFactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class FeeFactoryTest {

@Test
    public void test(){

    FeeFactory ff = new FeeFactory(200);

   FeeAbs fa =  ff.getFeeFactory("normal");

  double result = fa.calcFee();
  double expectd = 565.00;


  assertEquals(expectd,result,1);
}

}