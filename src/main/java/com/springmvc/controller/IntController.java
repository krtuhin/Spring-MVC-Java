package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IntController {

    @RequestMapping("/say")
    public String input() {

        return "home";
    }

    @RequestMapping("/welcome")
    public String welcom(@RequestParam("name") String name, Model model) {

        System.out.println("Name is : " + name);

        model.addAttribute("name", name);

        return "welcome";
    }
}
