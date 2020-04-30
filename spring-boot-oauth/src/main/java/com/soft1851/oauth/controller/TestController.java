package com.soft1851.oauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author F*WT
 * @Date 2020/4/29 11:06
 * @Description
 */
@RestController
public class TestController {
    @RequestMapping("/index")
    public String simpleIndex(){
        return "index";
    }
}
