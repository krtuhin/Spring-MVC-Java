package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

    @RequestMapping("/one")
    public String one() {
        System.out.println("This is one handler [/one]");

        //this is redirecting using redirect prefix
        return "redirect:/second";
    }

    @RequestMapping("/second")
    public String two() {
        System.out.println("This is second page handler..[/second]");
        return "";
    }

    //redirecting using Redirect View
    @RequestMapping("/third")
    public RedirectView third() {
        System.out.println("This is third url..[/third]");

        RedirectView redirectView = new RedirectView("second");

        return redirectView;
    }
}
