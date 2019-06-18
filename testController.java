package com.page.bootstrap.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName:TestController
 * @Description:
 * @Author chenbeibei7
 * @Date 2019/6/17
 **/
@Controller
public class TestController {
    @RequestMapping("/a")
    public String test1(){
        return "bootstrap";
    }

    @RequestMapping("/b")
    public String test2(){
        return "side";
    }

    @RequestMapping("/c")
    public String test3(){
        return "codeTemp";
    }

    @RequestMapping("/d")
    public String test4(){
        return "navbar";
    }
}
