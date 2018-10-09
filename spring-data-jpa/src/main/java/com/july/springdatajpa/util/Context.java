package com.july.springdatajpa.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 类：Context.java
 * 说明：通过接口ApplicationContextAware获得spring上下文
 */
public class Context implements ApplicationContextAware {

    private static ApplicationContext ctx;

    //设置ApplicationContext对象
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        // TODO Auto-generated method stub
        ctx = context;
    }

    //通过beanName获得实例
    public static Object getBean(String beanName) {
        return ctx.getBean(beanName);
    }
}
