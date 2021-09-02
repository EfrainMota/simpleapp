package com.romium.testing.simpleapp.controllers;

import java.util.ArrayList;

import com.romium.testing.simpleapp.models.User;
import com.romium.testing.simpleapp.services.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersService userService;

    @GetMapping()
    public ArrayList<User> getusers(){
        return userService.getUsers();
    }

    @PostMapping()
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }   
}
