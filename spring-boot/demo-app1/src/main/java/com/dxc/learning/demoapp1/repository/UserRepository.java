package com.dxc.learning.demoapp1.repository;

import com.dxc.learning.demoapp1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
