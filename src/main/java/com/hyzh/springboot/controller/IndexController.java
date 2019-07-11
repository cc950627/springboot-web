package com.hyzh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(Model model) {
        model.addAttribute("message","success03");
        return "index";
    }
}
