package com.csse.transport.controller;

import com.csse.transport.model.Passenger;
import com.csse.transport.repository.PassengerRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping(path="/passenger")
public class PassengerController {

    @Autowired
    private PassengerRepository passengerRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewPassenger (@RequestBody Map<String, String> body){
        String endDate;
        String pid = body.get("pid");
        System.out.println(pid);
        String name = body.get("name");
        String email = body.get("email");
        String sex = body.get("sex");
        String phoneNo = body.get("phoneNo");
        int iphoneNo = Integer.parseInt(phoneNo);
        String address = body.get("address");
        String type = body.get("type");
        String country = body.get("country");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        DateTime dt = new DateTime();
        String startDate = sdf.format(dt.toDate());;
        dt = dt.plusDays(7);

        if(type.equals("foreign")){
             endDate = sdf.format(dt.toDate());
        }
        else{
            endDate = "";
        }
        String password = body.get("password");

        Passenger p = new Passenger();
        p.setPid(pid);
        p.setName(name);
        p.setEmail(email);
        p.setSex(sex);
        p.setPhoneNo(iphoneNo);
        p.setAddress(address);
        p.setType(type);
        p.setAmountAvailable(250);
        p.setCountry(country);
        p.setStartDate(startDate);
        p.setEndDate(endDate);
        p.setPassword(password);
        p.setStatus(true);
        p.setAccLevel("3");

        passengerRepository.save(p);
        return "Passenger Registered successfully";
    }

    @GetMapping(path="/getSpecPassenger")
    public @ResponseBody
    Passenger getPassengersByPid(@RequestParam String pid){
        //This returns a JSON or XML with the users
        return passengerRepository.findByPid(pid);
    }
}
