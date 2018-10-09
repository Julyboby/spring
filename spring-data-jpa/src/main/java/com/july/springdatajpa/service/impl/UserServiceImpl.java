package com.july.springdatajpa.service.impl;

import com.july.springdatajpa.dao.IUserDao;
import com.july.springdatajpa.model.User;
import com.july.springdatajpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public void addUser(User user) {
        User us = new User();
        us.setAge(user.getAge());
        us.setName(user.getName());
        us.setPassword(user.getPassword());
        userDao.save(us);
    }

    @Override
    public void UpdateUser(User user) {
        User us = userDao.findById(user.getId()).orElse(null);
        userDao.updateUser(us.getName(), us.getAge(), us.getPassword(), us.getId());
    }

    @Override
    public void delectUser(User user) {
        userDao.delete(userDao.findById(user.getId()).orElse(null));
        userDao.flush();
    }

    @Override
    public User getUser(Integer id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public Page<User> findByAge(Integer age, Pageable pageable) {
        return userDao.findByAge(age, pageable);
    }

    @Override
    public User findByNameAndAge(String name, Integer age) {
        return userDao.findByNameAndAge(name, age);
    }

    @Override
    public List<User> findByNameLike(String name) {
        return userDao.findByNameContaining(name);
    }
}
