package com.jpm.chatbot.com.jpm.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
        @RequestMapping("/")
        @ResponseBody
        String hello() {
            return "Hello World!";
        }
}
