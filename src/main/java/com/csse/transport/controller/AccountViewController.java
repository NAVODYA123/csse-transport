package com.csse.transport.controller;
import com.csse.transport.model.Passenger;
import com.csse.transport.repository.ViewAccountRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/accountview")
public class AccountViewController {

    @Autowired
    private ViewAccountRepository viewAccountRepository;

    @GetMapping(path="/getdata")
    public @ResponseBody
    Passenger getPassengersByPid(@RequestParam String pid){
        //This returns a JSON or XML with the users
        return viewAccountRepository.findByPid(pid);
    }
}
