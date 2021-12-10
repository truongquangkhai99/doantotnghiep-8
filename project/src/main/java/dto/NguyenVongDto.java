/**
 * @package dto
 * @date Dec 10, 2021
 * @author trinh
 */
package dto;


/**
 * NguyenVongDto
 */
public class NguyenVongDto extends CommonDto{

	/**
	 * Field serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Property id
	 */
	private Integer id;
	
	/**
	 * Property idHoSoXetTuyen
	 */
	private Integer idHoSoXetTuyen;
	
	/**
	 * Property idToHopMon
	 */
	private Integer idToHopMon;
	
	/**
	 * Property diemtb_mon_mot
	 */
	private Double diemtbMonMot;
	
	/**
	 * Property diemtb_mon_hai
	 */
	private Double diemtbMonHai;
	
	/**
	 * Property diemtb_mon_ba
	 */
	private Double diemtbMonBa;
	
	public NguyenVongDto() {
		
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
}
