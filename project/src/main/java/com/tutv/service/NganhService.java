/**
 * @package com.tutv.service
 * @date Dec 12, 2021
 * @author trinh
 */
package com.tutv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutv.dao.NganhDAO;
import com.tutv.dto.NganhDto;
import com.tutv.entity.Nganh;
import com.tutv.response.NganhResponse;

/**
 * NganhService
 */
@Service
public class NganhService {
	
	@Autowired 
	NganhDAO toHopMonDAO;

	/**
	 * getNganh
	 *
	 * @param i
	 * @return
	 */
	public NganhResponse getNganh(Integer id) {
		// TODO Auto-generated method stub
		return toHopMonDAO.getNganhById(id);
	}
	
	public List<NganhResponse> getListNganh() {
		return toHopMonDAO.getListNganh();
	}

	/**
	 * saveNganh
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public Nganh saveNganh(NganhDto nguyenVongDto) {
		Nganh nguyenVong = new Nganh();

//		nguyenVong.setMaNganh(nguyenVongDto.getMaNganh());
//		nguyenVong.setMoTa(nguyenVongDto.getMoTa());
//		nguyenVong.setTenNganh(nguyenVongDto.getTenNganh());
		// TODO Auto-generated method stub
		return toHopMonDAO.createNganh(nguyenVong);
	}

	/**
	 * updateNganh
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public Nganh updateNganh(NganhDto nguyenVongDto) {
		Nganh nguyenVong = toHopMonDAO.findNganhById(nguyenVongDto.getId());
//		nguyenVong.setId(nguyenVongDto.getId());
//		nguyenVong.setMaNganh(nguyenVongDto.getMaNganh());
//		nguyenVong.setMoTa(nguyenVongDto.getMoTa());
//		nguyenVong.setTenNganh(nguyenVongDto.getTenNganh());
		return toHopMonDAO.updateNganh(nguyenVong);
	}

	/**
	 * getListNganhByNganh
	 *
	 * @param idNganh
	 * @return
	 */
	public List<NganhResponse> getListNganhByKhoa(Integer idKhoa) {
		// TODO Auto-generated method stub
		return toHopMonDAO.getListNganhByKhoa(idKhoa);
	}
}
