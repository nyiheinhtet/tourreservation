/**
 *
 */
package jp.co.nttdata.example.tour.domain.model;

import java.io.Serializable;


/**
 * 年齢
 *
 * @author nh.htet
 *
 */
public class Age implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -2391166497157406886L;

	/**
	 * 年齢区分コード
	 */
	private String ageCode;

	/**
	 * 年齢区分名称
	 */
	private String ageName;

	/**
	 * 年齢区分別割引率
	 */
	private Integer ageRate;

	/**
	 * 空のコンストラクター
	 */
	public Age() {
		super();
	}

	/**
	 * 指定されたageCode、ageName、ageRateを利用してAgeオブジェクトを作成する
	 *
	 * @param ageCode
	 * @param ageName
	 * @param ageRate
	 */
	public Age(String ageCode, String ageName, Integer ageRate) {
		super();
		this.ageCode = ageCode;
		this.ageName = ageName;
		this.ageRate = ageRate;
	}

	/**
	 * @return the ageCode
	 */
	public String getAgeCode() {
		return ageCode;
	}

	/**
	 * @param ageCode
	 *            the ageCode to set
	 */
	public void setAgeCode(String ageCode) {
		this.ageCode = ageCode;
	}

	/**
	 * @return the ageName
	 */
	public String getAgeName() {
		return ageName;
	}

	/**
	 * @param ageName
	 *            the ageName to set
	 */
	public void setAgeName(String ageName) {
		this.ageName = ageName;
	}

	/**
	 * @return the ageRate
	 */
	public Integer getAgeRate() {
		return ageRate;
	}

	/**
	 * @param ageRate
	 *            the ageRate to set
	 */
	public void setAgeRate(Integer ageRate) {
		this.ageRate = ageRate;
	}

}
