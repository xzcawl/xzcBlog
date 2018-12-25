package com.xzc.blog.common.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Classname ConfigProperties
 * @Description TODO
 * @Date 2018/12/22 18:19
 * @Created by xzcawl
 */
public class ConfigProperties extends PropertyPlaceholderConfigurer {

    private final static Map<String, Object> properties = new HashMap<String,Object>();

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props) throws BeansException {
        super.processProperties(beanFactoryToProcess, props);
        for (Object key : props.keySet()) {
            String keyStr = key.toString();
            String value = props.getProperty(keyStr);
            properties.put(keyStr, value);
        }
    }
    public static Object getContextProperty(String key) {
        return properties.get(key);
    }

    public static String getProperty(String key) {
        return String.valueOf(properties.get(key));
    }
}
