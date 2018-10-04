package com.csse.transport.controller;

import com.csse.transport.model.Journey;
import com.csse.transport.repository.JourneyViewRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/journeyview")
public class JourneyViewControler {

    @Autowired
    private JourneyViewRepositary journeyViewRepositary;

    @GetMapping(path="/getjourney")
    public @ResponseBody
    Journey getJourneyByJourneyId(@RequestParam String  journeyId){
        //This returns a JSON or XML with the users
        int jid = Integer.parseInt(journeyId);
        return  journeyViewRepositary.findByJourneyId(jid);
    }

}
