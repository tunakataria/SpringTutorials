package com.sfg.petclinic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLIfeCycleDemo implements BeanFactoryAware, ApplicationContextAware,BeanNameAware, DisposableBean,InitializingBean{

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## Bean Name has been set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## Bean is destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## After properties has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context has been set"
        );
    }

}
