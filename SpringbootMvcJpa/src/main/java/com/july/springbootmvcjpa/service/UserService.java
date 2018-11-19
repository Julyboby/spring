package com.july.springbootmvcjpa.service;

import com.july.springbootmvcjpa.model.User;

/**
 * @program: Spring_Demo
 * @description: UserService
 * @author: July
 * @create: 2018-09-05 15:06
 **/
public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
