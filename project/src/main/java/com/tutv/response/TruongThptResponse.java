/**
 * @package com.tutv.entity
 * @date Dec 9, 2021
 * @author trinh
 */
package com.tutv.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * TruongThpt
 */

@Entity
public class TruongThptResponse {

	/**
	 * Property id
	 */
	@Id
	@Column(name = "id", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property maTruong
	 */
	@Column(name = "ma_truong", nullable = false, length = 60, unique = true)
	private String maTruong;
	
	/**
	 * Property tenTruong
	 */
	@Column(name = "ten_truong", nullable = false, length = 60)
	private String tenTruong;
	
	/**
	 * Property khuVucUuTien
	 */
	@Column(name = "khu_vuc_uu_tien", nullable = false, length = 60)
	private String khuVucUuTien;
	
	/**
	 * Property diemUuTien
	 */
	@Column(name = "diem_uu_tien", nullable = false, length = 60)
	private String diemUuTien;

	/**
	 * Constructor
	 */
	public TruongThptResponse() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}

	public String getKhuVucUuTien() {
		return khuVucUuTien;
	}

	public void setKhuVucUuTien(String khuVucUuTien) {
		this.khuVucUuTien = khuVucUuTien;
	}

	public String getDiemUuTien() {
		return diemUuTien;
	}

	public void setDiemUuTien(String diemUuTien) {
		this.diemUuTien = diemUuTien;
	}
	
	
}
