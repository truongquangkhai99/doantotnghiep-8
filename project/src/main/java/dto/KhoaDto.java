/**
 * @package dto
 * @date Dec 10, 2021
 * @author trinh
 */
package dto;

/**
 * KhoaDto
 */
public class KhoaDto extends CommonDto{

	/**
	 * Field serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Property id
	 */
	private Integer id;
	
	/**
	 * Property maKhoa
	 */
	private String maKhoa;
	
	/**
	 * Property tenKhoa
	 */
	private String tenKhoa;
	
	/**
	 * Property moTa
	 */
	private String moTa;
	
	/**
	 * Constructor
	 */
	public KhoaDto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaKhoa() {
		return maKhoa;
	}

	public void setMaKhoa(String maKhoa) {
		this.maKhoa = maKhoa;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
}
