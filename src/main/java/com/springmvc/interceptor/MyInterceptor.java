package com.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

    //interceptor for pre process
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("This is preHandler...!");

        String name = request.getParameter("name");

        if (name.startsWith("a")) {

            response.setContentType("text/html");
            response.getWriter().print("<h1 style='color: red;'>Invalid name...! try with another..!</h1>");

            return false;
        }

        return true;
    }

    //interceptor for after rander the page
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.println("This Handler after Completion..!");
    }

    //interceptor for post process
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("This is Post Handler..!");
    }
}
