package com.jap.restDemo.controller;

import com.jap.restDemo.domain.Student;
import com.jap.restDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/addUser")
    public ResponseEntity<?> saveUser(@RequestBody Student student){
        Student student1 = userService.saveUser(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }
    @GetMapping("/user")
    public ResponseEntity<?> getAllUser(){
        List list = userService.getAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
