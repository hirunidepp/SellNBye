package com.buyandsell.buyandsell.service;

import com.buyandsell.buyandsell.Exception.InvalidAttributesException;
import com.buyandsell.buyandsell.Exception.ResourceNotFoundException;
import com.buyandsell.buyandsell.Repository.UserRepository;
import com.buyandsell.buyandsell.common.Session;
import com.buyandsell.buyandsell.common.Validator;
import com.buyandsell.buyandsell.model.User;
import org.springframework.beans.factory.annotation.Autowired;

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

        if ((Session.getCurrentUser().equals(user) && Validator.isValidUser(user)))
            return userRepository.save(user);
        else
            throw new InvalidAttributesException("Invalid User Attributes");
    }

    @Override
    public void deleteUser(Long userID) {

        if (!userRepository.findById(userID).isPresent()) {
            throw new ResourceNotFoundException("User ID doesn't exists");
        }

        if (Session.getCurrentUser().getId().equals(userID)) {
            userRepository.delete(Session.getCurrentUser());
        }
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
