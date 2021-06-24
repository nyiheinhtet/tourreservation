package jp.co.nttdata.example.tour.app.customer;

import java.util.Date;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.terasoluna.gfw.web.token.transaction.TransactionTokenCheck;
import org.terasoluna.gfw.web.token.transaction.TransactionTokenType;

import jp.co.nttdata.example.tour.domain.model.Customer;
import jp.co.nttdata.example.tour.domain.service.customer.CustomerService;

@Controller
@RequestMapping("customers/register")
public class RegisterCustomerController {

	/**
	 * CustomerService
	 */
	@Inject
	CustomerService customerService;

	@Inject
	Mapper beanMapper;

	@Inject
	PasswordEqualsValidator passwordEqualsValidator;

	@Inject
	CustomerBirthdayValidator customerBirthdayValidator;

	@InitBinder("customerForm")
	protected void InitBinder(WebDataBinder binder) {
		binder.addValidators(passwordEqualsValidator, customerBirthdayValidator);
	}

	/**
	 *
	 * @return
	 */
	@ModelAttribute
	public CustomerForm setupForm() {
		CustomerForm customerForm = new CustomerForm();
		customerForm.setCustomerBirthYear(1980);
		customerForm.setCustomerBirthMonth(01);
		customerForm.setCustomerBirthDay(01);
		return customerForm;
	}

	@RequestMapping(params = "form", method = RequestMethod.GET)
	public String registerForm(CustomerForm form) {
		return "registercustomer/registerForm";
	}

	@RequestMapping(params = "redo", method = RequestMethod.POST)
	public String registerRedo(CustomerForm form, Model model) {
		return "registercustomer/registerForm";
	}

	// @TransactionTokenCheck(type=TransactionTokenType.BEGIN)
	@RequestMapping(params = "confirm", method = RequestMethod.POST)
	public String registerConfirm(@Validated CustomerForm form, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return registerRedo(form, model);
		}
		return "registercustomer/registerConfirm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String register(@Validated CustomerForm form, BindingResult result, RedirectAttributes redirectAttributes,
			Model model) {
		if (result.hasErrors()) {
			return registerRedo(form, model);
		}
		Customer customer = beanMapper.map(form, Customer.class);
		customer.setCustomerBirth(new DateTime(form.getCustomerBirthYear(), form.getCustomerBirthMonth(),
				form.getCustomerBirthDay(), 0, 0, 0).toDate());
		Customer registeredCustomer = customerService.customerRegister(customer, form.getCustomerPass());
		redirectAttributes.addFlashAttribute("customer",registeredCustomer);
		return "redirect:/customers/register?complete";
	}

	@RequestMapping(params = "complete",method = RequestMethod.GET)
	public String registerComplete() {
		return "registercustomer/registerComplete";
	}

}
