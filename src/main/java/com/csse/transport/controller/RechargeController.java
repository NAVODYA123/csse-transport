package com.csse.transport.controller;

import com.csse.transport.model.Passenger;
import com.csse.transport.model.Recharge;
import com.csse.transport.repository.PassengerRepository;
import com.csse.transport.repository.RechargeRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Map;

@Controller
@RequestMapping("/Recharge")
public class RechargeController {
    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private RechargeRepository rechargeRepository;


    @PostMapping(path="/addrecharge")
    public @ResponseBody
    String addRecharge ( @RequestBody Map<String, String> body){
        String pid = body.get("pid");
        Passenger  op =passengerRepository.findByPid(pid);
        double amount = op.getAmountAvailable();
        int loanamount=op.getLoanamount();
        String amount_re=body.get("payamount");
        double total = Double.parseDouble(amount_re);
        if(loanamount==0) {
            double t=total+amount;

            String cusname=body.get("cusname");
            String paymenttype=body.get("paymenttype");
            String payamount=body.get("payamount");
            double payamo=Double.parseDouble(payamount);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            DateTime dt = new DateTime();
            String startDate = sdf.format(dt.toDate());
            Recharge r=new Recharge();

            r.setCusname(cusname);
            r.setPaymenttype(paymenttype);
            r.setPayamount(payamo);
            r.setDate_time(startDate);
            rechargeRepository.save(r);

            op.setAmountAvailable(t);
            passengerRepository.save(op);
            return  "succefully credited your account account balance is "+t;
        }
       else if(loanamount==1 && total>200) {
           double current_balance=amount+total-200;

            String cusname=body.get("cusname");
            String paymenttype=body.get("paymenttype");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            DateTime dt = new DateTime();
            String startDate = sdf.format(dt.toDate());
            Recharge r=new Recharge();

            r.setCusname(cusname);
            r.setPaymenttype(paymenttype);
            r.setPayamount(total);
            r.setDate_time(startDate);
            rechargeRepository.save(r);
            op.setAmountAvailable(current_balance);
            op.setLoanamount(0);
            passengerRepository.save(op);


           return "your account is credited current balance is "+current_balance;
        }
        else{
            return "please reload with more than 200 rs to fill your last loan amount";
        }




    }

}
