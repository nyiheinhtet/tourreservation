package jp.co.nttdata.example.tour.domain.service.tourinfo;

import java.io.Serializable;

import jp.co.nttdata.example.tour.domain.model.Customer;

/**
 * 取得対象ツアー情報
 *
 * @author nh.htet
 *
 */
public class TourDetailInput implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -787940215406592018L;

	/**
	 * ツアーコード
	 */
	private String tourCode;

	/**
	 * 大人の人数
	 */
	private Integer adultCount;

	/**
	 * 小人の人数
	 */
	private Integer childCount;

	/**
	 * 顧客
	 */
	private Customer customer;

	/**
	 * 空のコンストラクター
	 */
	public TourDetailInput() {
		super();
	}

	/**
	 * @return the tourCode
	 */
	public String getTourCode() {
		return tourCode;
	}

	/**
	 * @param tourCode
	 *            the tourCode to set
	 */
	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}

	/**
	 * @return the adultCount
	 */
	public Integer getAdultCount() {
		return adultCount;
	}

	/**
	 * @param adultCount
	 *            the adultCount to set
	 */
	public void setAdultCount(Integer adultCount) {
		this.adultCount = adultCount;
	}

	/**
	 * @return the childCount
	 */
	public Integer getChildCount() {
		return childCount;
	}

	/**
	 * @param childCount
	 *            the childCount to set
	 */
	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
