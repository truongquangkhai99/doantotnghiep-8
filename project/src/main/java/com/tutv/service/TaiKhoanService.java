/**
 * @package com.tutv.service
 * @date Dec 12, 2021
 * @author trinh
 */
package com.tutv.service;

import java.util.List;

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

	public TaiKhoan getTaiKhoanByEmail (String email) {
		int id = taikhoanDAO.findTaiKhoanByEmail(email).getId();
		TaiKhoan user = taikhoanDAO.findTaiKhoanById(id);
		return user;
	}
	/**
	 * saveTaiKhoan
	 *
	 * @param historyDto
	 * @return
	 */
	public Boolean saveTaiKhoan(TaiKhoanDto taiTaiKhoannDto) {
		TaiKhoan taiTaiKhoann = new TaiKhoan();
		taiTaiKhoann.setEmail(taiTaiKhoannDto.getEmail());
		taiTaiKhoann.setPassword(taiTaiKhoannDto.getPassword());
		try {
			taiTaiKhoann.setName(taiTaiKhoannDto.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		// store user
		taiTaiKhoann.setEnabled(false);
		taiTaiKhoann.setRole("ROLE_USER");
		return taikhoanDAO.createTaiKhoanAccount(taiTaiKhoann);
	}

	/**
	 * updateTaiKhoan
	 *
	 * @param email
	 */
	public Boolean updateTaiKhoan(String email) {
		return taikhoanDAO.updateTaiKhoan(email);
		
	}
	
	public TaiKhoanResponse getTaiKhoan(int id) {
		// TODO Auto-generated method stub
		return taikhoanDAO.findTaiKhoanByEmail(taikhoanDAO.findTaiKhoanById(id).getEmail());
	}
	
	public List<TaiKhoanResponse> getListTaiKhoan() {
		return taikhoanDAO.taikhoanList();
	}

	/**
	 * saveTaiKhoan
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public TaiKhoan createTaiKhoan(TaiKhoanDto taiKhoanDto) {
		TaiKhoan taiKhoan = new TaiKhoan();
		taiKhoan.setEmail(taiKhoanDto.getEmail());
		taiKhoan.setEnabled(taiKhoanDto.getEnabled());
		taiKhoan.setName(taiKhoanDto.getName());
		taiKhoan.setRole(taiKhoanDto.getRole());
		taiKhoan.setPassword(taiKhoanDto.getPassword());
		taiKhoan.setPhone(taiKhoanDto.getPhone());
		if (taikhoanDAO.createTaiKhoanAccount(taiKhoan)) {
			return taiKhoan;
		} else {
			return null;
		}
		
	}

	/**
	 * updateTaiKhoan
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public TaiKhoan updateTaiKhoan2(TaiKhoanDto taiKhoanDto) {
		TaiKhoan taiKhoan = taikhoanDAO.findTaiKhoanById(taiKhoanDto.getId());
		taiKhoan.setEmail(taiKhoanDto.getEmail());
		taiKhoan.setEnabled(taiKhoanDto.getEnabled());
		taiKhoan.setName(taiKhoanDto.getName());
		taiKhoan.setRole(taiKhoanDto.getRole());
		taiKhoan.setPassword(taiKhoanDto.getPassword());
		taiKhoan.setPhone(taiKhoanDto.getPhone());
		return taikhoanDAO.updateTaiKhoan2(taiKhoan);
	}

	/**
	 * deleteTaiKhoan
	 *
	 * @param id
	 * @return
	 */
	public TaiKhoan deleteTaiKhoan(Integer id) {
		TaiKhoan khoa = taikhoanDAO.findTaiKhoanById(id);
		if (taikhoanDAO.destroyTaiKhoan(khoa)) {
			return khoa;
		} else {
			return null;
		}
	}

}
