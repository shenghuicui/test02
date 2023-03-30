package com.example.demo;

import com.example.demo.bean.ConfigurationTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBeanConfiguration {

    @Bean
    public ConfigurationTestBean configurationTestBean(){
        ConfigurationTestBean configurationTestBean = new ConfigurationTestBean();
        configurationTestBean.setAge(18);
        configurationTestBean.setName("configurationTestBean");
        return configurationTestBean;
    }
}
