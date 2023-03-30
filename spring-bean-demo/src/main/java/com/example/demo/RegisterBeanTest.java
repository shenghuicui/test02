package com.example.demo;

import com.example.demo.bean.RegisterTestBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class RegisterBeanTest implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        BeanDefinitionBuilder beanDefinitionBuilder =
                BeanDefinitionBuilder.genericBeanDefinition(RegisterTestBean.class);

        beanDefinitionBuilder.addPropertyValue("age",18);
        beanDefinitionBuilder.addPropertyValue("name","registerTestBean");

        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();

        registry.registerBeanDefinition("registerTestBean",beanDefinition);

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
//        BeanDefinitionBuilder beanDefinitionBuilder =
//                BeanDefinitionBuilder.genericBeanDefinition(RegisterTestBean.class);
//
//        beanDefinitionBuilder.addPropertyValue("age",18);
//        beanDefinitionBuilder.addPropertyValue("name","registerTestBean");
//
//        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
//
//        BeanDefinitionRegistry registry = (BeanDefinitionRegistry)configurableListableBeanFactory;
//        registry.registerBeanDefinition("registerTestBean",beanDefinition);
    }
}
