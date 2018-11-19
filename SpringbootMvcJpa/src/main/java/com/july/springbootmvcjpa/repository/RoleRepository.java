package com.july.springbootmvcjpa.repository;

import com.july.springbootmvcjpa.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: Spring_Demo
 * @description: RoleRepository
 * @author: July
 * @create: 2018-09-05 15:05
 **/
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByRole(String role);

}
