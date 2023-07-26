package com.springmvc.controller;

import com.springmvc.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ComplexController {

    //show form page
    @RequestMapping("/complex")
    public String complex() {
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
}
