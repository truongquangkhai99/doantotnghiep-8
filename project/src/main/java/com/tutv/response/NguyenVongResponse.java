/**
 * @package com.tutv.entity
 * @date Dec 9, 2021
 * @author trinh
 */
package com.tutv.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * NguyenVong
 */
@Entity
@Table(name = "nguyen_vong")
public class NguyenVongResponse extends EntityResponse{

	/**
	 * Property id
	 */
	@Id
	@Column(name = "id", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property idHoSoXetTuyen
	 */
	@Column(name = "id_ho_so_xet_tuyen", columnDefinition = "INT UNSIGNED")
	private Integer idHoSoXetTuyen;
	
	/**
	 * Property idHoSoXetTuyenObj
	 */
	@Transient
	private CommonResponse idHoSoXetTuyenObj;
	
	/**
	 * Property idToHopMon
	 */
	@Column(name = "id_to_hop_mon", columnDefinition = "INT UNSIGNED")
	private Integer idToHopMon;
	
	/**
	 * Property idToHopMonObj
	 */
	@Transient
	private CommonResponse idToHopMonObj;
	
	/**
	 * Property idToHopMonObj
	 */
	@Transient
	private ChilToHopMon idNganhObj;
	
	/**
	 * Property diemtb_mon_mot
	 */
	@Column(name = "diemtb_mon_mot", nullable = false)
	private Double diemtbMonMot;
	
	/**
	 * Property diemtb_mon_hai
	 */
	@Column(name = "diemtb_mon_hai", nullable = false)
	private Double diemtbMonHai;
	
	/**
	 * Property diemtb_mon_ba
	 */
	@Column(name = "diemtb_mon_ba", nullable = false)
	private Double diemtbMonBa;
	
	@Column(name = "diem_xet_tuyen", nullable = true)
	private Double diemXetTuyen;
	
	public NguyenVongResponse() {
		
	}

	public Double getDiemXetTuyen() {
		return diemXetTuyen;
	}


	public void setDiemXetTuyen(Double diemXetTuyen) {
		this.diemXetTuyen = diemXetTuyen;
	}
	
	public ChilToHopMon getIdNganhObj() {
		return idNganhObj;
	}

	public void setIdNganhObj(ChilToHopMon idNganhObj) {
		this.idNganhObj = idNganhObj;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdHoSoXetTuyen() {
		return idHoSoXetTuyen;
	}

	public void setIdHoSoXetTuyen(Integer idHoSoXetTuyen) {
		this.idHoSoXetTuyen = idHoSoXetTuyen;
	}

	public Integer getIdToHopMon() {
		return idToHopMon;
	}

	public void setIdToHopMon(Integer idToHopMon) {
		this.idToHopMon = idToHopMon;
	}

	public Double getDiemtbMonMot() {
		return diemtbMonMot;
	}

	public void setDiemtbMonMot(Double diemtbMonMot) {
		this.diemtbMonMot = diemtbMonMot;
	}

	public Double getDiemtbMonHai() {
		return diemtbMonHai;
	}

	public void setDiemtbMonHai(Double diemtbMonHai) {
		this.diemtbMonHai = diemtbMonHai;
	}

	public Double getDiemtbMonBa() {
		return diemtbMonBa;
	}

	public void setDiemtbMonBa(Double diemtbMonBa) {
		this.diemtbMonBa = diemtbMonBa;
	}

	public CommonResponse getIdHoSoXetTuyenObj() {
		return idHoSoXetTuyenObj;
	}

	public void setIdHoSoXetTuyenObj(CommonResponse idHoSoXetTuyenObj) {
		this.idHoSoXetTuyenObj = idHoSoXetTuyenObj;
	}

	public CommonResponse getIdToHopMonObj() {
		return idToHopMonObj;
	}

	public void setIdToHopMonObj(CommonResponse idToHopMonObj) {
		this.idToHopMonObj = idToHopMonObj;
	}

}
