package com.sp.spingboot_restfull.controller;

import com.sp.spingboot_restfull.entity.User;
import com.sp.spingboot_restfull.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private UserService userService;
    // build Create User REST API
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    // build get User by id REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
       User user = userService.getUserById(userId);
       return new ResponseEntity<>(user,HttpStatus.CREATED);
    }
    // build Get All Users REST API
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }
    // Build Update User REST API
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id")Long userId,
                                           @RequestBody User user){
        user.setId(userId);
        User updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
     }
     // Build Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id")Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted !",HttpStatus.OK);
    }
}


















