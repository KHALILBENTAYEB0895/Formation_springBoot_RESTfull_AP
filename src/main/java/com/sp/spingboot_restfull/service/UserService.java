package com.sp.spingboot_restfull.service;

import com.sp.spingboot_restfull.dto.UserDto;
import com.sp.spingboot_restfull.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long userId);
}
