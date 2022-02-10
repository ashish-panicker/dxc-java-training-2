package com.dxc.learning.demoapp1.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.dxc.learning.demoapp1.dto.UserDTO;
import com.dxc.learning.demoapp1.model.User;
import com.dxc.learning.demoapp1.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
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
    public ResponseEntity<User> create(@Valid @RequestBody UserDTO userReqObj) {
        // if(bindingResult.hasErrors()) {
        // return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        // }
        log.debug("UserDTO: {}", userReqObj);
        User user = modelMapper.map(userReqObj, User.class);
        user.setCreationDate(LocalDate.now());
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    // @ResponseStatus(HttpStatus.BAD_REQUEST)
    // @ExceptionHandler(MethodArgumentNotValidException.class)
    // public ResponseEntity<Map<String, String>> handleValidationException(
    //         MethodArgumentNotValidException ex) {
    //     BindingResult bindingResult = ex.getBindingResult();
    //     Map<String, String> errors = new HashMap<>();
    //     bindingResult.getAllErrors().forEach(error -> {
    //         String fieldName = ((FieldError) error).getField();
    //         String errorMessage = error.getDefaultMessage();
    //         errors.put(fieldName, errorMessage);
    //     });
    //     errors.put("message", "Validation Failed");
    //     errors.put("status", HttpStatus.BAD_REQUEST.name());
    //     errors.put("code", String.valueOf(HttpStatus.BAD_REQUEST.value()));

    //     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    // }

}
