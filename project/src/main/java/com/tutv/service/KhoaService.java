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
import com.tutv.dto.KhoaDto;
import com.tutv.entity.Khoa;
import com.tutv.response.KhoaResponse;


/**
 * KhoaService
 */
@Service
public class KhoaService {
	
	@Autowired 
	KhoaDAO khoaDAO;

	/**
	 * getKhoa
	 *
	 * @param i
	 * @return
	 */
	public KhoaResponse getKhoa(int id) {
		// TODO Auto-generated method stub
		return khoaDAO.getKhoaById(id);
	}
	
	public List<KhoaResponse> getListKhoa() {
		return khoaDAO.getListKhoa();
	}

	/**
	 * saveKhoa
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public Khoa saveKhoa(KhoaDto khoaDto) {
		Khoa khoa = new Khoa();
		
		khoa.setMaKhoa(khoaDto.getMaKhoa());
		khoa.setMoTa(khoaDto.getMoTa());
		khoa.setTenKhoa(khoaDto.getTenKhoa());
		// TODO Auto-generated method stub
		return khoaDAO.createKhoa(khoa);
	}

	/**
	 * updateKhoa
	 *
	 * @param hoSoXetTuyenDto
	 * @return
	 */
	public Khoa updateKhoa(KhoaDto khoaDto) {
		Khoa khoa = new Khoa();
		khoa.setId(khoaDto.getId());
		khoa.setMaKhoa(khoaDto.getMaKhoa());
		khoa.setMoTa(khoaDto.getMoTa());
		khoa.setTenKhoa(khoaDto.getTenKhoa());
		return khoaDAO.updateKhoa(khoa);
	}

	/**
	 * deleteKhoa
	 *
	 * @param id
	 * @return
	 */
	public Khoa deleteKhoa(Integer id) {
		Khoa khoa = khoaDAO.findKhoaById(id);
		if (khoaDAO.destroyKhoa(khoa)) {
			return khoa;
		} else {
			return null;
		}
		
	}

}
