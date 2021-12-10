/**
 * @package com.tutv.entity
 * @date Dec 9, 2021
 * @author trinh
 */
package com.tutv.response;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


/**
 * HoSoXetTuyen
 */

@Entity
public class HoSoXetTuyenResponse extends EntityResponse{

	/**
	 * Property id
	 */
	@Id
	@Column(name = "id", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property idTaiKhoan
	 */
	@Column(name = "id_tai_khoan", columnDefinition = "INT UNSIGNED")
	private Integer idTaiKhoan;
	
	/**
	 * Property idTaiKhoanObj
	 */
	@Transient
	private CommonResponse idTaiKhoanObj;
	
	/**
	 * Property idTruongThpt10
	 */
	@Column(name = "id_truong_thpt10", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer idTruongThpt10;
	
	/**
	 * Property idTruongThpt10Obj
	 */
	@Transient
	private CommonResponse idTruongThpt10Obj;
	
	/**
	 * Property idTruongThpt11
	 */
	@Column(name = "id_truong_thpt11", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer idTruongThpt11;
	
	/**
	 * Property idTruongThpt11Obj
	 */
	@Transient
	private CommonResponse idTruongThpt11Obj;
	
	/**
	 * Property idTruongThpt12
	 */
	@Column(name = "id_truong_thpt12", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer idTruongThpt12;
	
	/**
	 * Property idTruongThpt12Obj
	 */
	@Transient
	private CommonResponse idTruongThpt12Obj;
	
	/**
	 * Property cccd
	 */
	@Column(name = "cccd", nullable = false, length = 60)
	private String cccd;
	
	/**
	 * Property hoTen
	 */
	@Column(name = "ho_ten", nullable = false, length = 60)
	private String hoTen;
	
	/**
	 * Property ngay_sinh
	 */
	@Column(name = "ngay_sinh", nullable = false)
	private Date ngaySinh;
	
	/**
	 * Property soDienThoai
	 */
	@Column(name = "so_dien_thoai", nullable = false, length = 60)
	private String soDienThoai;
	
	/**
	 * Property diaChi
	 */
	@Column(name = "dia_chi", nullable = false, length = 60)
	private String diaChi;
	
	/**
	 * Property doiTuongUuTien
	 */
	@Column(name = "doi_tuong_uu_tien", nullable = false, length = 60)
	private String doiTuongUuTien;
	
	/**
	 * Property soDienThoaiBo
	 */
	@Column(name = "so_dien_thoai_bo", nullable = false, length = 60)
	private String soDienThoaiBo;
	
	/**
	 * Property soDienThoai
	 */
	@Column(name = "so_dien_thoai_me", nullable = false, length = 60)
	private String soDienThoaiMe;
	
	/**
	 * Property linkimg1
	 */
	@Column(name = "linkimg1", nullable = false, length = 60)
	private String linkimg1;
	
	/**
	 * Property linkimg2
	 */
	@Column(name = "linkimg2", nullable = false, length = 60)
	private String linkimg2;
	
	/**
	 * Property linkimg3
	 */
	@Column(name = "linkimg3", nullable = false, length = 60)
	private String linkimg3;
	
	/**
	 * Constructor
	 */
	public HoSoXetTuyenResponse() {
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
	
}
