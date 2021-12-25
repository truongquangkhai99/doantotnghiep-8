/**
 * @package com.tutv.service
 * @date Dec 12, 2021
 * @author trinh
 */
package com.tutv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutv.dao.NguyenVongDAO;
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
		return nguyenVongDao.getListNguyenVong();
	}

	/**
	 * saveNguyenVong
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public NguyenVong saveNguyenVong(NguyenVongDto nguyenVongDto) {
		NguyenVong nguyenVong = new NguyenVong();

//		nguyenVong.setMaNguyenVong(nguyenVongDto.getMaNguyenVong());
//		nguyenVong.setMoTa(nguyenVongDto.getMoTa());
//		nguyenVong.setTenNguyenVong(nguyenVongDto.getTenNguyenVong());
		// TODO Auto-generated method stub
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
//		nguyenVong.setId(nguyenVongDto.getId());
//		nguyenVong.setMaNguyenVong(nguyenVongDto.getMaNguyenVong());
//		nguyenVong.setMoTa(nguyenVongDto.getMoTa());
//		nguyenVong.setTenNguyenVong(nguyenVongDto.getTenNguyenVong());
		return nguyenVongDao.updateNguyenVong(nguyenVong);
	}
}
