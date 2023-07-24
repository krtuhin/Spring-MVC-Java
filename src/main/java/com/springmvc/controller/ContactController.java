package com.springmvc.controller;

import com.springmvc.models.User;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    //store common data for all page
    @ModelAttribute
    public void commonData(Model model) {

        model.addAttribute("title", "Hello I am Tuhin");

    }

    //method for show form page
    @RequestMapping(path = "/form", method = RequestMethod.GET)
    public String getContact() {

        return "form";
    }

    //send data from view to controller
    //method for get data from form page
    //this is the old method
    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String getData(HttpServletRequest request) {

        //fetch from data using input name
        String name = (String) request.getParameter("name");
        String email = (String) request.getParameter("email");
        String password = (String) request.getParameter("password");

        System.out.println(name + " " + email + " " + password);

        return "";
    }

    //this is the spring method @RequestParam - annotation
    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String getData(
            //get data from view to controller
            @RequestParam("email") String email,
            //required = false, then it will be optional field
            @RequestParam(name = "name", required = false, defaultValue = "Guest User") String name,
            @RequestParam("password") String password,
            Model model) {

        //send data from controller to view
        model.addAttribute("email", email);
        model.addAttribute("name", name);
        model.addAttribute("password", password);

        return "success";
    }

    //this is another spring method @ModelAttribute - annotation
    // it will map automatically the field data into user object 
    //for this the attributes of user class are need to be same as form field name
    @RequestMapping(path = "/processform", method = RequestMethod.POST)
    public String getUserData(@ModelAttribute User user) {

        return "success";
    }
}
