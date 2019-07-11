package com.hyzh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(Model model) {
        model.addAttribute("message","master");
        model.addAttribute("message","bran");
        return "index";
    }
}
