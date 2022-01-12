package com.magd.springsecurityjpa.repository;

import com.magd.springsecurityjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
