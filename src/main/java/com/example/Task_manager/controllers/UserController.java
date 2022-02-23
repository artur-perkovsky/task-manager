package com.example.Task_manager.controllers;

import com.example.Task_manager.entities.UserEntity;
import com.example.Task_manager.repositories.UserRepository;
import com.example.Task_manager.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("users")
public class UserController {

    final UserRepository userRepository;
    final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/")
    public String getAllUsers(Map<String, Object> model) {
        List<UserEntity> users = userRepository.findAll();
        model.put("users", users);
        return "users";
    }

    @GetMapping("/more/{id}")
    public String getUserMore(@PathVariable Long id, Map<String, Object> model) {
        UserEntity user = userRepository.getById(id);
        model.put("user", user);
        return "more";
    }

    @PostMapping("/filter")
    public String filter(@RequestParam String userName, Map<String, Object> model) {
        List<UserEntity> users = userService.searchUsers(userName);
        model.put("users", users);
        return "users";

    }

    @GetMapping("/registration")
    public String registration (){

        return "registration";
    }

    @PostMapping("/registration")
    public String addNewUser(@RequestParam String userName, @RequestParam String password, @RequestParam String firstName,
                             @RequestParam String lastName, @RequestParam String deportment, Map<String, Object> model) {

        UserEntity user = new UserEntity(userName, password, firstName, lastName, deportment);
        userRepository.save(user);

        List<UserEntity> allUsers = userRepository.findAll();
        model.put("users", allUsers);

        return "redirect:/users/";
    }

    @GetMapping("/more/userChange/{id}")
    public String changeUser(@PathVariable Long id, Map<String, Object> model){
        UserEntity user = userRepository.getById(id);
        model.put("user", user);
        return "userChange";
    }

    @PostMapping("/more/userChange/{id}")
    public String changeUserId(@PathVariable Long id, @RequestParam String userName, @RequestParam String password,
                               @RequestParam String firstName, @RequestParam String lastName, @RequestParam String deportment,
                               Map<String, Object> model) {

        UserEntity user = userRepository.getById(id);
        user.setUserName(userName);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        user.setDeportment(deportment);

        userRepository.save(user);

        List<UserEntity> allUsers = userRepository.findAll();
        model.put("users", allUsers);

        return "redirect:/users/";
    }

}
