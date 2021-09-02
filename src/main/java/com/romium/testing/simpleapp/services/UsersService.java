package com.romium.testing.simpleapp.services;

import java.util.ArrayList;

import com.romium.testing.simpleapp.models.User;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UsersService {

    public ArrayList<User> getUsers() {
        log.info("getUser called");
        return null;
    }

    public User saveUser(User user) {
        log.info("saveUser called");
        return null;
    }
    
}
