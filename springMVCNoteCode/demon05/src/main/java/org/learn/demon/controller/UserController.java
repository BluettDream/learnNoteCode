package org.learn.demon.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.learn.demon.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/t1")

    public String test1() throws JsonProcessingException {
        ObjectMapper map = new ObjectMapper();
        User user = new User(20,"路飞",1);
        String s = map.writeValueAsString(user);
        System.out.println(user);
        return s;
    }

/**
    *    @GetMapping(value = "/t1")
    *    public String test1(@RequestParam("username") String name, Model model){
    *         System.out.println("前端接收的是："+name);
    *         model.addAttribute("msg",name);
    *         return "hello";
    *    }
    *
    *    @GetMapping(value = "/t2")
    *    public String test2(User user){
    *        System.out.println(user);
    *
    *        return "hello";
    *   }
    */
}
