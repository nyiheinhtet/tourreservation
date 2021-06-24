package jp.co.nttdata.example.tour.app.tourinfo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.terasoluna.gfw.common.codelist.ExistInCodeList;

import jp.co.nttdata.example.tour.app.common.validation.MultiFieldDate;

@MultiFieldDate(year = "departureYear", month = "departureMonth", day = "departureDate", check = MultiFieldDate.AFTER_TODAY, message = "{error.common.00003}")
public class SearchTourForm implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -2399005349672612478L;

	@NotNull
	@ExistInCodeList(codeListId = "CL_DEPYEAR")
	private String departureYear;

	@NotNull
	@ExistInCodeList(codeListId = "CL_MONTH")
	private String departureMonth;

	@NotNull
	@ExistInCodeList(codeListId = "CL_DAY")
	private String departureDate;

	@NotNull
	private Integer tourDays;

	@NotEmpty
	private String depCode;

	@NotEmpty
	private String arrCode;

	@NotNull
	private Integer adultCount;

	@NotNull
	private Integer childCount;

	@NotNull
	private Integer basePrice;

	/**
	 *
	 */
	public SearchTourForm() {
		super();
	}

	/**
	 * @return the departureYear
	 */
	public String getDepartureYear() {
		return departureYear;
	}

	/**
	 * @param departureYear
	 *            the departureYear to set
	 */
	public void setDepartureYear(String departureYear) {
		this.departureYear = departureYear;
	}

	/**
	 * @return the departureMonth
	 */
	public String getDepartureMonth() {
		return departureMonth;
	}

	/**
	 * @param departureMonth
	 *            the departureMonth to set
	 */
	public void setDepartureMonth(String departureMonth) {
		this.departureMonth = departureMonth;
	}

	/**
	 * @return the departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate
	 *            the departureDate to set
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
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
