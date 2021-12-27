/**
 * @package com.tutv.entity
 * @date Dec 8, 2021
 * @author trinh
 */
package com.tutv.entity;

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
 * Nganh
 */

@Entity
@Table(name = "nganh")
public class Nganh {
	
	/**
	 * Property id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property maNganh
	 */
	@Column(name = "ma_nganh", nullable = false, length = 60, unique = true)
	private String maNganh;
	
	/**
	 * Property tenNganh
	 */
	@Column(name = "ten_nganh", nullable = false, length = 60, unique = true)
	private String tenNganh;
	
	/**
	 * Property moTa
	 */
	@Column(name = "mo_ta", nullable = true, length = 60)
	private String moTa;
	
	/**
	 * Property id_khoa
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_khoa", nullable = false, foreignKey = @javax.persistence.ForeignKey(name = "FK_KHOA_NGANH", foreignKeyDefinition = "foreign key (id_khoa) references khoa (id) ON DELETE CASCADE ON UPDATE CASCADE"), columnDefinition = "INT UNSIGNED")
	private Khoa idKhoa;
	
	/**
	 * Constructor
	 */
	public Nganh() {
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

	public Khoa getIdKhoa() {
		return idKhoa;
	}

	public void setIdKhoa(Khoa idKhoa) {
		this.idKhoa = idKhoa;
	}
	
}
