package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller - this annotation used to treat any java class as a Controller class
//@RequestMapping - this annotation used to send requested view to the view resolver

@Controller
public class HomeController {

    //for home page view
    @RequestMapping("/home")
    public String home() {

        System.out.println("This is home url..");

        return "index";
    }

    //for about page view
    @RequestMapping("/about")
    public String about() {

        System.out.println("This is about url...");

        return "about";
    }
}
