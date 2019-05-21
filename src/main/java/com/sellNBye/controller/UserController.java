package com.sellNBye.controller;

import com.sellNBye.Exception.InvalidAttributesException;
import com.sellNBye.Exception.ResourceNotFoundException;
import com.sellNBye.Exception.UserServiceExceptionHandler;
import com.sellNBye.model.User;
import com.sellNBye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public User addUser(@Validated @RequestBody User user) {

        if (user == null)
            throw new ResourceNotFoundException("Invalid User Object");

        return userService.addUser(user);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
    public User updateUser(@Validated @RequestBody final User user) {

        if (user == null)
            throw new ResourceNotFoundException("Invalid User Object");

        return userService.updateUser(user);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam(value = "User_ID", required = true) final Long userId) {

        if (userId < 0)
            throw new InvalidAttributesException("Invalid User ID");

        userService.deleteUser(userId);
    }

    @RequestMapping(value = "/authUser", method = RequestMethod.POST)
    public User authUser(@RequestParam(value = "User_Email", required = true) final String email, @RequestParam(value = "User_PassWord", required = true) final String pw) {

        if ((email == null || email.isEmpty()))
            throw new InvalidAttributesException("Invalid User Email");
        else if (pw == null || pw.isEmpty())
            throw new InvalidAttributesException("Invalid User Password");

        return userService.authUserByEmail(email, pw);
    }

    @RequestMapping(value = "/getUserByEmail", method = RequestMethod.GET)
    public User getUserByEmail(@RequestParam(value = "User_Email", required = true) final String email) {

        if ((email == null || email.isEmpty()))
            throw new InvalidAttributesException("Invalid User Email");

        return userService.getUser(email);
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser(String uname) {

        if ((uname == null || uname.isEmpty()))
            throw new InvalidAttributesException("Invalid User Username");

        return userService.getUser(uname);
    }
}
