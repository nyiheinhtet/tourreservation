package jp.co.nttdata.example.tour.domain.service.userdetails;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jp.co.nttdata.example.tour.domain.model.Customer;
import jp.co.nttdata.example.tour.domain.repository.customer.CustomerRepository;

/**
 *
 * @author nh.htet
 *
 */
@Service
public class ReservationUserDetailsService implements UserDetailsService {

	@Inject
	CustomerRepository customerRepository;

	/**
	 * 指定したユーザID（username）に該当するユーザ情報を取得する
	 *
	 * @param username
	 *            ユーザID
	 * @return 指定したユーザID（username）に該当するユーザ情報
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Customer customer = customerRepository.findOne(username);
		if (customer == null) {
			throw new UsernameNotFoundException(username + " is not found.");
		}
		ReservationUserDetails reservationUserdetails = new ReservationUserDetails(customer, getAuthorities(customer));
		return reservationUserdetails;
	}

	/**
	 * 指定された顧客情報を利用し、SpringSecurityの認可情報を取得する 今回は全ユーザで一律"ROLE_USER"というロールを付与することとする
	 *
	 * @param customer
	 *            顧客情報
	 * @return 認可情報
	 */
	private Collection<GrantedAuthority> getAuthorities(Customer customer) {
		return AuthorityUtils.createAuthorityList("ROLE_USER");
	}

}
