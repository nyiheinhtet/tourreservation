package jp.co.nttdata.example.tour.app.customer;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.terasoluna.gfw.common.exception.BusinessException;

import com.fasterxml.jackson.databind.deser.std.DateDeserializers.CalendarDeserializer;

import jp.co.nttdata.example.tour.domain.model.Customer;
import jp.co.nttdata.example.tour.domain.service.customer.CustomerService;
import jp.co.nttdata.example.tour.domain.service.customer.NotFoundException;

@Controller
@RequestMapping("customer/{customerCode}")
public class ReferenceCustomerController {

	@Inject
	CustomerService customerService;

	@Inject
	Mapper beanMapper;

	@RequestMapping(method=RequestMethod.GET)
	public String reference(@PathVariable("customerCode") String customerCode, Model model) {

//		CustomerForm customerForm=new CustomerForm();
		try {
			Customer customer = customerService.findOne(customerCode);
//			CustomerForm customerForm = beanMapper.map(customer, CustomerForm.class);
//			Calendar c = new GregorianCalendar();
//			c.setTime(customer.getCustomerBirth());
//			customerForm.setCustomerBirthYear(c.get(Calendar.YEAR));
//			customerForm.setCustomerBirthMonth(c.get(Calendar.MONTH) + 1);
//			customerForm.setCustomerBirthDay(c.get(Calendar.DAY_OF_MONTH));

			model.addAttribute("customer", customer);
		} catch (NotFoundException e) {
			// TODO: handle exception
//			model.addAttribute("customerForm", new CustomerForm());
			model.addAttribute(e.getResultMessages());
//			return "referencecustomer/detail";
		}

		return "referencecustomer/detail";
	}
}
