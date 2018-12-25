package com.xzc.blog.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import javax.annotation.PostConstruct;

/**
 * @Classname SpringContextUtil
 * @Description TODO
 * @Date 2018/12/22 18:45
 * @Created by xzcawl
 */
public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        applicationContext = context;
    }

    public static Object getBean(String id) {
        return applicationContext.getBean(id);
    }

    public static <T> T getBean(Class<T> targetType) {
        return applicationContext.getBean(targetType);
    }

    @PostConstruct
    public void init() {
        String[] beans = applicationContext.getBeanDefinitionNames();
        for(String _$ : beans) {
            System.out.print("\n[SpringContextUtil] ************* beanId:" + _$);
        }
    }

    /**
     *
     *
     * @param location
     * @return
     */
    public static Resource getResource(String location) {
        return applicationContext.getResource(location);
    }

    /**
     * 获取所有bean的id数组
     * @return
     */
    public static String[] getAllBeanIds() {
        String[] beans = applicationContext.getBeanDefinitionNames();
        return beans;
    }

}