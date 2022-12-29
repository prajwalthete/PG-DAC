package com.prajwal.serv;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.prajwal.entity.Car;

@Service
public class CarValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Car.class);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", "modelError", "model is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "make", "makeError", "make is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mdate", "dateError", "date is required");

		Car car = (Car) target;
		if (car.getPrice() <= 0) {
			errors.rejectValue("price", "priceError", "price can not be less than 1");
		}

	}

}
