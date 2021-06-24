package jp.co.nttdata.example.tour.app.customer;

import org.joda.time.DateTime;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class CustomerBirthdayValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return (CustomerForm.class).isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		CustomerForm customerForm = (CustomerForm) target;

		try {
			new DateTime(customerForm.getCustomerBirthYear(), customerForm.getCustomerBirthMonth(),
					customerForm.getCustomerBirthDay(), 0, 0).toDate();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			errors.rejectValue("customerBirthDay", "IncorrectDate", "Incorrect BirthdayDate was entered.");
		}

	}

}
