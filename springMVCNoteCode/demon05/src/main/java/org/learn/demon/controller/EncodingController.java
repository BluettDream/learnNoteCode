package org.learn.demon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncodingController {

    @RequestMapping(value = "/e1/t1")
    public String test1(String name, Model model){
        model.addAttribute("msg",name);
        System.out.println(name);
        return "hello";
    }
}
