package org.learn.demon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloMVC {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("msg","计算结果是：");
        return "forward:/form.jsp";
    }
}
