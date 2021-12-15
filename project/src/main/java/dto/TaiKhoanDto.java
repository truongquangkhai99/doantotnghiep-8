/**
 * @package dto
 * @date Dec 10, 2021
 * @author trinh
 */
package dto;

import javax.persistence.Column;

/**
 * TaiKhoanDto
 */
public class TaiKhoanDto extends CommonDto{

	/**
	 * Field serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Property id
	 */
	private Integer id;
	
	/**
	 * Property email
	 */
	private String email;
	
	/**
	 * Property status
	 */
	private String status;
	
	/**
	 * Property password
	 */
	private String password;
	
	/**
	 * Property name
	 */
	private String name;
	
	/**
	 * Property role
	 */
	private String role;
	
	/**
	 * Property phone
	 */
	private String phone;
	
	public TaiKhoanDto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * getStatus
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * setStatus
	 *
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
