package jp.co.nttdata.example.tour.domain.model;

import java.io.Serializable;

/**
 * 出発地
 *
 * @author nh.htet
 *
 */
public class Departure implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = 3304640867760131920L;

	/**
	 * 出発地コード
	 */
	private String depCode;

	/**
	 * 出発地名称
	 */
	private String depName;

	/**
	 * 空のコンストラクター
	 */
	public Departure() {
		super();
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
	 * @return the depName
	 */
	public String getDepName() {
		return depName;
	}

	/**
	 * @param depName
	 *            the depName to set
	 */
	public void setDepName(String depName) {
		this.depName = depName;
	}

}
