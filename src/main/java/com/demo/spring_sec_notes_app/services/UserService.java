package com.demo.spring_sec_notes_app.services;

import com.demo.spring_sec_notes_app.dtos.UserDTO;
import com.demo.spring_sec_notes_app.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);
}
