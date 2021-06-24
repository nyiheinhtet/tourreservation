package jp.co.nttdata.example.tour.domain.service.customer;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.terasoluna.gfw.common.exception.BusinessException;

import jp.co.nttdata.example.tour.domain.model.Customer;
import jp.co.nttdata.example.tour.domain.repository.customer.CustomerRepository;

/**
 * 顧客情報を扱うサービスクラス
 *
 * @author nh.htet
 *
 */
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService{

	/**
	 * DozerのMapper
	 */
	@Inject
	Mapper beanMapper;

	/**
	 *
	 */
	@Inject
	CustomerRepository customerRepository;

	/**
	 * パスワードのハッシュ化を行うためのエンコーダ
	 */
	@Inject
	PasswordEncoder passwordEncoder;

	/**
	 * 顧客コードに該当する顧客情報を取得する
	 *
	 * @param customerCode
	 *            取得対象となる顧客情報の顧客コード
	 * @return 指定した顧客コードに該当する顧客情報
	 */
	@Transactional(readOnly = true)
	public Customer findOne(String customerCode) {

		// 1.customerRepository#findOne(顧客コード) を実行し、顧客情報を取得する。
		// 取得した顧客情報を戻り値とする。
		Customer customer = customerRepository.findOne(customerCode);

		// 1.で存在しない顧客コードが入力された場合、
		// BusinessExceptionをスローする
		if (customer == null) {
//			throw new BusinessException("e.tr.9999");
			throw new NotFoundException("e.tr.9999", "ID" ,customerCode);
		}

		// 1.で存在する顧客コードが入力された場合、
		// 取得した顧客情報を戻り値とする。
		return customer;
	}

	/**
	 * 顧客情報を新規に登録する その際、パスワードのハッシュ化を行い、顧客コードは自動で採番する
	 *
	 * @param customer
	 *            登録対象となる顧客情報
	 * @param rawPassword
	 *            ハッシュ化していない平文のパスワード
	 * @return 登録した顧客情報 自動採番した顧客コード、ハッシュ化したパスワードが設定された状態となる
	 */
	public Customer customerRegister(Customer customer, String rawPassword) {
		// 1.beanMapperを利用し、登録および戻り値となる顧客情報を作成する。
		Customer registerCustomer = beanMapper.map(customer, Customer.class);
		// 2.passwordEncoder#encode(引数で渡された平文のパスワード)を実行し、ハッシュ値を取得する。
		// 取得したハッシュ値を1.で作成した顧客情報に設定する。
		registerCustomer.setCustomerPass(passwordEncoder.encode(rawPassword));
		// customerRepository#insert(顧客情報) を実行し、顧客情報を登録する。
		// 登録した顧客情報を戻り値とする。
		customerRepository.insert(registerCustomer);
		return registerCustomer;
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.update(customer);
	}
}
