package com.example.demo.service;

import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.entity.User;
import com.example.demo.exception.AppException;
import com.example.demo.exception.ErrorCode;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreationRequest request){

        User user = new User();
        if (userRepository.existsByUsername(request.getUsername()))
            throw new RuntimeException("ErrorCode.USER_EXISTED");
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setLastName(request.getLastName());
        user.setFirstName(request.getFirstName());
        user.setDob(request.getDob());
        return userRepository.save(user);
    }
    public List<User> getAllU(){
        return userRepository.findAll();
    }

    public User findById(String userid) {
        return userRepository.findById(userid).orElseThrow(()->new RuntimeException("user not found"));
    }

    public User updateUser(String userId, UserUpdateRequest request) {
       User user = findById(userId);
        user.setPassword(request.getPassword());
        user.setLastName(request.getLastName());
        user.setFirstName(request.getFirstName());
        user.setDob(request.getDob());
        return userRepository.save(user);
    }

    public void deleteUser(String userId) {
         userRepository.deleteById(userId);
    }
}
