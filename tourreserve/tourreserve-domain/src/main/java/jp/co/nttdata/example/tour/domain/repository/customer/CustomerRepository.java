package jp.co.nttdata.example.tour.domain.repository.customer;

import jp.co.nttdata.example.tour.domain.model.Customer;

/**
 *
 * @author nh.htet
 *
 */
public interface CustomerRepository {

	/**
	 * 顧客コードに該当する顧客情報を取得する
	 *
	 * @param customerCode
	 *            取得対象となる顧客情報の顧客コード
	 * @return 指定した顧客コードに該当する顧客情報
	 */
	Customer findOne(String customerCode);

	/**
	 * 顧客情報を登録する
	 *
	 * @param customer
	 *            顧客情報
	 */
	void insert(Customer customer);

	/**
	 * 顧客情報を更新する
	 *
	 * @param customer
	 */
	void update(Customer customer);

}
