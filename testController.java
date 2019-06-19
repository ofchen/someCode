package com.page.bootstrap.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author chenbeibei7
 * @Date 2019/6/17
 **/
@Controller
public class TestController {
    @RequestMapping("/a")
    public String test1() {
        return "bootstrap";
    }

    @RequestMapping("/b")
    public String test2(){
        return "side";
    }

    @RequestMapping("/c")
    public String test3(){
        return "tag";
    }

    @RequestMapping("/d")
    public String test4(){
        return "navBar";
    }

    @RequestMapping("/e")
    public String test5(){
        return "nav";
    }
    @RequestMapping("/e2")
    public String test52(){
        return "nav2";
    }

    @RequestMapping("/f")
    public String test6(){
        return "label";
    }

    @RequestMapping("/g")
    public String test7(){
        return "webPage";
    }

    @RequestMapping("/h")
    public String test8(){
        return "plugins";
    }
    @RequestMapping("/h2")
    public String test82(){
        return "plugins2";
    }
    @RequestMapping("/h3")
    public String test83(){
        return "plugins3";
    }
    @RequestMapping("/h4")
    public String test84(){
        return "plugins4";
    }

    @RequestMapping("/i")
    public String test9(){
        return "tab";
    }

    @RequestMapping("/j")
    public String test10(){
        return "toolTip";
    }
    
}
