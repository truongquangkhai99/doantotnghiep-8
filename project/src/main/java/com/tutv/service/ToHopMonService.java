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
	
	@Autowired NganhDAO nganhDAO;

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
	public ToHopMon saveToHopMon(ToHopMonDto toHopMonDto) {
		ToHopMon toHopMon = new ToHopMon();
		toHopMon.setIdNganh(nganhDAO.findNganhById(toHopMonDto.getIdNganh()));
		toHopMon.setMaToHopMon(toHopMonDto.getMaToHopMon());
		return toHopMonDAO.createToHopMon(toHopMon);
	}

	/**
	 * updateToHopMon
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public ToHopMon updateToHopMon(ToHopMonDto toHopMonDto) {
		ToHopMon toHopMon = toHopMonDAO.findToHopMonById(toHopMonDto.getId());
		toHopMon.setIdNganh(nganhDAO.findNganhById(toHopMonDto.getIdNganh()));
		toHopMon.setMaToHopMon(toHopMonDto.getMaToHopMon());
		return toHopMonDAO.updateToHopMon(toHopMon);
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

	/**
	 * deleteToHopMon
	 *
	 * @param id
	 * @return
	 */
	public ToHopMon deleteToHopMon(Integer id) {
		ToHopMon toHopMon = toHopMonDAO.findToHopMonById(id);
		if (toHopMonDAO.destroyToHopMon(toHopMon)) {
			return toHopMon;
		} else {
			return null;
		}
		
	}
}

