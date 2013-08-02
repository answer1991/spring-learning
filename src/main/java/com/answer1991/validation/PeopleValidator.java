package com.answer1991.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PeopleValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return People.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", "name is empty");
		People people = (People) target;
		if(0 > people.getAge()) {
			errors.rejectValue("age", "nagativeValue");
		} else if(110 < people.getAge()) {
			errors.rejectValue("age", "too.darn.old");
		}
	}

}
