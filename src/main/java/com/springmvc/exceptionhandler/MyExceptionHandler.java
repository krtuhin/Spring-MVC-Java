package com.springmvc.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ControllerAdvice - used to handle exception for all Coltroller
@ControllerAdvice
public class MyExceptionHandler {

    //exception handler page 
    //when any exception has occured then controller will show this page
    //we can declare particular exception name
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({NullPointerException.class})
    public String exceptionHandlerNull(Model model) {

        model.addAttribute("msg", "NullPointerException has occured....!");

        return "error_page";
    }

    //for Number Format Exception
    //@ResponseStatus - used to show the http satus number
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NumberFormatException.class)
    public String exceptionHandlerNumber(Model model) {

        model.addAttribute("msg", "NumberFormatException has occured..!");

        return "error_page";
    }

    //for all Exception
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Model model) {

        model.addAttribute("msg", "Exception has occured..!");

        return "error_page";
    }
}
