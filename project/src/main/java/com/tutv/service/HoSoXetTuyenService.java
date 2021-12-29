/**
 * @package com.tutv.service
 * @date Dec 12, 2021
 * @author trinh
 */
package com.tutv.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.tutv.dao.HoSoXetTuyenDAO;
import com.tutv.dao.TruongThptDAO;
import com.tutv.dto.HoSoXetTuyenDto;
import com.tutv.entity.HoSoXetTuyen;
import com.tutv.response.BTSHoSoXetTuyenResponse;
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

	@Autowired
	TruongThptDAO truongThptDAO;

	/**
	 * getHoSo
	 *
	 * @param string
	 * @return
	 */
	public HoSoXetTuyenResponse getHoSo() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String email = auth.getName();
		Integer idTaiKhoan = taiKhoanService.getTaiKhoan(email).getId();
		HoSoXetTuyenResponse hoSoXetTuyenResponse = hoSoXetTuyenDAO.getHoSo(idTaiKhoan);
		return hoSoXetTuyenResponse;
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
		hoSoXetTuyen.setIdTruongThpt10(truongThptDAO.findTruongThptById(hoSoXetTuyenDto.getIdTruongThpt10()));
		hoSoXetTuyen.setIdTruongThpt11(truongThptDAO.findTruongThptById(hoSoXetTuyenDto.getIdTruongThpt11()));
		hoSoXetTuyen.setIdTruongThpt12(truongThptDAO.findTruongThptById(hoSoXetTuyenDto.getIdTruongThpt12()));
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

		HoSoXetTuyen hoSoXetTuyen = hoSoXetTuyenDAO.getHoSoXetTuyenById(hoSoXetTuyenDto.getId());
		hoSoXetTuyen.setHoTen(hoSoXetTuyenDto.getHoTen());
		hoSoXetTuyen.setCccd(hoSoXetTuyenDto.getCccd());
		hoSoXetTuyen.setDiaChi(hoSoXetTuyenDto.getDiaChi());
		hoSoXetTuyen.setDoiTuongUuTien(hoSoXetTuyenDto.getDoiTuongUuTien());
		hoSoXetTuyen.setGioiTinh(hoSoXetTuyenDto.getGioiTinh());
		hoSoXetTuyen.setIdTaiKhoan(taiKhoanService.getTaiKhoanByEmail(email));
		hoSoXetTuyen.setIdTruongThpt10(truongThptDAO.findTruongThptById(hoSoXetTuyenDto.getIdTruongThpt10()));
		hoSoXetTuyen.setIdTruongThpt11(truongThptDAO.findTruongThptById(hoSoXetTuyenDto.getIdTruongThpt11()));
		hoSoXetTuyen.setIdTruongThpt12(truongThptDAO.findTruongThptById(hoSoXetTuyenDto.getIdTruongThpt12()));
		hoSoXetTuyen.setKhuVucUuTien(hoSoXetTuyenDto.getKhuVucUuTien());
		hoSoXetTuyen.setNgaySinh(hoSoXetTuyenDto.getNgaySinh());
		hoSoXetTuyen.setSoDienThoai(hoSoXetTuyenDto.getSoDienThoai());
		hoSoXetTuyen.setSoDienThoaiBo(hoSoXetTuyenDto.getSoDienThoaiBo());
		hoSoXetTuyen.setSoDienThoaiMe(hoSoXetTuyenDto.getSoDienThoaiMe());
		HoSoXetTuyen hoSoXetTuyen2 = hoSoXetTuyenDAO.updateHoSo(hoSoXetTuyen);
		return hoSoXetTuyen2;
	}

	/**
	 * getListHoSo
	 *
	 * @return
	 */
	public List<BTSHoSoXetTuyenResponse> getListHoSo() {
		// TODO Auto-generated method stub
		return hoSoXetTuyenDAO.getListHoSo();
	}

	/**
	 * updateFile
	 *
	 * @param path
	 */
	public void updateFile(String path) {
		HoSoXetTuyen hoSoXetTuyen = hoSoXetTuyenDAO.getHoSoXetTuyenById(getHoSo().getId());

		try {
			// Specify the file name and path
			File file = new File("D:/DoAnTotNghiep/project/src/main/webapp/imghoso", hoSoXetTuyen.getLinkimg1());
			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("Delete failed: File didn't delete");
			}
		} catch (Exception e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
		hoSoXetTuyen.setLinkimg1(path);
		hoSoXetTuyenDAO.updateHoSo(hoSoXetTuyen);

	}

}
