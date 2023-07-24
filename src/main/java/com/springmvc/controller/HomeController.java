package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    //contact view with model object to send data into view
    @RequestMapping("/contact")
    public String contact(Model model) {

        model.addAttribute("name", "Tuhin Kumar");
        model.addAttribute("contact", "8985698758");

        return "contact";
    }
}
