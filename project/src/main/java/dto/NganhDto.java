/**
 * @package dto
 * @date Dec 10, 2021
 * @author trinh
 */
package dto;

/**
 * NganhDto
 */
public class NganhDto extends CommonDto{
	
	/**
	 * Field serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Property id
	 */
	private Integer id;
	
	/**
	 * Property maNganh
	 */
	private String maNganh;
	
	/**
	 * Property tenNganh
	 */
	private String tenNganh;
	
	/**
	 * Property moTa
	 */
	private String moTa;
	
	/**
	 * Property id_khoa
	 */
	private Integer idKhoa;
	
	/**
	 * Constructor
	 */
	public NganhDto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public Integer getIdKhoa() {
		return idKhoa;
	}

	public void setIdKhoa(Integer idKhoa) {
		this.idKhoa = idKhoa;
	}
	
}
