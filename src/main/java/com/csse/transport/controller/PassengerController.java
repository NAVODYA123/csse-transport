package com.csse.transport.controller;

import com.csse.transport.model.Passenger;
import com.csse.transport.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping(path="/passenger")
public class PassengerController {

    @Autowired
    private PassengerRepository passengerRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewPassenger (@RequestBody Map<String, String> body){

//        String password = body.get("password");
        String pid = body.get("pid");
        String name = body.get("name");
        String email = body.get("email");
        String sex = body.get("sex");
        String phoneNo = body.get("phoneNo");
        int iphoneNo = Integer.parseInt(phoneNo);
        String address = body.get("address");
        String type = body.get("type");
        String amountAvailable = body.get("amountAvailable");
        double damountAvailabale = Double.parseDouble(amountAvailable);
        String country = body.get("country");
        String startDate = "25/09/2018";
        String endDate = "25/09/2018";
        String password = body.get("password");

        Passenger p = new Passenger();
        p.setPid(pid);
        p.setName(name);
        p.setEmail(email);
        p.setSex(sex);
        p.setPhoneNo(iphoneNo);
        p.setAddress(address);
        p.setType(type);
        p.setAmountAvailable(damountAvailabale);
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
