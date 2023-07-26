package com.springmvc.controller;

import com.springmvc.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ComplexController {

    //show form page
    @RequestMapping("/complex")
    public String complex() {

        //create NullPointerException
        String str = null;
        System.out.println(str.length());

        //create NumberFormatException
        String st = "abc";
        System.out.println(Integer.parseInt(st));

        return "complex_form";
    }

    //get data from page
    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String submit(@ModelAttribute Student student, BindingResult result) {

        //checking form errors
        if (result.hasErrors()) {
            return "complex_form";
        }

        System.out.println(student);

        return "show";
    }

    //use of @PathVariable annotation
    @RequestMapping("/user/{userId}/{name}")
    public String path(@PathVariable("userId") int userId, @PathVariable("name") String name) {

        System.out.println("User id : " + userId);
        System.out.println("Name : " + name);

        return "complex_form";
    }

    /*//exception handler page 
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
    }*/
}
