package com.example.txtest.controller;

import com.example.txtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser")
    public String addUser(int courtId, int userId) {
        return userService.addUser(courtId, userId);
    }
    @RequestMapping(value = "/addUserm")
    public String addUser(String courtId, String userId) {
        return userService.addUserm(courtId, userId);
    }
}
