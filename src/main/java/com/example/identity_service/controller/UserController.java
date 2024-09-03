package com.example.identity_service.controller;

import com.example.identity_service.dto.UserCreationRequest;
import com.example.identity_service.dto.UserUpdateRequest;
import com.example.identity_service.entity.User;
import com.example.identity_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    User createUser(
            @RequestBody
            @Valid
            UserCreationRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    List<User> getUsers(){
       return userService.getUsers();
    }

    @GetMapping("/{userId}")
    User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    @PutMapping("/{userId")
    User updateUser(
            @PathVariable String userId,
            @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    String deleteUser(
            @PathVariable String userId
    ){
        userService.deleteUser(userId);
        return "user has been delete";
    }
}
