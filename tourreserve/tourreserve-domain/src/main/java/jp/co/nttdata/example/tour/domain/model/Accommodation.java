package jp.co.nttdata.example.tour.domain.model;

import java.io.Serializable;

/**
 * 宿泊施設
 *
 * @author nh.htet
 *
 */
public class Accommodation implements Serializable {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -5915093029883658937L;

	/**
	 * 宿泊施設コード
	 */
	private String accomCode;

	/**
	 * 宿泊施設名称
	 */
	private String accomName;

	/**
	 * 宿泊施設電話番号
	 */
	private String accomTel;

	/**
	 * 空のコンストラクター
	 */
	public Accommodation() {
		super();
	}

	/**
	 * @return the accomCode
	 */
	public String getAccomCode() {
		return accomCode;
	}

	/**
	 * @param accomCode
	 *            the accomCode to set
	 */
	public void setAccomCode(String accomCode) {
		this.accomCode = accomCode;
	}

	/**
	 * @return the accomName
	 */
	public String getAccomName() {
		return accomName;
	}

	/**
	 * @param accomName
	 *            the accomName to set
	 */
	public void setAccomName(String accomName) {
		this.accomName = accomName;
	}

	/**
	 * @return the accomTel
	 */
	public String getAccomTel() {
		return accomTel;
	}

	/**
	 * @param accomTel
	 *            the accomTel to set
	 */
	public void setAccomTel(String accomTel) {
		this.accomTel = accomTel;
	}

}
