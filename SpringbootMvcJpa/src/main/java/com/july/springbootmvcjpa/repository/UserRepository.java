package com.july.springbootmvcjpa.repository;

import com.july.springbootmvcjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: Spring_Demo
 * @description: UserRepository
 * @author: July
 * @create: 2018-09-05 15:04
 **/

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

}
