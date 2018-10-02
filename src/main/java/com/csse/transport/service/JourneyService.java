package com.csse.transport.service;

import com.csse.transport.model.Journey;
import com.csse.transport.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JourneyService implements IJourneyService {

    @Autowired

    private JourneyRepository journeyRepository;

    @Override
    public Journey getJourneyById(int journeyID){

        return  journeyRepository.findByjourneyId(journeyID);

    }
    public synchronized boolean addJourney(Journey journey){
        Journey journ = journeyRepository.findByjourneyId(journey.getJourneyId());

      if(journ.getJourneyId() == journey.getJourneyId()){
          return true;
      }
      else return false;
    }
}
