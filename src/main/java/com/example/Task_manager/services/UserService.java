package com.example.Task_manager.services;

import com.example.Task_manager.entities.UserEntity;
import com.example.Task_manager.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> searchUsers(String userName) {
        if (userName != "") {
            return userRepository.findByUserName(userName);
        } else {
            return userRepository.findAll();
        }
    }

}
