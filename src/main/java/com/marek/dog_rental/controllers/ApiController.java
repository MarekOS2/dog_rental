package com.marek.dog_rental.controllers;

import com.marek.dog_rental.entities.User;
import com.marek.dog_rental.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ApiController {

    private final UserService userService;
    @PostMapping("/users")
    public void addUser(@Valid @RequestBody User user) {
            userService.saveUser(user);
    }

}
