package com.july.springdatajpa.service;

import com.july.springdatajpa.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserService {

    void addUser(User user);

    void UpdateUser(User user);

    void delectUser(User user);

    User getUser(Integer id);

    List<User> findAll();

    Page<User> findByAge(Integer age, Pageable pageable);

    User findByNameAndAge(String name, Integer age);

    List<User> findByNameLike(String name);

}
