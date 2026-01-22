package spr.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spr.api.entity.User;
import spr.api.repositor.UserRepository;


@RestController
@RequestMapping("/api")
@CrossOrigin("*") // Flutter ke liye
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return userRepository.save(user);
    }
}
