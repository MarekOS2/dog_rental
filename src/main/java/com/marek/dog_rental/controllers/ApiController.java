package com.marek.dog_rental.controllers;

import com.marek.dog_rental.entities.User;
import com.marek.dog_rental.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ApiController {

    private final UserService userService;
    @PostMapping("/users")
    public void addUser(@Valid @RequestBody User user) {
            userService.saveUser(user);
    }

}
