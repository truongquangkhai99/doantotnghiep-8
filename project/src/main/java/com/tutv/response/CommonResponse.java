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
	
	@Column(name = "ma_to_hop_mon")
	private String maToHopMon;

	/**
	 * Constructor
	 */
	public CommonResponse() {
	}
	/**
	 * Constructor
	 */
	public CommonResponse(Integer id, String maToHopMon) {
		this.id = id;
		this.maToHopMon = maToHopMon;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaToHopMon() {
		return maToHopMon;
	}

	public void setMaToHopMon(String maToHopMon) {
		this.maToHopMon = maToHopMon;
	}

}