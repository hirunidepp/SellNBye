package com.sellNBye.service;

import com.sellNBye.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public User addUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userID);
    public User getUser(String email);
    public User authUserByEmail(String email, String pw);
    public User authUserByUname(String uname, String pw);
}
