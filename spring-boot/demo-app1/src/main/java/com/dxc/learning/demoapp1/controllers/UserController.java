package com.dxc.learning.demoapp1.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.dxc.learning.demoapp1.dto.UserDTO;
import com.dxc.learning.demoapp1.model.User;
import com.dxc.learning.demoapp1.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping({"", "/"})
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @PostMapping({"", "/"})
    public ResponseEntity<User> create(@RequestBody UserDTO userReqObj) {
        User user = modelMapper.map(userReqObj, User.class);
        user.setCreationDate(LocalDate.now());
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
