/**
 * @package dto
 * @date Dec 10, 2021
 * @author trinh
 */
package com.tutv.dto;

import java.sql.Date;


/**
 * HoSoXetTuyenDto
 */
public class HoSoXetTuyenDto extends CommonDto{

	/**
	 * Field serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Property id
	 */
	private Integer id;
	
	/**
	 * Property idTaiKhoan
	 */
	private Integer idTaiKhoan;
	
	/**
	 * Property idTruongThpt10
	 */
	private Integer idTruongThpt10;
	
	/**
	 * Property idTruongThpt11
	 */
	private Integer idTruongThpt11;
	
	/**
	 * Property idTruongThpt12
	 */
	private Integer idTruongThpt12;
	
	private String gioiTinh;
	/**
	 * Property cccd
	 */
	private String cccd;
	
	/**
	 * Property hoTen
	 */
	private String hoTen;
	
	/**
	 * Property ngay_sinh
	 */
	private Date ngaySinh;
	
	/**
	 * Property soDienThoai
	 */
	private String soDienThoai;
	
	/**
	 * Property diaChi
	 */
	private String diaChi;
	
	/**
	 * Property doiTuongUuTien
	 */
	private String doiTuongUuTien;
	
	/**
	 * Property doiTuongUuTien
	 */
	private String khuVucUuTien;
	/**
	 * Property soDienThoaiBo
	 */
	private String soDienThoaiBo;
	
	/**
	 * Property soDienThoai
	 */
	private String soDienThoaiMe;
	
	/**
	 * Property linkimg1
	 */
	private String linkimg1;
	
	/**
	 * Property linkimg2
	 */
	private String linkimg2;
	
	/**
	 * Property linkimg3
	 */
	private String linkimg3;
	
	/**
	 * Constructor
	 */
	public HoSoXetTuyenDto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(Integer idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}

	public Integer getIdTruongThpt10() {
		return idTruongThpt10;
	}

	public void setIdTruongThpt10(Integer idTruongThpt10) {
		this.idTruongThpt10 = idTruongThpt10;
	}

	public Integer getIdTruongThpt11() {
		return idTruongThpt11;
	}

	public void setIdTruongThpt11(Integer idTruongThpt11) {
		this.idTruongThpt11 = idTruongThpt11;
	}

	public Integer getIdTruongThpt12() {
		return idTruongThpt12;
	}

	public void setIdTruongThpt12(Integer idTruongThpt12) {
		this.idTruongThpt12 = idTruongThpt12;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getDoiTuongUuTien() {
		return doiTuongUuTien;
	}

	public void setDoiTuongUuTien(String doiTuongUuTien) {
		this.doiTuongUuTien = doiTuongUuTien;
	}

	public String getSoDienThoaiBo() {
		return soDienThoaiBo;
	}

	public void setSoDienThoaiBo(String soDienThoaiBo) {
		this.soDienThoaiBo = soDienThoaiBo;
	}

	public String getSoDienThoaiMe() {
		return soDienThoaiMe;
	}

	public void setSoDienThoaiMe(String soDienThoaiMe) {
		this.soDienThoaiMe = soDienThoaiMe;
	}

	public String getLinkimg1() {
		return linkimg1;
	}

	public void setLinkimg1(String linkimg1) {
		this.linkimg1 = linkimg1;
	}

	public String getLinkimg2() {
		return linkimg2;
	}

	public void setLinkimg2(String linkimg2) {
		this.linkimg2 = linkimg2;
	}

	public String getLinkimg3() {
		return linkimg3;
	}

	public void setLinkimg3(String linkimg3) {
		this.linkimg3 = linkimg3;
	}

	/**
	 * getGioiTinh
	 *
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}

	/**
	 * setGioiTinh
	 *
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
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
	
}
