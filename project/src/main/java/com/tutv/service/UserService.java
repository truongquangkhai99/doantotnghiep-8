/**
 * @package com.tutv.service
 * @date Sep 7, 2021
 * @author trinh
 */
package com.tutv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutv.dao.TaiKhoanDAO;
import com.tutv.dao.UserDAO;
import com.tutv.entity.TaiKhoan;
import com.tutv.response.TaiKhoanResponse;
import com.tutv.response.UserResponse;

/**
 * UserService
 */
@Service
public class UserService{

	/**
	 * Field userDAO
	 */
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private TaiKhoanDAO taiKhoanDAO;
	
	public TaiKhoanResponse getTaikhoan(String email) {
		TaiKhoanResponse user = taiKhoanDAO.findTaiKhoanByEmail(email);
		return user;
	}

	/**
	 * getUser
	 *
	 * @param id
	 * @return user
	 */
	public UserResponse getUser(Integer id) {
		UserResponse user = userDAO.getUser(id);
		return user;
	}

}
