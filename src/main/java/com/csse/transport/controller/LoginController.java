package com.csse.transport.controller;

import com.csse.transport.model.Passenger;
import com.csse.transport.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping(path="/login")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @PostMapping(path="/log")
    public @ResponseBody Passenger login (@RequestBody Map<String, String> body){
        String pid = body.get("pid");
//        System.out.println(pid);
        String password = body.get("password");
//        System.out.println(loginRepository.findByPidAndPassword(pid, password));

        return loginRepository.findByPidAndPassword(pid, password);
    }
}
