package com.csse.transport.service;

import com.csse.transport.model.Fee;
import com.csse.transport.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeeService {
    @Autowired
    private FeeRepository feeRepository;


    public Fee getDetail(int id){

        return feeRepository.findById(id);
    }
}
