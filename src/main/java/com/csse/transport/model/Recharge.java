package com.csse.transport.model;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "Recharge_Details")
public class Recharge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rechargeid;
    private String cusname;
    private String paymenttype;
    private double payamount;
    private  String date_time;









    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype;
    }

    public double getPayamount() {
        return payamount;
    }

    public void setPayamount(double payamount) {
        this.payamount = payamount;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }
}
