/**
 * @package com.tutv.entity
 * @date Dec 8, 2021
 * @author trinh
 */
package com.tutv.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * ToHopMon
 */

@Table(name = "to_hop_mon")
@Entity
public class ToHopMonResponse extends EntityResponse{

	/**
	 * Property id
	 */
	@Id
	@Column(name = "id", columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property maToHopMon
	 */
	@Column(name = "ma_to_hop_mon", length = 60, unique = true)
	private String maToHopMon;
	
	/**
	 * Property id_nganh
	 */
	@Column(name = "id_nganh", columnDefinition = "INT UNSIGNED")
	private Integer idNganh;

	/**
	 * Property idNganhObj
	 */
	@Transient
	private ChilToHopMon idNganhObj;
	
	public ChilToHopMon getIdNganhObj() {
		return idNganhObj;
	}

	public void setIdNganhObj(ChilToHopMon idNganhObj) {
		this.idNganhObj = idNganhObj;
	}

	public ToHopMonResponse() {
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

	public Integer getIdNganh() {
		return idNganh;
	}

	public void setIdNganh(Integer idNganh) {
		this.idNganh = idNganh;
	}
	
}
