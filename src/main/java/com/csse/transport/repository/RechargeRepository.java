package com.csse.transport.repository;

import com.csse.transport.model.Recharge;
import org.springframework.data.repository.CrudRepository;

public interface RechargeRepository extends CrudRepository<Recharge,Integer> {
    public  Recharge findByRechargeid(String rechargeid);
}
