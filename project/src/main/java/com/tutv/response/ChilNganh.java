/**
 * @package com.tutv.response
 * @date Dec 27, 2021
 * @author trinh
 */
package com.tutv.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * ChilNganh
 */
@Entity
public class ChilNganh extends EntityResponse {
	@Id
	@Column(name = "id", nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	private Integer id;

	@Column(name = "ten_khoa")
	private String tenKhoa;

	public ChilNganh() {

	}

	public ChilNganh(Integer id, String tenKhoa) {
		this.id = id;
		this.tenKhoa = tenKhoa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

}
