package com.csse.transport.service;

import com.csse.transport.model.Fee;
import com.csse.transport.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class FeeService {
    @Autowired
    private FeeRepository feeRepository;


    public Fee getDetail(int id){

        return feeRepository.findById(id);
    }
}
