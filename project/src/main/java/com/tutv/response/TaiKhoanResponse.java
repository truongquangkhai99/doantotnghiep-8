/**
 * @package com.tutv.entity
 * @date Dec 7, 2021
 * @author trinh
 */
package com.tutv.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * TaiKhoan Entity
 */

@Entity
public class TaiKhoanResponse {

	/**
	 * Property id
	 */
	@Id
	@Column(name = "id", nullable = false, columnDefinition = "INT UNSIGNED")
	private Integer id;
	
	/**
	 * Property email
	 */
	@Column(name = "email", nullable = false, length = 60)
	private String email;
	
	/**
	 * Property status
	 */
	@Column(name = "status", length = 60)
	
	private String status;
	/**
	 * Property password
	 */
	@Column(name = "password", nullable = false, length = 60)
	private String password;
	
	/**
	 * Property name
	 */
	@Column(name = "name", nullable = false, length = 60)
	private String name;
	
	/**
	 * Property Role
	 */
	@Column(name = "role")
	private String role;
	
	/**
	 * Property phone
	 */
	@Column(name = "phone", nullable = false, length = 60)
	private String phone;
	
	public TaiKhoanResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
	
	
}
