package jp.co.nttdata.example.tour.domain.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 予約
 *
 * @author nh.htet
 *
 */
public class Reserve implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -5569248715954584510L;

	/**
	 * 振込済み
	 */
	public static final String TRANSFERRED = "1";

	/**
	 * 未振込
	 */
	public static final String NOT_TRANSFERED = "0";

	/**
	 * 予約番号
	 */
	private String reserveNo;

	/**
	 * 予約日
	 */
	private Date reservedDay;

	/**
	 * 大人人数
	 */
	private Integer adultCount;

	/**
	 * 大人人数
	 */
	private Integer childCount;

	/**
	 * 合計料金
	 */
	private Integer sumPrice;

	/**
	 * 振込フラグ
	 */
	private String transfer;

	/**
	 * 備考
	 */
	private String remarks;

	/**
	 * ツアー
	 */
	private TourInfo tourInfo;

	/**
	 * 顧客
	 */
	private Customer customer;

	/**
	 * 空のコンストラクター
	 */
	public Reserve() {
		super();
	}

	/**
	 * 指定されたreserveNoを利用してReserveオブジェクトを作成する
	 *
	 * @param reserveNo
	 */
	public Reserve(String reserveNo) {
		super();
		this.reserveNo = reserveNo;
	}

	/**
	 * @return the reserveNo
	 */
	public String getReserveNo() {
		return reserveNo;
	}

	/**
	 * @param reserveNo
	 *            the reserveNo to set
	 */
	public void setReserveNo(String reserveNo) {
		this.reserveNo = reserveNo;
	}

	/**
	 * @return the reservedDay
	 */
	public Date getReservedDay() {
		return reservedDay;
	}

	/**
	 * @param reservedDay
	 *            the reservedDay to set
	 */
	public void setReservedDay(Date reservedDay) {
		this.reservedDay = reservedDay;
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
	 * @return the sumPrice
	 */
	public Integer getSumPrice() {
		return sumPrice;
	}

	/**
	 * @param sumPrice
	 *            the sumPrice to set
	 */
	public void setSumPrice(Integer sumPrice) {
		this.sumPrice = sumPrice;
	}

	/**
	 * @return the transfer
	 */
	public String getTransfer() {
		return transfer;
	}

	/**
	 * @param transfer
	 *            the transfer to set
	 */
	public void setTransfer(String transfer) {
		this.transfer = transfer;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the tourInfo
	 */
	public TourInfo getTourInfo() {
		return tourInfo;
	}

	/**
	 * @param tourInfo
	 *            the tourInfo to set
	 */
	public void setTourInfo(TourInfo tourInfo) {
		this.tourInfo = tourInfo;
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
