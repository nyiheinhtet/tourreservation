package jp.co.nttdata.example.tour.app.customer;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.terasoluna.gfw.common.exception.BusinessException;

import jp.co.nttdata.example.tour.domain.model.Customer;
import jp.co.nttdata.example.tour.domain.service.customer.CustomerService;
import jp.co.nttdata.example.tour.domain.service.customer.NotFoundException;

@Controller
@RequestMapping("customer/update/{customerCode}")
public class CustomerUpdateController {

	@Inject
	CustomerService customerService;

	@Inject
	Mapper beanMapper;

	@RequestMapping
	public String updateForm(@PathVariable("customerCode") String customerCode, Model model) {

		try {
			Customer customer = customerService.findOne(customerCode);
			CustomerForm customerForm = new CustomerForm();
			customerForm = beanMapper.map(customer, CustomerForm.class);
			model.addAttribute("customerForm", customerForm);
			Calendar c = new GregorianCalendar();
			c.setTime(customer.getCustomerBirth());
			customerForm.setCustomerBirthYear(c.get(Calendar.YEAR));
			customerForm.setCustomerBirthMonth(c.get(Calendar.MONTH) + 1);
			customerForm.setCustomerBirthDay(c.get(Calendar.DAY_OF_MONTH));
			model.addAttribute("customerCode", customer.getCustomerCode());
		} catch (NotFoundException e) {
			model.addAttribute(e.getResultMessages());
		}


		return "registercustomer/update";
	}

	@RequestMapping(params = "update", method = RequestMethod.POST)
	public String update(CustomerForm form, @PathVariable("customerCode") String customerCode, Model model) {

//		String  customerCode="";
		try {

			Customer customer = new Customer();
			customer = beanMapper.map(form, Customer.class);
			customer.setCustomerCode(customerCode);
			customer.setCustomerBirth(new DateTime(form.getCustomerBirthYear(), form.getCustomerBirthMonth(),
					form.getCustomerBirthDay(), 0, 0, 0).toDate());
			customerService.update(customer);

		} catch (BusinessException e) {
			model.addAttribute(e.getResultMessages());
		}


		// return "redirect:/customers/register?complete";
		return "redirect:/";
	}

}
