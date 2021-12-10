/**
 * @package com.tutv.response
 * @date Dec 10, 2021
 * @author trinh
 */
package com.tutv.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * CommonResponse
 */
@Entity
public class CommonResponse extends EntityResponse {

	@Id
	@Column(name = "id", nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	private Integer id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "ma_khoa")
	private String maKhoa;
	
	@Column(name = "ten_truong")
	private String tenTruong;
	
	@Column(name = "ma_to_hop_mon")
	private String maToHopMon;

	/**
	 * Constructor
	 */
	public CommonResponse() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaKhoa() {
		return maKhoa;
	}

	public void setMaKhoa(String maKhoa) {
		this.maKhoa = maKhoa;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}

	public String getMaToHopMon() {
		return maToHopMon;
	}

	public void setMaToHopMon(String maToHopMon) {
		this.maToHopMon = maToHopMon;
	}

}