/**
 * @package com.tutv.service
 * @date Dec 12, 2021
 * @author trinh
 */
package com.tutv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.tutv.dao.HoSoXetTuyenDAO;
import com.tutv.dto.HoSoXetTuyenDto;
import com.tutv.entity.HoSoXetTuyen;
import com.tutv.response.HoSoXetTuyenResponse;

/**
 * HoSoXetTuyenService
 */
@Service
public class HoSoXetTuyenService {
	
	@Autowired
	HoSoXetTuyenDAO hoSoXetTuyenDAO;
	@Autowired
	private TaiKhoanService taiKhoanService;
	/**
	 * getHoSo
	 *
	 * @param string
	 * @return
	 */
	public HoSoXetTuyenResponse getHoSo(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * saveHoSo
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public HoSoXetTuyen saveHoSo(HoSoXetTuyenDto hoSoXetTuyenDto) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    String email = auth.getName();
    taiKhoanService.getTaiKhoan(email);
    
		HoSoXetTuyen hoSoXetTuyen = new HoSoXetTuyen();
		hoSoXetTuyen.setHoTen(hoSoXetTuyenDto.getHoTen());
		hoSoXetTuyen.setCccd(hoSoXetTuyenDto.getCccd());
		hoSoXetTuyen.setDiaChi(hoSoXetTuyenDto.getDiaChi());
		hoSoXetTuyen.setDoiTuongUuTien(hoSoXetTuyenDto.getDoiTuongUuTien());
		hoSoXetTuyen.setGioiTinh(hoSoXetTuyenDto.getGioiTinh());
		hoSoXetTuyen.setIdTaiKhoan(taiKhoanService.getTaiKhoanByEmail(email));
//		hoSoXetTuyen.setIdTruongThpt10(hoSoXetTuyenDto.getIdTruongThpt10());
//		hoSoXetTuyen.setIdTruongThpt11(hoSoXetTuyenDto.getIdTruongThpt11());
//		hoSoXetTuyen.setIdTruongThpt12(hoSoXetTuyenDto.getIdTruongThpt12());
		hoSoXetTuyen.setKhuVucUuTien(hoSoXetTuyenDto.getKhuVucUuTien());
		hoSoXetTuyen.setNgaySinh(hoSoXetTuyenDto.getNgaySinh());
		hoSoXetTuyen.setSoDienThoai(hoSoXetTuyenDto.getSoDienThoai());
		hoSoXetTuyen.setSoDienThoaiBo(hoSoXetTuyenDto.getSoDienThoaiBo());
		hoSoXetTuyen.setSoDienThoaiMe(hoSoXetTuyenDto.getSoDienThoaiMe());
		HoSoXetTuyen hoSoXetTuyen2 = hoSoXetTuyenDAO.saveHoSo(hoSoXetTuyen);
		return hoSoXetTuyen2;
	}
	
	/**
	 * saveHoSo
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public HoSoXetTuyen update(HoSoXetTuyenDto hoSoXetTuyenDto) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    String email = auth.getName();
    taiKhoanService.getTaiKhoan(email);
    
		HoSoXetTuyen hoSoXetTuyen = new HoSoXetTuyen();
		hoSoXetTuyen.setHoTen(hoSoXetTuyenDto.getHoTen());
		hoSoXetTuyen.setCccd(hoSoXetTuyenDto.getCccd());
		hoSoXetTuyen.setDiaChi(hoSoXetTuyenDto.getDiaChi());
		hoSoXetTuyen.setDoiTuongUuTien(hoSoXetTuyenDto.getDoiTuongUuTien());
		hoSoXetTuyen.setGioiTinh(hoSoXetTuyenDto.getGioiTinh());
		hoSoXetTuyen.setIdTaiKhoan(taiKhoanService.getTaiKhoanByEmail(email));
//		hoSoXetTuyen.setIdTruongThpt10(hoSoXetTuyenDto.getIdTruongThpt10());
//		hoSoXetTuyen.setIdTruongThpt11(hoSoXetTuyenDto.getIdTruongThpt11());
//		hoSoXetTuyen.setIdTruongThpt12(hoSoXetTuyenDto.getIdTruongThpt12());
		hoSoXetTuyen.setKhuVucUuTien(hoSoXetTuyenDto.getKhuVucUuTien());
		hoSoXetTuyen.setNgaySinh(hoSoXetTuyenDto.getNgaySinh());
		hoSoXetTuyen.setSoDienThoai(hoSoXetTuyenDto.getSoDienThoai());
		hoSoXetTuyen.setSoDienThoaiBo(hoSoXetTuyenDto.getSoDienThoaiBo());
		hoSoXetTuyen.setSoDienThoaiMe(hoSoXetTuyenDto.getSoDienThoaiMe());
		HoSoXetTuyen hoSoXetTuyen2 = hoSoXetTuyenDAO.saveHoSo(hoSoXetTuyen);
		return hoSoXetTuyen2;
	}

}
