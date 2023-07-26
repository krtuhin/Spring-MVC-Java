package com.springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileController {

    //for show image form
    @RequestMapping("/file")
    public String file() {
        return "file_form";
    }

    //for uploading the file
    @RequestMapping(path = "/upload", method = RequestMethod.POST)
    public String submit(@RequestParam("image") CommonsMultipartFile file, HttpSession s, Model model) {

        System.out.println("This is file upload....!");

        //print file information
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getStorageDescription());

        //upload image into server
        String path = s.getServletContext().getRealPath("/WEB-INF") + File.separator
                + "resources" + File.separator + "img" + File.separator + file.getOriginalFilename();

        System.out.println(path);

        byte data[] = file.getBytes();

        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
            System.out.println("File Uploaded...!");

        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("Uploading error...!");
            model.addAttribute("msg", "Uploading error..!");
        }

        //send data to view page
        model.addAttribute("msg", "Uploaded successfully...!");
        model.addAttribute("file", file.getOriginalFilename());

        return "file_success";
    }
}
