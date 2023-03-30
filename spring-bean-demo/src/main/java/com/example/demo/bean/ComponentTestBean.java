package com.example.demo.bean;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Data
public class ComponentTestBean {

    private Integer age = 18;

    private String name = "componentTestBean";

}
