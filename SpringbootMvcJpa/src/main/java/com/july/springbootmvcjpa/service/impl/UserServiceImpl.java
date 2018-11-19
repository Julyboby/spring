package com.july.springbootmvcjpa.service.impl;

import com.july.springbootmvcjpa.model.Role;
import com.july.springbootmvcjpa.model.User;
import com.july.springbootmvcjpa.repository.RoleRepository;
import com.july.springbootmvcjpa.repository.UserRepository;
import com.july.springbootmvcjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @program: Spring_Demo
 * @description: UserServiceImpl
 * @author: July
 * @create: 2018-09-05 15:07
 **/
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(user);
    }
}
