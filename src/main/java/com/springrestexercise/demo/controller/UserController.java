package com.springrestexercise.demo.controller;

import com.springrestexercise.demo.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/rest")
public class UserController {



    @GetMapping("/users")
    public List<User> getUser(){
        List<User> users = new ArrayList<>();
        users.add(new User("milan","gowda","milano","milan@gmail.cm","123456"));
        users.add(new User("rahul","gowda","rahulo","rahul@gmail.cm","784484"));
        users.add(new User("nikhil","gowda","nikhilno","nikhi@gmail.cm","123456"));
        users.add(new User("vishwa","kumar","vishwo","viahwa@gmail.cm","123456"));
        return users ;
    }

    @PostMapping
    public String createUser(){
        return "createUser";
    }

    @PutMapping
    public String updateUser(){
        return "updateUser";
    }

    @DeleteMapping
    public String deleteUser(){
        return "deleteUser";
    }

}
