/**
 * @package dto
 * @date Dec 10, 2021
 * @author trinh
 */
package com.tutv.dto;
/**
 * TruongThptDto
 */
public class TruongThptDto extends CommonDto{

	/**
	 * Field serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Property id
	 */
	private Integer id;
	
	/**
	 * Property maTruong
	 */
	private String maTruong;
	
	/**
	 * Property tenTruong
	 */
	private String tenTruong;
	
	/**
	 * Property khuVucUuTien
	 */
	private String khuVucUuTien;
	
	/**
	 * Property diemUuTien
	 */
	private String diemUuTien;

	/**
	 * Constructor
	 */
	public TruongThptDto() {
		super();
	}

	/**
	 * getId
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * setId
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * getMaTruong
	 *
	 * @return the maTruong
	 */
	public String getMaTruong() {
		return maTruong;
	}

	/**
	 * setMaTruong
	 *
	 * @param maTruong the maTruong to set
	 */
	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	/**
	 * getTenTruong
	 *
	 * @return the tenTruong
	 */
	public String getTenTruong() {
		return tenTruong;
	}

	/**
	 * setTenTruong
	 *
	 * @param tenTruong the tenTruong to set
	 */
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}

	/**
	 * getKhuVucUuTien
	 *
	 * @return the khuVucUuTien
	 */
	public String getKhuVucUuTien() {
		return khuVucUuTien;
	}

	/**
	 * setKhuVucUuTien
	 *
	 * @param khuVucUuTien the khuVucUuTien to set
	 */
	public void setKhuVucUuTien(String khuVucUuTien) {
		this.khuVucUuTien = khuVucUuTien;
	}

	/**
	 * getDiemUuTien
	 *
	 * @return the diemUuTien
	 */
	public String getDiemUuTien() {
		return diemUuTien;
	}

	/**
	 * setDiemUuTien
	 *
	 * @param diemUuTien the diemUuTien to set
	 */
	public void setDiemUuTien(String diemUuTien) {
		this.diemUuTien = diemUuTien;
	}

}
