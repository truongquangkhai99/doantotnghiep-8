/**
 * @package com.tutv.service
 * @date Dec 12, 2021
 * @author trinh
 */
package com.tutv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutv.dao.HoSoXetTuyenDAO;
import com.tutv.dao.NguyenVongDAO;
import com.tutv.dao.ToHopMonDAO;
import com.tutv.dto.NguyenVongDto;
import com.tutv.entity.NguyenVong;
import com.tutv.response.NguyenVongResponse;

/**
 * NguyenVongService
 */
@Service
public class NguyenVongService {
	
	@Autowired 
	NguyenVongDAO nguyenVongDao;
	
	@Autowired ToHopMonDAO toHopMonDAO;
	
	@Autowired HoSoXetTuyenService hoSoXetTuyenService;
	
	@Autowired HoSoXetTuyenDAO hoSoXetTuyenDAO;

	@Autowired TaiKhoanService khoanService;
	/**
	 * getNguyenVong
	 *
	 * @param i
	 * @return
	 */
	public NguyenVongResponse getNguyenVong(Integer id) {
		// TODO Auto-generated method stub
		return nguyenVongDao.getNguyenVongById(id);
	}
	
	public List<NguyenVongResponse> getListNguyenVong() {
		
		return nguyenVongDao.getListNguyenVong(hoSoXetTuyenService.getHoSo().getId());
	}

	/**
	 * saveNguyenVong
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public NguyenVong saveNguyenVong(NguyenVongDto nguyenVongDto) {
		NguyenVong nguyenVong = new NguyenVong();
		nguyenVong.setIdHoSoXetTuyen(hoSoXetTuyenDAO.getHoSoXetTuyenById(hoSoXetTuyenService.getHoSo().getId()));
		nguyenVong.setIdToHopMon(toHopMonDAO.findToHopMonById(nguyenVongDto.getIdToHopMon()));
		nguyenVong.setDiemtbMonMot(nguyenVongDto.getDiemtbMonMot());
		nguyenVong.setDiemtbMonHai(nguyenVongDto.getDiemtbMonHai());
		nguyenVong.setDiemtbMonBa(nguyenVongDto.getDiemtbMonBa());
		return nguyenVongDao.createNguyenVong(nguyenVong);
	}

	/**
	 * updateNguyenVong
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public NguyenVong updateNguyenVong(NguyenVongDto nguyenVongDto) {
		NguyenVong nguyenVong = nguyenVongDao.findNguyenVongById(nguyenVongDto.getId());
		nguyenVong.setIdHoSoXetTuyen(hoSoXetTuyenDAO.getHoSoXetTuyenById(hoSoXetTuyenService.getHoSo().getId()));
		nguyenVong.setIdToHopMon(toHopMonDAO.findToHopMonById(nguyenVongDto.getIdToHopMon()));
		nguyenVong.setDiemtbMonMot(nguyenVongDto.getDiemtbMonMot());
		nguyenVong.setDiemtbMonHai(nguyenVongDto.getDiemtbMonHai());
		nguyenVong.setDiemtbMonBa(nguyenVongDto.getDiemtbMonBa());
		return nguyenVongDao.updateNguyenVong(nguyenVong);
	}

	/**
	 * deleteNguyenVong
	 *
	 * @param id
	 * @return
	 */
	public NguyenVong deleteNguyenVong(Integer id) {
		NguyenVong nguyenVong = nguyenVongDao.findNguyenVongById(id);
		if (nguyenVongDao.destroyNguyenVong(nguyenVong)) {
			return nguyenVong;
		} else {
			return null;
		}
		
	}
}
