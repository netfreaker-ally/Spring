package com.techwave.Models.Pojos;

import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DateValidation implements ConstraintValidator<dateOfRegistration, LocalDate> {

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value.compareTo(LocalDate.of(2020, 01, 01)) <=0) {

			return false;

		} else

			return true;

	}
}
