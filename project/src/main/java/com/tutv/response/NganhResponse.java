/**
 * @package com.tutv.entity
 * @date Dec 8, 2021
 * @author trinh
 */
package com.tutv.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
/**
 * Nganh
 */

@Entity
public class NganhResponse extends EntityResponse{
	
	/**
	 * Property id
	 */
	@Id
	@Column(name = "id", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property maNganh
	 */
	@Column(name = "ma_nganh", nullable = false, length = 60)
	private String maNganh;
	
	/**
	 * Property tenNganh
	 */
	@Column(name = "ten_nganh", nullable = false, length = 60)
	private String tenNganh;
	
	/**
	 * Property moTa
	 */
	@Column(name = "mo_ta", nullable = true, length = 60)
	private String moTa;
	
	/**
	 * Property id_khoa
	 */
	@Column(name = "id_khoa", columnDefinition = "INT UNSIGNED")
	private Integer idKhoa;
	
	/**
	 * Property idKhoaObj
	 */
	@Transient
	private CommonResponse idKhoaObj;
	
	/**
	 * Constructor
	 */
	public NganhResponse() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public Integer getIdKhoa() {
		return idKhoa;
	}

	public void setIdKhoa(Integer idKhoa) {
		this.idKhoa = idKhoa;
	}

	public CommonResponse getIdKhoaObj() {
		return idKhoaObj;
	}

	public void setIdKhoaObj(CommonResponse idKhoaObj) {
		this.idKhoaObj = idKhoaObj;
	}
	
	
}
