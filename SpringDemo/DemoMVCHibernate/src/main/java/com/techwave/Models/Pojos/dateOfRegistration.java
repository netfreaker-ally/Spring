package com.techwave.Models.Pojos;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = DateValidation.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface dateOfRegistration {

	public String message() default "Date must be greater than 01-Jan-2020";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
