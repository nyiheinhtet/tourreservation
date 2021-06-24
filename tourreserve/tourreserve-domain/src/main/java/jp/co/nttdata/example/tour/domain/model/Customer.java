package jp.co.nttdata.example.tour.domain.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 顧客
 *
 * @author nh.htet
 *
 */
public class Customer implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 顧客コード
	 */
	private String customerCode;

	/**
	 * 顧客氏名
	 */
	private String customerName;

	/**
	 * 顧客フリガナ
	 */
	private String customerKana;

	/**
	 * 顧客パスワード
	 */
	private String customerPass;

	/**
	 * 顧客生年月日
	 */
	private Date customerBirth;

	/**
	 * 顧客職業
	 */
	private String customerJob;

	/**
	 * 顧客メールアドレス
	 */
	private String customerMail;

	/**
	 * 顧客電話番号
	 */
	private String customerTel;

	/**
	 * 顧客郵便番号
	 */
	private String customerPost;

	/**
	 * 顧客住所
	 */
	private String customerAdd;

	/**
	 * 空のコンストラクター
	 */
	public Customer() {

	}

	/**
	 * 指定されたcustomerCodeを利用してCustomerオブジェクトを作成する
	 *
	 * @param customerCode
	 */
	public Customer(String customerCode) {
		super();
		this.customerCode = customerCode;
	}

	/**
	 * @return the customerCode
	 */
	public String getCustomerCode() {
		return customerCode;
	}

	/**
	 * @param customerCode
	 *            the customerCode to set
	 */
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerKana
	 */
	public String getCustomerKana() {
		return customerKana;
	}

	/**
	 * @param customerKana
	 *            the customerKana to set
	 */
	public void setCustomerKana(String customerKana) {
		this.customerKana = customerKana;
	}

	/**
	 * @return the customerPass
	 */
	public String getCustomerPass() {
		return customerPass;
	}

	/**
	 * @param customerPass
	 *            the customerPass to set
	 */
	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}

	/**
	 * @return the customerBirth
	 */
	public Date getCustomerBirth() {
		return customerBirth;
	}

	/**
	 * @param customerBirth
	 *            the customerBirth to set
	 */
	public void setCustomerBirth(Date customerBirth) {
		this.customerBirth = customerBirth;
	}

	/**
	 * @return the customerJob
	 */
	public String getCustomerJob() {
		return customerJob;
	}

	/**
	 * @param customerJob
	 *            the customerJob to set
	 */
	public void setCustomerJob(String customerJob) {
		this.customerJob = customerJob;
	}

	/**
	 * @return the customerMail
	 */
	public String getCustomerMail() {
		return customerMail;
	}

	/**
	 * @param customerMail
	 *            the customerMail to set
	 */
	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

	/**
	 * @return the customerTel
	 */
	public String getCustomerTel() {
		return customerTel;
	}

	/**
	 * @param customerTel
	 *            the customerTel to set
	 */
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}

	/**
	 * @return the customerPost
	 */
	public String getCustomerPost() {
		return customerPost;
	}

	/**
	 * @param customerPost
	 *            the customerPost to set
	 */
	public void setCustomerPost(String customerPost) {
		this.customerPost = customerPost;
	}

	/**
	 * @return the customerAdd
	 */
	public String getCustomerAdd() {
		return customerAdd;
	}

	/**
	 * @param customerAdd
	 *            the customerAdd to set
	 */
	public void setCustomerAdd(String customerAdd) {
		this.customerAdd = customerAdd;
	}

}
