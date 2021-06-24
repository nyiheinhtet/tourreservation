package jp.co.nttdata.example.tour.app.customer;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PasswordEqualsValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return (CustomerForm.class).isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if (errors.hasFieldErrors("customerPass")) {
			return;
		}

		CustomerForm form = (CustomerForm) target;
		String password = form.getCustomerPass();
		String confirmPassword = form.getCustomerConfirmPass();

		if (!password.equals(confirmPassword)) {
			errors.rejectValue("customerPass", "PasswordEqualsValidator.CustomerForm.password",
					"password and confirm password must be same.");
		}

	}

}
