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
 * ChilTruongThpt
 */
@Entity
public class ChilTruongThpt extends EntityResponse {
	@Id
	@Column(name = "id", nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	private Integer id;

	@Column(name = "ten_truong")
	private String tenTruong;

	public ChilTruongThpt() {

	}

	public ChilTruongThpt(Integer id, String tenTruong) {
		this.id = id;
		this.tenTruong = tenTruong;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}

}
