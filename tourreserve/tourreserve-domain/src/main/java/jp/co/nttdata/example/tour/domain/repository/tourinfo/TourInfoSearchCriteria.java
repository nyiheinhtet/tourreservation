package jp.co.nttdata.example.tour.domain.repository.tourinfo;

import java.io.Serializable;
import java.util.Date;

/**
 * ツアー検索条件
 *
 * @author nh.htet
 *
 */
public class TourInfoSearchCriteria implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 4143560402426928830L;

	/**
	 * depDay
	 */
	private Date depDay;

	/**
	 * tourDays
	 */
	private Integer tourDays;

	/**
	 * depCode
	 */
	private String depCode;

	/**
	 * arrCode
	 */
	private String arrCode;

	/**
	 * adultCount
	 */
	private Integer adultCount;

	/**
	 * childCount
	 */
	private Integer childCount;

	/**
	 * basePrice
	 */
	private Integer basePrice;

	/**
	 * @return the depDay
	 */
	public Date getDepDay() {
		return depDay;
	}

	/**
	 * @param depDay
	 *            the depDay to set
	 */
	public void setDepDay(Date depDay) {
		this.depDay = depDay;
	}

	/**
	 * @return the tourDays
	 */
	public Integer getTourDays() {
		return tourDays;
	}

	/**
	 * @param tourDays
	 *            the tourDays to set
	 */
	public void setTourDays(Integer tourDays) {
		this.tourDays = tourDays;
	}

	/**
	 * @return the depCode
	 */
	public String getDepCode() {
		return depCode;
	}

	/**
	 * @param depCode
	 *            the depCode to set
	 */
	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	/**
	 * @return the arrCode
	 */
	public String getArrCode() {
		return arrCode;
	}

	/**
	 * @param arrCode
	 *            the arrCode to set
	 */
	public void setArrCode(String arrCode) {
		this.arrCode = arrCode;
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
	 * @return the basePrice
	 */
	public Integer getBasePrice() {
		return basePrice;
	}

	/**
	 * @param basePrice
	 *            the basePrice to set
	 */
	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}

}
