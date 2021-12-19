/**
 * @package dto
 * @date Dec 15, 2021
 * @author trinh
 */
package com.tutv.dto;

import java.io.Serializable;
/**
 * LoginDto
 */
public class LoginDto implements Serializable {

	/**
	 * Field serialVersionUID
	 */
	private static final long serialVersionUID = 467698447379457117L;

	/**
	 * Field email
	 */
	private String email = null;

	/**
	 * Field password
	 */
	private String password = null;

	private String rePassword = null;
	/**
	 * getEmail
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * setEmail
	 *
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		System.out.println("set email " + email);
		this.email = email;
	}

	/**
	 * getPassword
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * setPassword
	 *
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		System.out.println("set password " + password);
		this.password = password;
	}

	/**
	 * getRePassword
	 *
	 * @return the rePassword
	 */
	public String getRePassword() {
		return rePassword;
	}

	/**
	 * setRePassword
	 *
	 * @param rePassword the rePassword to set
	 */
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

}
