package com.answer1991.bean.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("print by MyBeanPostProcessor postProcessBeforeInitialization method.. bean [" + beanName + "] inited");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("print by MyBeanPostProcessor postProcessBeforeInitialization method.. bean [" + beanName + "] inited");
		return bean;
	}
	
}
