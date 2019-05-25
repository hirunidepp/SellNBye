package com.sellNBye.common;

import com.sellNBye.model.User;

public class Validator {

    public static Boolean isValidUser(User user) {

        if (user != null)
            if ((user.getName() != null) && !user.getName().isEmpty())
                if ((user.getEmail() != null) && (!user.getEmail().isEmpty()))
                    return (user.getUname() != null) && !user.getUname().isEmpty();
                else
                    return false;
            else
                return false;
        else
            return false;
    }
}
