/**
 * @package com.tutv.entity
 * @date Dec 9, 2021
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
 * NguyenVong
 */

@Entity
@Table(name = "nguyen_vong")
public class NguyenVong {

	/**
	 * Property id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property idHoSoXetTuyen
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_ho_so_xet_tuyen", nullable = false, foreignKey = @javax.persistence.ForeignKey(name = "FK_HOSOXETTUYEN_NGUYENVONG", foreignKeyDefinition = "foreign key (id_ho_so_xet_tuyen) references ho_so_xet_tuyen (id) ON DELETE CASCADE ON UPDATE CASCADE"), columnDefinition = "INT UNSIGNED")
	private HoSoXetTuyen idHoSoXetTuyen;
	
	/**
	 * Property idToHopMon
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_to_hop_mon", nullable = false, foreignKey = @javax.persistence.ForeignKey(name = "FK_TOHOPMON_NGUYENVONG", foreignKeyDefinition = "foreign key (id_to_hop_mon) references to_hop_mon (id) ON DELETE CASCADE ON UPDATE CASCADE"), columnDefinition = "INT UNSIGNED")
	private ToHopMon idToHopMon;
	
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
	
	public NguyenVong() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HoSoXetTuyen getIdHoSoXetTuyen() {
		return idHoSoXetTuyen;
	}

	public void setIdHoSoXetTuyen(HoSoXetTuyen idHoSoXetTuyen) {
		this.idHoSoXetTuyen = idHoSoXetTuyen;
	}

	public ToHopMon getIdToHopMon() {
		return idToHopMon;
	}

	public void setIdToHopMon(ToHopMon idToHopMon) {
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
	
}
