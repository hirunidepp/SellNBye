package com.sellNBye.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.naming.directory.InvalidAttributesException;

//@ControllerAdvice
public class UserServiceExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public ExceptionMessage invalidUserException(final ResourceNotFoundException ex) {
        return new ExceptionMessage(ex.getMessage());
    }

    @ExceptionHandler(InvalidAttributesException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ExceptionMessage invalidAttributesException(final InvalidAttributesException ex) {
        return new ExceptionMessage(ex.getMessage());
    }
}
