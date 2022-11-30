package com.citi.bankuserservice.controller;

import com.citi.bankuserservice.model.dto.User;
import com.citi.bankuserservice.service.KeycloakUserService;
import com.citi.bankuserservice.service.UserService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

    private final KeycloakUserService keycloakUserService;
    private final UserService userService;

    public UserController(KeycloakUserService keycloakUserService, UserService userService) {
        this.keycloakUserService = keycloakUserService;
        this.userService = userService;
    }

    @PostMapping(value = "/register")
    public ResponseEntity createUser(@RequestBody User request) {
        return ResponseEntity.ok(userService.createUser(request));
    }

    @GetMapping
    public ResponseEntity readUsers(Pageable pageable) {
        return ResponseEntity.ok(userService.readUsers(pageable));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity readUser(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.readUser(id));
    }

}