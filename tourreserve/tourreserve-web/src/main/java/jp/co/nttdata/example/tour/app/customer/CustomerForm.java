package jp.co.nttdata.example.tour.app.customer;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class CustomerForm implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 3942541381036604314L;

	@NotEmpty
	@Size(min=1,max=20)
	@Pattern(regexp = "^[ァ-ヶー]+$")
	private String customerKana;

	@NotEmpty
	@Size(min=1,max=20)
	@Pattern(regexp = "^[^-~｡-ﾟ]*")
	private String customerName;

	@NotNull
	private Integer customerBirthYear;

	@NotNull
	private Integer customerBirthMonth;

	@NotNull
	private Integer customerBirthDay;

	@NotEmpty
	@Size(min=1,max=40)
	private String customerJob;

	@Email
	@Size(max=30)
	//@Pattern(regexp = "^[A-Za-z0-9]+$")
	private String customerMail;

	@NotEmpty
	@Size(min=4,max=20)
	@Pattern(regexp = "^[A-Za-z0-9]+$")
	private String customerPass;

	@NotEmpty
	@Size(min=4,max=20)
	@Pattern(regexp = "^[A-Za-z0-9]+$")
	private String customerConfirmPass;

	@NotEmpty
	@Size(min=1,max=40)
	@Pattern(regexp = "^[0-9]+$")
	private String customerTel;

	@NotEmpty
	@Size(min=8,max=8)
	@Pattern(regexp = "[0-9]{3}-[0-9]{4}")
	private String customerPost;

	@NotEmpty
	@Size(min=1,max=300)
	private String customerAdd;

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
	 * @return the customerBirthYear
	 */
	public Integer getCustomerBirthYear() {
		return customerBirthYear;
	}

	/**
	 * @param customerBirthYear
	 *            the customerBirthYear to set
	 */
	public void setCustomerBirthYear(Integer customerBirthYear) {
		this.customerBirthYear = customerBirthYear;
	}

	/**
	 * @return the customerBirthMonth
	 */
	public Integer getCustomerBirthMonth() {
		return customerBirthMonth;
	}

	/**
	 * @param customerBirthMonth
	 *            the customerBirthMonth to set
	 */
	public void setCustomerBirthMonth(Integer customerBirthMonth) {
		this.customerBirthMonth = customerBirthMonth;
	}

	/**
	 * @return the customerBirthDay
	 */
	public Integer getCustomerBirthDay() {
		return customerBirthDay;
	}

	/**
	 * @param customerBirthDay
	 *            the customerBirthDay to set
	 */
	public void setCustomerBirthDay(Integer customerBirthDay) {
		this.customerBirthDay = customerBirthDay;
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
	 * @return the customerConfirmPass
	 */
	public String getCustomerConfirmPass() {
		return customerConfirmPass;
	}

	/**
	 * @param customerConfirmPass
	 *            the customerConfirmPass to set
	 */
	public void setCustomerConfirmPass(String customerConfirmPass) {
		this.customerConfirmPass = customerConfirmPass;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerForm [ customerKana=" + customerKana + ", customerName="
				+ customerName + ", customerBirthYear=" + customerBirthYear + ", customerBirthMonth="
				+ customerBirthMonth + ", customerBirthDay=" + customerBirthDay + ", customerJob=" + customerJob
				+ ", customerMail=" + customerMail + ", customerPass=" + customerPass + ", customerConfirmPass="
				+ customerConfirmPass + ", customerTel=" + customerTel + ", customerPost=" + customerPost
				+ ", customerAdd=" + customerAdd + "]";
	}




}
