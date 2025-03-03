package com.journal.journalApp.controller;

import com.journal.journalApp.entity.User;
import com.journal.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createEntry(user);
    }

    @PutMapping("/{userName}")
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable String userName) {
        User userdb = userService.findByUserName(userName);
        if (userdb != null) {
            userdb.setUserName(user.getUserName());
            userdb.setPassword(user.getPassword());
            userService.createEntry(userdb);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}






