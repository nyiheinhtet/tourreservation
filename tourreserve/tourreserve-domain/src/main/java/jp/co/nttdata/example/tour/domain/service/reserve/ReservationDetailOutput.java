package jp.co.nttdata.example.tour.domain.service.reserve;

import java.io.Serializable;
import java.util.Date;

import jp.co.nttdata.example.tour.domain.model.Customer;
import jp.co.nttdata.example.tour.domain.model.PriceCalculateResult;
import jp.co.nttdata.example.tour.domain.model.Reserve;

/**
 * 取得結果予約情報
 *
 * @author nh.htet
 *
 */
public class ReservationDetailOutput implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 759663978097822637L;

	/**
	 * priceCalculateResult
	 */
	private PriceCalculateResult priceCalculateResult;

	/**
	 * reserve
	 */
	private Reserve reserve;

	/**
	 * customer
	 */
	private Customer customer;

	/**
	 * paymentTimeLimit
	 */
	private Date paymentTimeLimit;

	/**
	 * limitExceeding
	 */
	private Boolean limitExceeding;

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

	/**
	 * @return the reserve
	 */
	public Reserve getReserve() {
		return reserve;
	}

	/**
	 * @param reserve
	 *            the reserve to set
	 */
	public void setReserve(Reserve reserve) {
		this.reserve = reserve;
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
	 * @return the paymentTimeLimit
	 */
	public Date getPaymentTimeLimit() {
		return paymentTimeLimit;
	}

	/**
	 * @param paymentTimeLimit
	 *            the paymentTimeLimit to set
	 */
	public void setPaymentTimeLimit(Date paymentTimeLimit) {
		this.paymentTimeLimit = paymentTimeLimit;
	}

	/**
	 * @return the limitExceeding
	 */
	public Boolean getLimitExceeding() {
		return limitExceeding;
	}

	/**
	 * @param limitExceeding
	 *            the limitExceeding to set
	 */
	public void setLimitExceeding(Boolean limitExceeding) {
		this.limitExceeding = limitExceeding;
	}

}
