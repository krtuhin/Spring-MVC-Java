package com.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@Controller - this annotation used to treat any java class as a Controller class
//@RequestMapping - this annotation used to send requested view to the view resolver
// when use @RequestMapping on class then first write the class url and then method url

@Controller
@RequestMapping("/tk")
public class HomeController {

    //for home page view
    //define request method
    @RequestMapping(path = "/home", method = RequestMethod.GET)
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

        List<String> friends = new ArrayList<>();
        friends.add("Tuhin");
        friends.add("Avijit");
        friends.add("Prince");
        friends.add("Soumya");

        model.addAttribute("friends", friends);

        return "contact";
    }

    //help view with ModelAndView object to send data from controller to view
    @RequestMapping("/help")
    public ModelAndView help() {

        //create model and view object
        ModelAndView modelAndView = new ModelAndView();

        //set data
        modelAndView.addObject("name", "Tuhin");
        modelAndView.setViewName("help");

        LocalDateTime time = LocalDateTime.now();
        modelAndView.addObject("time", time);

        return modelAndView;
    }
}
