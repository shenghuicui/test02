package com.example.demo;

import com.example.demo.bean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = "com.example.demo")
@ImportResource("classpath:XmlTestBean.xml")
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

        BeanFactoryProcessorTestBean bean = run.getBean(BeanFactoryProcessorTestBean.class);

        System.out.println(bean);
    }

}
