package com.springmvc.controller;

import com.springmvc.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String submit(@ModelAttribute Student student) {

        System.out.println(student);

        return "show";
    }
}
