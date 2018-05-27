package com.hand.service.impl;

import com.hand.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author WangPan
 * @title SchedualServiceHiHystric
 * @description (描述此类的功能)
 * @date: 2018/5/27 15:25
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
