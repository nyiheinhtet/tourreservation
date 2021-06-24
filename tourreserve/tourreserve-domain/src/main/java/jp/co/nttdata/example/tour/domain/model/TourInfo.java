/**
 *
 */
package jp.co.nttdata.example.tour.domain.model;

import java.io.Serializable;
import java.util.Date;

import org.joda.time.DateTime;

/**
 * ツアー
 *
 * @author nh.htet
 */
public class TourInfo implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 1801082293541879699L;

	/**
	 * ツアーコード
	 */
	private String tourCode;

	/**
	 * ツアー名称
	 */
	private String tourName;

	/**
	 * 企画番号
	 */
	private String planNo;

	/**
	 * 企画日
	 */
	private Date plannedDay;

	/**
	 * ツアー日数
	 */
	private Integer tourDays;

	/**
	 * 出発日
	 */
	private Date depDay;

	/**
	 * 最大催行人数
	 */
	private Integer avaRecMax;

	/**
	 * ツアー基本料金
	 */
	private Integer basePrice;

	/**
	 * 添乗員オプション
	 */
	private String conductor;

	/**
	 * ツアー概要
	 */
	private String tourAbs;

	/**
	 *
	 */
	private Departure departure;

	/**
	 *
	 */
	private Arrival arrival;

	/**
	 *
	 */
	private Accommodation accommodation;



	/**
	 * 空のコンストラクター
	 */
	public TourInfo() {
		super();
	}

	/**
	 * 指定されたtourCodeを利用してTourInfoオブジェクトを作成する
	 *
	 * @param tourCode
	 */
	public TourInfo(String tourCode) {
		super();
		this.tourCode = tourCode;
	}

	/**
	 * 指定されたtourCode,tourName,tourDays,depDayを利用してTourInfoオブジェクトを作成する
	 *
	 * @param tourCode
	 * @param tourName
	 * @param tourDays
	 * @param depDay
	 */
	public TourInfo(String tourCode, String tourName, Integer tourDays, Date depDay) {
		super();
		this.tourCode = tourCode;
		this.tourName = tourName;
		this.tourDays = tourDays;
		this.depDay = depDay;
	}

	/**
	 * depDayから計算した支払期日をjodaのDateTimeとして取得する。
	 *
	 * @return 支払期日
	 */
	public DateTime getPaymentLimit(Date depDay) {
		// 1.depDayを引数として、DateTimeオブジェクトを作成する。
		DateTime depDayDateTime = new DateTime(depDay);
		// 2. 1.で作成したDateTimeを利用し、その７日前の日付を取得する。
		// 取得した日付を戻り値とする
		return depDayDateTime.minusDays(7);
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
	 * @return the tourName
	 */
	public String getTourName() {
		return tourName;
	}

	/**
	 * @param tourName
	 *            the tourName to set
	 */
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	/**
	 * @return the planNo
	 */
	public String getPlanNo() {
		return planNo;
	}

	/**
	 * @param planNo
	 *            the planNo to set
	 */
	public void setPlanNo(String planNo) {
		this.planNo = planNo;
	}

	/**
	 * @return the plannedDay
	 */
	public Date getPlannedDay() {
		return plannedDay;
	}

	/**
	 * @param plannedDay
	 *            the plannedDay to set
	 */
	public void setPlannedDay(Date plannedDay) {
		this.plannedDay = plannedDay;
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
	 * @return the avaRecMax
	 */
	public Integer getAvaRecMax() {
		return avaRecMax;
	}

	/**
	 * @param avaRecMax
	 *            the avaRecMax to set
	 */
	public void setAvaRecMax(Integer avaRecMax) {
		this.avaRecMax = avaRecMax;
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

	/**
	 * @return the conductor
	 */
	public String getConductor() {
		return conductor;
	}

	/**
	 * @param conductor
	 *            the conductor to set
	 */
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	/**
	 * @return the tourAbs
	 */
	public String getTourAbs() {
		return tourAbs;
	}

	/**
	 * @param tourAbs
	 *            the tourAbs to set
	 */
	public void setTourAbs(String tourAbs) {
		this.tourAbs = tourAbs;
	}

	/**
	 * @return the departure
	 */
	public Departure getDeparture() {
		return departure;
	}

	/**
	 * @param departure
	 *            the departure to set
	 */
	public void setDeparture(Departure departure) {
		this.departure = departure;
	}

	/**
	 * @return the arrival
	 */
	public Arrival getArrival() {
		return arrival;
	}

	/**
	 * @param arrival
	 *            the arrival to set
	 */
	public void setArrival(Arrival arrival) {
		this.arrival = arrival;
	}

	/**
	 * @return the accommodation
	 */
	public Accommodation getAccommodation() {
		return accommodation;
	}

	/**
	 * @param accommodation
	 *            the accommodation to set
	 */
	public void setAccommodation(Accommodation accommodation) {
		this.accommodation = accommodation;
	}

}
