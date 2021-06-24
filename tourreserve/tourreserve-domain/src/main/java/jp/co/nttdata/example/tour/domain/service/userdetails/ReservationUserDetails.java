package jp.co.nttdata.example.tour.domain.service.userdetails;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import jp.co.nttdata.example.tour.domain.model.Customer;

/**
 *
 * @author nh.htet
 *
 */
public class ReservationUserDetails extends User {

	/**
	 *
	 */
	private static final long serialVersionUID = 5986767036943501108L;


	private Customer customer;

	public ReservationUserDetails(Customer customer, Collection<? extends GrantedAuthority> authorities) {
		super(customer.getCustomerCode(), customer.getCustomerPass(), true, true, true, true, authorities);
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

}
