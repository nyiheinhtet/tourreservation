/**
 *
 */
package jp.co.nttdata.example.tour.app.common.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.joda.time.LocalDate;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class MultiFieldDateValidator implements
		ConstraintValidator<MultiFieldDate, Object> {

	private String yearField;

	private String monthField;

	private String dayField;

	private int check;

	private String message;

	@Override
	public void initialize(MultiFieldDate annotation) {
		this.yearField = annotation.year();
		this.monthField = annotation.month();
		this.dayField = annotation.day();
		this.check = annotation.check();
		this.message = annotation.message();
	}


	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		BeanWrapper beanWrapper = new BeanWrapperImpl(value);
		boolean isValid = false;
		try {
			Object yearFieldValue = beanWrapper.getPropertyValue(yearField);
			Object monthFieldValue = beanWrapper.getPropertyValue(monthField);
			Object dayFieldValue = beanWrapper.getPropertyValue(dayField);
			LocalDate inputLocalDate = new LocalDate(
					Integer.valueOf((String) yearFieldValue),
					Integer.valueOf((String) monthFieldValue),
					Integer.valueOf((String) dayFieldValue));

			LocalDate currentLocalDate = LocalDate.now();

			if (check == MultiFieldDate.AFTER_TODAY) {
				isValid = inputLocalDate.isAfter(currentLocalDate);
			}
			if (check == MultiFieldDate.BEFORE_TODAY) {
				isValid = inputLocalDate.isBefore(currentLocalDate);
			}
			if (check == MultiFieldDate.NONE_CHECK) {
				isValid = true;
			}
		} catch (Exception e) {
			isValid = false;
			e.printStackTrace();
		} finally {
			if (!isValid) {
				context.disableDefaultConstraintViolation();
				context.buildConstraintViolationWithTemplate(message)
						.addPropertyNode(dayField).addConstraintViolation();
			}
		}
		return isValid;
	}

}