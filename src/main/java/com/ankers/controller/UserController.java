package com.ankers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/show")
    @ResponseBody
    public String helloWorld() {
        return "Hello World! 8888";
    }
}
