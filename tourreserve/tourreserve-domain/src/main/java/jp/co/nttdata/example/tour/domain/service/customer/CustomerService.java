package jp.co.nttdata.example.tour.domain.service.customer;

import jp.co.nttdata.example.tour.domain.model.Customer;

/**
 * 顧客情報を扱うサービスインタフェース
 * @author nh.htet
 *
 */
public interface CustomerService {

	/**
	 * 顧客コードに該当する顧客情報を取得する
	 *
	 * @param customerCode
	 *            取得対象となる顧客情報の顧客コード
	 * @return 指定した顧客コードに該当する顧客情報
	 */
	Customer findOne(String customerCode);

	/**
	 * 顧客情報を新規に登録する その際、パスワードのハッシュ化を行い、顧客コードは自動で採番する
	 *
	 * @param customer
	 *            登録対象となる顧客情報
	 * @param rawPassword
	 *            ハッシュ化していない平文のパスワード
	 * @return 登録した顧客情報 自動採番した顧客コード、ハッシュ化したパスワードが設定された状態となる
	 */
	Customer customerRegister(Customer customer, String rawPassword);

	void update(Customer customer);
}
