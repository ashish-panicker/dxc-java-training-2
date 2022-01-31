package com.dxc.learning.demoapp1.service;

import java.util.List;
import java.util.Optional;
import com.dxc.learning.demoapp1.model.User;

public interface UserService {

    public User getUserById(int id);

    public User getUserByEmail(String email);

    public User createUser(User user);

    public User updateUser(User user);

    public void deleteUser(int id);

    public List<User> getAllUsers();

    
}
