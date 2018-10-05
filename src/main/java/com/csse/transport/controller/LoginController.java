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

    public class LogedUser{
        private String pid;
        private String name;
        private String emial;
        private String accLevel;
        private Boolean auth;
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmial() {
            return emial;
        }

        public void setEmial(String emial) {
            this.emial = emial;
        }

        public String getAccLevel() {
            return accLevel;
        }

        public void setAccLevel(String accLevel) {
            this.accLevel = accLevel;
        }

        public Boolean getAuth() {
            return auth;
        }

        public void setAuth(Boolean auth) {
            this.auth = auth;
        }
    }

    @Autowired
    private LoginRepository loginRepository;

    @PostMapping(path="/log")
    public @ResponseBody LogedUser login (@RequestBody Map<String, String> body){
        LogedUser lg =  new LogedUser();
        try {
            String pid = body.get("pid");
            String password = body.get("password");
            Passenger ps = loginRepository.findByPidAndPassword(pid, password);
            System.out.println(ps);
            if(ps != null){
                lg.setPid(ps.getPid());
                lg.setName(ps.getName());
                lg.setEmial(ps.getEmail());
                lg.setAccLevel(ps.getAccLevel());
                lg.setMessage("User Found");
                lg.setAuth(true);
            }
            System.out.println(ps.getSex());
            System.out.println(lg.getName());

        }catch (Exception ex){
            System.out.println(ex);

            lg.setMessage("No User Found!!!");
            lg.setAuth(false);
        }


        return lg;
    }
}
