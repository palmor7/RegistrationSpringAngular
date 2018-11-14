package org.example.testregistration.org.example.testregistration.controllers;

import org.example.testregistration.org.example.testregistration.entities.User;
import org.example.testregistration.org.example.testregistration.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User addUser(@RequestBody User user){
        System.out.println("hellooooooooooooo");
        System.out.println(user);
        return userRepository.save(user);
    }
}
