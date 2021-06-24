package jp.co.nttdata.example.tour.domain.model;

import java.io.Serializable;

/**
 * 目的地
 *
 * @author nh.htet
 *
 */
public class Arrival implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -5519403041270891469L;

	/**
	 * 目的地コード
	 */
	private String arrCode;

	/**
	 * 目的地名称
	 */
	private String arrName;

	/**
	 * 空のコンストラクター
	 */
	public Arrival() {
		super();
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
	 * @return the arrName
	 */
	public String getArrName() {
		return arrName;
	}

	/**
	 * @param arrName
	 *            the arrName to set
	 */
	public void setArrName(String arrName) {
		this.arrName = arrName;
	}

}
