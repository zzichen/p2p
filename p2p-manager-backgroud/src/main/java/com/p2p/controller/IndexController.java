package com.p2p.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xyyxx005 on 2017/12/18.
 */
@RestController
public class IndexController {
    @RequestMapping("/test")
    public String index(){
        return "success";
    }
}
