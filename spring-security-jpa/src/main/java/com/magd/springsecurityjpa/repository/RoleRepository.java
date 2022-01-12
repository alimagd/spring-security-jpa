package com.magd.springsecurityjpa.repository;

import com.magd.springsecurityjpa.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
