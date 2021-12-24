/**
 * @package com.tutv.entity
 * @date Dec 8, 2021
 * @author trinh
 */
package com.tutv.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Khoa
 */
@Entity
public class KhoaResponse extends CommonResponse{

	/**
	 * Property id
	 */
	@Id
	@Column(name = "id", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property maKhoa
	 */
	@Column(name = "ma_khoa", nullable = false, length = 60, unique = true)
	private String maKhoa;
	
	/**
	 * Property tenKhoa
	 */
	@Column(name = "ten_khoa", nullable = false, length = 60)
	private String tenKhoa;
	
	/**
	 * Property moTa
	 */
	@Column(name = "mo_ta", nullable = true, length = 60)
	private String moTa;
	
	/**
	 * Constructor
	 */
	public KhoaResponse() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaKhoa() {
		return maKhoa;
	}

	public void setMaKhoa(String maKhoa) {
		this.maKhoa = maKhoa;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
}
