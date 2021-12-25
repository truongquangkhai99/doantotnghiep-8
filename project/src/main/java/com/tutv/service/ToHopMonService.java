/**
 * @package com.tutv.service
 * @date Dec 12, 2021
 * @author trinh
 */
package com.tutv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutv.dao.ToHopMonDAO;
import com.tutv.dto.ToHopMonDto;
import com.tutv.entity.ToHopMon;
import com.tutv.response.ToHopMonResponse;

/**
 * ToHopMonService
 */
@Service
public class ToHopMonService {

	@Autowired 
	ToHopMonDAO toHopMonDAO;

	/**
	 * getToHopMon
	 *
	 * @param i
	 * @return
	 */
	public ToHopMonResponse getToHopMon(Integer id) {
		// TODO Auto-generated method stub
		return toHopMonDAO.getToHopMonById(id);
	}
	
	public List<ToHopMonResponse> getListToHopMon() {
		return toHopMonDAO.getListToHopMon();
	}

	/**
	 * saveToHopMon
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public ToHopMon saveToHopMon(ToHopMonDto nguyenVongDto) {
		ToHopMon nguyenVong = new ToHopMon();

//		nguyenVong.setMaToHopMon(nguyenVongDto.getMaToHopMon());
//		nguyenVong.setMoTa(nguyenVongDto.getMoTa());
//		nguyenVong.setTenToHopMon(nguyenVongDto.getTenToHopMon());
		// TODO Auto-generated method stub
		return toHopMonDAO.createToHopMon(nguyenVong);
	}

	/**
	 * updateToHopMon
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public ToHopMon updateToHopMon(ToHopMonDto nguyenVongDto) {
		ToHopMon nguyenVong = toHopMonDAO.findToHopMonById(nguyenVongDto.getId());
//		nguyenVong.setId(nguyenVongDto.getId());
//		nguyenVong.setMaToHopMon(nguyenVongDto.getMaToHopMon());
//		nguyenVong.setMoTa(nguyenVongDto.getMoTa());
//		nguyenVong.setTenToHopMon(nguyenVongDto.getTenToHopMon());
		return toHopMonDAO.updateToHopMon(nguyenVong);
	}

	/**
	 * getListToHopMonByNganh
	 *
	 * @param idNganh
	 * @return
	 */
	public List<ToHopMonResponse> getListToHopMonByNganh(Integer idNganh) {
		// TODO Auto-generated method stub
		return toHopMonDAO.getListToHopMonByNganh(idNganh);
	}
}

