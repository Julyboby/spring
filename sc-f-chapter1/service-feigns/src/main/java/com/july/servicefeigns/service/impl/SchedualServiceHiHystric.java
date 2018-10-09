package com.july.servicefeigns.service.impl;

import com.july.servicefeigns.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @program: Spring_Demo
 * @description: SchedualServiceHiHystric
 * @author: July
 * @create: 2018-09-18 11:23
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
