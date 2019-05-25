package com.sellNBye.service;

import com.sellNBye.Exception.InvalidAttributesException;
import com.sellNBye.Exception.ResourceNotFoundException;
import com.sellNBye.Repository.UserRepository;
import com.sellNBye.common.Session;
import com.sellNBye.common.Validator;
import com.sellNBye.model.User;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {

        if (Validator.isValidUser(user)) {
            return userRepository.save(user);
        } else {
            throw new InvalidAttributesException("Invalid User Attributes");
        }
    }

    @Override
    public User updateUser(User user) {

        if (Validator.isValidUser(user))
            return userRepository.save(user);
        else
            throw new InvalidAttributesException("Invalid User Attributes");
    }

    @Override
    public void deleteUser(Long userID) {
    	Optional<User> userToDelete = userRepository.findById(userID);
        if (!userToDelete.isPresent()) {
            throw new ResourceNotFoundException("User ID doesn't exists");
        }

        userRepository.delete(userToDelete.get());
    }

    @Override
    public User getUser(String email) {

        if (userRepository.findByEmail(email) == null) {
            throw new ResourceNotFoundException("User email doesn't exists");
        }

        return userRepository.findByEmail(email);
    }

    @Override
    public User authUserByEmail(String email, String pw) {

        return userRepository.findByEmailAndPw(email, pw);
    }

    @Override
    public User authUserByUname(String uname, String pw) {

        return userRepository.findByUnameAndPw(uname, pw);
    }
}
