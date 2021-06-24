package jp.co.nttdata.example.tour.domain.model;

import java.io.Serializable;

/**
 * 計算結果の料金
 *
 * @author nh.htet
 *
 */
public class PriceCalculateResult implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -331810778908540657L;

	/**
	 * adultUnitPrice
	 */
	private Integer adultUnitPrice;

	/**
	 * childUnitPrice
	 */
	private Integer childUnitPrice;

	/**
	 * adultCount
	 */
	private Integer adultCount;

	/**
	 * childCount
	 */
	private Integer childCount;

	/**
	 * adultPrice
	 */
	private Integer adultPrice;

	/**
	 * childPrice
	 */
	private Integer childPrice;

	/**
	 * sumPrice
	 */
	private Integer sumPrice;

	/**
	 * 空のコンストラクター
	 */
	public PriceCalculateResult() {
		super();
	}

	/**
	 * @return the adultUnitPrice
	 */
	public Integer getAdultUnitPrice() {
		return adultUnitPrice;
	}

	/**
	 * @param adultUnitPrice
	 *            the adultUnitPrice to set
	 */
	public void setAdultUnitPrice(Integer adultUnitPrice) {
		this.adultUnitPrice = adultUnitPrice;
	}

	/**
	 * @return the childUnitPrice
	 */
	public Integer getChildUnitPrice() {
		return childUnitPrice;
	}

	/**
	 * @param childUnitPrice
	 *            the childUnitPrice to set
	 */
	public void setChildUnitPrice(Integer childUnitPrice) {
		this.childUnitPrice = childUnitPrice;
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
	 * @return the adultPrice
	 */
	public Integer getAdultPrice() {
		return adultPrice;
	}

	/**
	 * @param adultPrice
	 *            the adultPrice to set
	 */
	public void setAdultPrice(Integer adultPrice) {
		this.adultPrice = adultPrice;
	}

	/**
	 * @return the childPrice
	 */
	public Integer getChildPrice() {
		return childPrice;
	}

	/**
	 * @param childPrice
	 *            the childPrice to set
	 */
	public void setChildPrice(Integer childPrice) {
		this.childPrice = childPrice;
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

}
