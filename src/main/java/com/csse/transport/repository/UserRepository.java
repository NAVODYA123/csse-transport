package com.csse.transport.repository;

import com.csse.transport.model.Passenger;
import com.csse.transport.model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository

public interface UserRepository extends CrudRepository<Passenger,String> {
    @Modifying
    @Query("UPDATE Passenger p SET p.password = :password WHERE p.pid = :pid")
    public int changePassword(@Param("pid") String pid, @Param("password") String password);
}
