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
public class ChilToHopMon extends EntityResponse{
	@Id
	@Column(name = "id", nullable = false, columnDefinition = "SMALLINT UNSIGNED")
	private Integer id;
	
	@Column(name = "ten_nganh")
	private String tenNganh;
	
	

	public ChilToHopMon() {
	
	}
	
	public ChilToHopMon(Integer id, String tenNganh) {
		this.id = id;
		this.tenNganh = tenNganh;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}


	
	
}
