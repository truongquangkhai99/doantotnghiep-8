/**
 * @package com.tutv.service
 * @date Dec 12, 2021
 * @author trinh
 */
package com.tutv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutv.dao.TaiKhoanDAO;
import com.tutv.dto.TaiKhoanDto;
import com.tutv.entity.TaiKhoan;
import com.tutv.response.TaiKhoanResponse;

/**
 * TaiKhoanService
 */
@Service
public class TaiKhoanService {
	
	@Autowired
	private TaiKhoanDAO taikhoanDAO;
	
	public TaiKhoanResponse getTaiKhoan(String email) {
		TaiKhoanResponse user = taikhoanDAO.findTaiKhoanByEmail(email);
		return user;
	}

	/**
	 * saveTaiKhoan
	 *
	 * @param historyDto
	 * @return
	 */
	public Boolean saveTaiKhoan(TaiKhoanDto taiKhoanDto) {
		TaiKhoan taiKhoan = new TaiKhoan();
		taiKhoan.setEmail(taiKhoanDto.getEmail());
		taiKhoan.setPassword(taiKhoanDto.getPassword());
		try {
			taiKhoan.setName(taiKhoanDto.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		// store user
		taiKhoan.setEnabled(false);
		taiKhoan.setRole("USER");
		return taikhoanDAO.createTaiKhoanAccount(taiKhoan);
	}

	/**
	 * updateTaiKhoan
	 *
	 * @param email
	 */
	public Boolean updateTaiKhoan(String email) {
		return taikhoanDAO.updateTaiKhoan(email);
		
	}

}
