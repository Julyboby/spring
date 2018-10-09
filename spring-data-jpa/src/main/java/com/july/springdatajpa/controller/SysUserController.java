package com.july.springdatajpa.controller;

import com.july.springdatajpa.model.User;
import com.july.springdatajpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "sysUser")
public class SysUserController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "findAll")
    @ResponseBody
    public List<User> findAll() {
        List<User> users = userService.findAll();
        return users;
    }

    @GetMapping(value = "findPage")
    @ResponseBody
    public Page<User> findPage(@RequestParam(value = "page") int page, @RequestParam(value = "size") int size,
                               @RequestParam(value = "sort") String sort, @RequestParam(value = "age") int age) {
        Pageable pageable = PageRequest.of(page-1, size, Sort.by(Sort.Order.desc(sort)));
        Page<User> pageUser = userService.findByAge(age, pageable);
        return pageUser;
    }

    @PostMapping(value = "doInsert")
    @ResponseBody
    public String doInsert(@RequestParam(value = "password") String password, @RequestParam(value = "name") String name,
                         @RequestParam(value = "age") Integer age) {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        user.setAge(age);
        userService.addUser(user);
        return "200";
    }

    @PutMapping(value = "update")
    @ResponseBody
    public String update(@RequestParam(value = "id") int id, @RequestParam(value = "password") String password,
                       @RequestParam(value = "name") String name, @RequestParam(value = "age") int age){
        User user = userService.getUser(id);
        user.setPassword(password);
        user.setName(name);
        user.setAge(age);
        userService.UpdateUser(user);
        return "200";
    }

    @DeleteMapping(value = "delete")
    @ResponseBody
    public String delete(@RequestParam(value = "id") int id){
        User user = userService.getUser(id);
        userService.delectUser(user);
        return "200";
    }

    @GetMapping(value = "findByNameAndAge")
    @ResponseBody
    public User findByNameAndAge(@RequestParam(value = "name") String name, @RequestParam(value = "age") int age){
        User user = userService.findByNameAndAge(name,age);
        return user;
    }

    @GetMapping(value = "findByNameLike")
    @ResponseBody
    public List<User> findByNameLike(@RequestParam(value = "name") String name){
        List<User> users = userService.findByNameLike(name);
        return users;
    }
}
