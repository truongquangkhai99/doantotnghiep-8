/**
 * @package com.tutv.service
 * @date Dec 12, 2021
 * @author trinh
 */
package com.tutv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutv.dao.KhoaDAO;
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
	
	@Autowired KhoaDAO khoaDAO;

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
	public Nganh saveNganh(NganhDto nganhDto) {
		Nganh nganh = new Nganh();
		nganh.setIdKhoa(khoaDAO.findKhoaById(nganhDto.getIdKhoa()));
		nganh.setMaNganh(nganhDto.getMaNganh());
		nganh.setTenNganh(nganhDto.getTenNganh());
		return toHopMonDAO.createNganh(nganh);
	}

	/**
	 * updateNganh
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public Nganh updateNganh(NganhDto nganhDto) {
		Nganh nganh = toHopMonDAO.findNganhById(nganhDto.getId());
		nganh.setIdKhoa(khoaDAO.findKhoaById(nganhDto.getIdKhoa()));
		nganh.setMaNganh(nganhDto.getMaNganh());
		nganh.setTenNganh(nganhDto.getTenNganh());
		return toHopMonDAO.updateNganh(nganh);
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

	/**
	 * deleteNganh
	 *
	 * @param id
	 * @return
	 */
	public Nganh deleteNganh(Integer id) {
		Nganh nganh = toHopMonDAO.findNganhById(id);
		if (toHopMonDAO.destroyNganh(nganh)) {
			return nganh;
		} else {
			return null;
		}
		
	}
}
