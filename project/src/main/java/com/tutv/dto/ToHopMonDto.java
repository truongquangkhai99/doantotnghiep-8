/**
 * @package com.tutv.dto
 * @date Dec 23, 2021
 * @author trinh
 */
package com.tutv.dto;

/**
 * ToHopMonDto
 */
public class ToHopMonDto extends CommonDto{


	/**
	 * Field serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Property id
	 */
	private Integer id;
	
	private String maToHopMon;
	
	/**
	 * Property id_nganh
	 */
	private Integer idNganh;

	public ToHopMonDto() {
		super();
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
