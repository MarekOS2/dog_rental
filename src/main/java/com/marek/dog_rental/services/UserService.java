package com.marek.dog_rental.services;

import com.marek.dog_rental.entities.User;
import com.marek.dog_rental.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
