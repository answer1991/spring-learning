package com.answer1991.validation;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

public class Testor {
	private AbstractApplicationContext cxt;

	@Before
	public void init() {
		this.cxt = new ClassPathXmlApplicationContext("validation.xml");
		this.cxt.registerShutdownHook();
	}

	@Test
	public void testWithSpringValidator() {
		People people = new People();
		people.setName("");
		people.setAge(-1);

		DataBinder binder = new DataBinder(people);
		binder.setValidator(new PeopleValidator());
		
		binder.validate();
		
		BindingResult result  = binder.getBindingResult();
		System.out.println(result.getErrorCount());
		
		List<ObjectError> errors = result.getAllErrors();
		for(ObjectError error : errors){
			System.out.println(error.getCode());
		}
	}
	
	@Test
	public void testWithJSR303() {
		People p = new People();
		p.setAge(-1);
		p.setName("1233333333333333333333333");
		
		/*
		MyService myService = this.cxt.getBean("myService", MyService.class);
		Validator validator = myService.getValidator();
		System.out.println(myService.getValidator());
		
		Set<ConstraintViolation<People>> result = myService.getValidator().validate(p);
		*/
		//Validator validator = this.cxt.getBean("validator", LocalValidatorFactoryBean.class);
	}
}
