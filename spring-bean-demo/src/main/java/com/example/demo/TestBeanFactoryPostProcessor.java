package com.example.demo;

import com.example.demo.bean.BeanFactoryProcessorTestBean;
import com.example.demo.bean.RegisterTestBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.stereotype.Component;

@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        if (configurableListableBeanFactory instanceof BeanDefinitionRegistry){
            BeanDefinitionBuilder beanDefinitionBuilder =
                    BeanDefinitionBuilder.genericBeanDefinition(BeanFactoryProcessorTestBean.class);

            beanDefinitionBuilder.addPropertyValue("age",18);
            beanDefinitionBuilder.addPropertyValue("name","BeanFactoryProcessorTestBean");

            AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
            BeanDefinitionRegistry registry = (BeanDefinitionRegistry)configurableListableBeanFactory;
            registry.registerBeanDefinition("beanFactoryProcessorTestBean",beanDefinition);
        }
    }
}
