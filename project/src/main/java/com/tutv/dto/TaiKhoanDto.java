/**
 * @package dto
 * @date Dec 10, 2021
 * @author trinh
 */
package com.tutv.dto;

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
	 * Property enabled
	 */
	private boolean enabled;
	
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
	 * getEnabled
	 *
	 * @return the enabled
	 */
	public boolean getEnabled() {
		return enabled;
	}

	/**
	 * setEnabled
	 *
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
