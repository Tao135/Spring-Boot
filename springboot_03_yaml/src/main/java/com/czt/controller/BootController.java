package com.czt.controller;


import com.czt.config.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boots")
public class BootController {

    //读取yaml数据中的单一数据
    @Value("${country}")
    private String country;

    @Value("${user.name}")
    private String name;

    @Value("${users[0].age}")
    private String age1;

    @Value("${server.port}")
    private String port;

    @Value("${app}")
    private String app;

    //使用自动装配将所有对象封装到Environment对象中
    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById(){
        System.out.println("spring boot running...");
        System.out.println("country => " + country);
        System.out.println("name => " + name);
        System.out.println("age1 => " + age1);
        System.out.println("port => " + port);
        System.out.println("app => " + app);
        System.out.println("------");
        System.out.println(env.getProperty(name));
        System.out.println("------");
        System.out.println(myDataSource);
        return "spring boot running...";
    }
}
