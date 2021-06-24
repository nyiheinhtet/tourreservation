package jp.co.nttdata.example.tour.domain.service.tourinfo;

import java.io.Serializable;

import jp.co.nttdata.example.tour.domain.model.Customer;
import jp.co.nttdata.example.tour.domain.model.PriceCalculateResult;
import jp.co.nttdata.example.tour.domain.model.TourInfo;

/**
 * 取得結果ツアー情報
 *
 * @author nh.htet
 *
 */
public class TourDetailOutput implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 2789390996450788540L;

	/**
	 * customer
	 */
	private Customer customer;

	/**
	 * tourInfo
	 */
	private TourInfo tourInfo;

	/**
	 * priceCalculateResult
	 */
	private PriceCalculateResult priceCalculateResult;

	/**
	 * 空のコンストラクター
	 */
	public TourDetailOutput() {
		super();
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
	 * @return the priceCalculateResult
	 */
	public PriceCalculateResult getPriceCalculateResult() {
		return priceCalculateResult;
	}

	/**
	 * @param priceCalculateResult
	 *            the priceCalculateResult to set
	 */
	public void setPriceCalculateResult(PriceCalculateResult priceCalculateResult) {
		this.priceCalculateResult = priceCalculateResult;
	}

}
