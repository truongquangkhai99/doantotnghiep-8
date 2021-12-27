/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutv.entity.TaiKhoan;
import com.tutv.response.TaiKhoanResponse;

/**
 * TaiKhoanDAO
 */
@Repository
public interface TaiKhoanDAO {


	public TaiKhoan findTaiKhoanById(Integer id);

	public TaiKhoanResponse findTaiKhoanByEmail(String email);

	public boolean createTaiKhoanAccount(TaiKhoan taikhoan);

//	active taikhoan
	public Boolean updateTaiKhoan(String email);

	public boolean destroyTaiKhoan(TaiKhoan taikhoan);
	
	public List<TaiKhoanResponse> taikhoanList();

	/**
	 * updateTaiKhoan2
	 *
	 * @param taiKhoan
	 * @return
	 */
	public TaiKhoan updateTaiKhoan2(TaiKhoan taiKhoan);


}
