package com.marek.dog_rental.services;

import com.marek.dog_rental.entities.User;
import com.marek.dog_rental.repositories.UserRepository;
 import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User registerUser() {
        return null;
    }
}
