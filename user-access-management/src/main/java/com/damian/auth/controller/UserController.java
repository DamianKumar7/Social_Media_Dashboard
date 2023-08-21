package com.damian.auth.controller;


import com.damian.auth.DTO.LoginRequest;
import com.damian.auth.DTO.RegistrationRequest;
import com.damian.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    @ResponseBody
    public ResponseEntity<String> registerUser(@RequestBody RegistrationRequest registrationRequest){
        boolean successfulRegistration = userService.registerUser(registrationRequest);
        if(successfulRegistration){
            return new ResponseEntity<>("User Created Successfully",HttpStatus.OK);
        }
        return new ResponseEntity<>("User with this email already exists",HttpStatus.CONFLICT);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<String> getUserProfile(@PathVariable Long id){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
