package com.czt.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController                 //是两个注解的组合，@Controller,@ResponseBody
@RequestMapping("/boots")
public class BootController {

    @GetMapping
    public String getById(){
        System.out.println("spring boot running...");
        return "spring boot running...";
    }
}
