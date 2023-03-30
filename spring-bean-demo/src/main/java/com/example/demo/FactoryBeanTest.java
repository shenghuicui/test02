package com.example.demo;

import com.example.demo.bean.TestFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanTest implements FactoryBean<TestFactoryBean> {
    @Override
    public TestFactoryBean getObject() throws Exception {
        TestFactoryBean testFactoryBean = new TestFactoryBean();
        testFactoryBean.setAge(18);
        testFactoryBean.setName("testFactoryBean");
        return testFactoryBean;
    }

    @Override
    public Class<?> getObjectType() {
        return TestFactoryBean.class;
    }
}
