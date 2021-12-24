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
 * ToHopMon
 */

@Entity
@Table(name = "to_hop_mon")
public class ToHopMon {

	/**
	 * Property id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property maToHopMon
	 */
	@Column(name = "ma_to_hop_mon", nullable = false, length = 60)
	private String maToHopMon;
	
	/**
	 * Property id_nganh
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_nganh", nullable = false, foreignKey = @javax.persistence.ForeignKey(name = "FK_NGANH_TOHOPMON", foreignKeyDefinition = "foreign key (id_nganh) references nganh (id) ON DELETE CASCADE ON UPDATE CASCADE"), columnDefinition = "INT UNSIGNED")
	private Nganh idNganh;

	public ToHopMon() {
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

	public Nganh getIdNganh() {
		return idNganh;
	}

	public void setIdNganh(Nganh idNganh) {
		this.idNganh = idNganh;
	}
	
}
