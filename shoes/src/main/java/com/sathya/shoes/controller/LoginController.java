package com.sathya.shoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sathya.shoes.model.User;
import com.sathya.shoes.service.UserService;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

   
    @GetMapping("/")
    public String showLoginPage() {
        return "login"; 
    }

   
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        User user = userService.login(username, password);

        if (user != null) {
            return "redirect:/sathya";   
        } else {
            return "login"; 
        }
    }
}
