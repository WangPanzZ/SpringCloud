package com.hand.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangPan
 * @title HiController
 * @description (描述此类的功能)
 * @date: 2018/5/28 14:41
 */
@RestController
public class HiController {
    @Value("${foo.version}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
