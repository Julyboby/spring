package com.july.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: Spring_Demo
 * @description: HelloService
 * @author: July
 * @create: 2018-09-17 09:55
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * @Description 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符串
     * @Param
     * @return
     * @Date 2018/09/19 17:54
     * @Author July
    **/
    @HystrixCommand(fallbackMethod = "helloError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
    }

    /**
     * @return
     * @Description 这就说明当 service-hi 工程不可用的时候，service-ribbon调用 service-hi的API接口时，会执行快速失败，直接返回一组字符串，而不是等待响应超时，这很好的控制了容器的线程阻塞。
     * @Param
     * @Date 2018/09/18 11:01
     * @Author July
     **/
    public String helloError(String name) {
        return "服务器出现故障" + name;
    }

}
