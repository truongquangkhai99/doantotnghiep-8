/**
 * @package com.tutv.entity
 * @date Dec 9, 2021
 * @author trinh
 */
package com.tutv.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * HoSoXetTuyen
 */

@Entity
@Table(name = "ho_so_xet_tuyen")
public class HoSoXetTuyen {

	/**
	 * Property id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property idTaiKhoan
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_tai_khoan", nullable = false, foreignKey = @javax.persistence.ForeignKey(name = "FK_TAIKHOAN_HOSOXETTUYEN", foreignKeyDefinition = "foreign key (id_tai_khoan) references tai_khoan (id) ON DELETE CASCADE ON UPDATE CASCADE"), columnDefinition = "INT UNSIGNED")
	private TaiKhoan idTaiKhoan;
	
	/**
	 * Property idTruongThpt10
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_truong_thpt10", nullable = false, foreignKey = @javax.persistence.ForeignKey(name = "FK_TRUONG_HOSOXETTUYEN10", foreignKeyDefinition = "foreign key (id_truong_thpt10) references truong_thpt (id) ON DELETE CASCADE ON UPDATE CASCADE"), columnDefinition = "INT UNSIGNED")
	private TruongThpt idTruongThpt10;
	
	/**
	 * Property idTruongThpt11
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_truong_thpt11", nullable = false, foreignKey = @javax.persistence.ForeignKey(name = "FK_TRUONG_HOSOXETTUYEN11", foreignKeyDefinition = "foreign key (id_truong_thpt11) references truong_thpt (id) ON DELETE CASCADE ON UPDATE CASCADE"), columnDefinition = "INT UNSIGNED")
	private TruongThpt idTruongThpt11;
	
	/**
	 * Property idTruongThpt12
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_truong_thpt12", nullable = false, foreignKey = @javax.persistence.ForeignKey(name = "FK_TRUONG_HOSOXETTUYEN12", foreignKeyDefinition = "foreign key (id_truong_thpt12) references truong_thpt (id) ON DELETE CASCADE ON UPDATE CASCADE"), columnDefinition = "INT UNSIGNED")
	private TruongThpt idTruongThpt12;
	
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
	public HoSoXetTuyen() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TaiKhoan getIdTaiKhoan() {
		return idTaiKhoan;
	}

	public void setIdTaiKhoan(TaiKhoan idTaiKhoan) {
		this.idTaiKhoan = idTaiKhoan;
	}

	public TruongThpt getIdTruongThpt10() {
		return idTruongThpt10;
	}

	public void setIdTruongThpt10(TruongThpt idTruongThpt10) {
		this.idTruongThpt10 = idTruongThpt10;
	}

	public TruongThpt getIdTruongThpt11() {
		return idTruongThpt11;
	}

	public void setIdTruongThpt11(TruongThpt idTruongThpt11) {
		this.idTruongThpt11 = idTruongThpt11;
	}

	public TruongThpt getIdTruongThpt12() {
		return idTruongThpt12;
	}

	public void setIdTruongThpt12(TruongThpt idTruongThpt12) {
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
