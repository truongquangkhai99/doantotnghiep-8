/**
 * @package com.tutv.service
 * @date Dec 12, 2021
 * @author trinh
 */
package com.tutv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutv.dao.TruongThptDAO;
import com.tutv.dto.TruongThptDto;
import com.tutv.entity.TruongThpt;
import com.tutv.response.KhoaResponse;
import com.tutv.response.TruongThptResponse;

/**
 * TruongThptService
 */
@Service
public class TruongThptService {

	@Autowired
	TruongThptDAO truongThptDAO;
	/**
	 * getTruongThpt
	 *
	 * @param id
	 * @return
	 */
	public KhoaResponse getTruongThpt(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * getListTruongThpt
	 *
	 * @return
	 */
	public List<TruongThptResponse> getListTruongThpt() {
		
		return truongThptDAO.getListTruongThpt();
	}

	/**
	 * saveTruongThpt
	 *
	 * @param khoaDto
	 * @return
	 */
	public TruongThpt saveTruongThpt(TruongThptDto truongThptDto) {
		TruongThpt truongThpt = new TruongThpt();
		if (truongThptDto.getKhuVucUuTien().equalsIgnoreCase("KV1")) {
			truongThpt.setDiemUuTien("0.75");
		} else if (truongThptDto.getKhuVucUuTien().equalsIgnoreCase("KV2")) {
			truongThpt.setDiemUuTien("0.25");
		} else if (truongThptDto.getKhuVucUuTien().equalsIgnoreCase("KV2-NT")) {
			truongThpt.setDiemUuTien("0.5");
		} else {
			truongThpt.setDiemUuTien("0");
		} 
		
		truongThpt.setMaTruong(truongThptDto.getMaTruong());
		truongThpt.setTenTruong(truongThptDto.getTenTruong());
		truongThpt.setKhuVucUuTien(truongThptDto.getKhuVucUuTien());
		
		return truongThptDAO.updateTruongThpt(truongThpt);
	}

	/**
	 * updateTruongThpt
	 *
	 * @param khoaDto
	 * @return
	 */
	public TruongThpt updateTruongThpt(TruongThptDto truongThptDto) {
		TruongThpt truongThpt = truongThptDAO.findTruongThptById(truongThptDto.getId());
		if (truongThptDto.getKhuVucUuTien().equalsIgnoreCase("KV1")) {
			truongThpt.setDiemUuTien("0.75");
		} else if (truongThptDto.getKhuVucUuTien().equalsIgnoreCase("KV2")) {
			truongThpt.setDiemUuTien("0.25");
		} else if (truongThptDto.getKhuVucUuTien().equalsIgnoreCase("KV2-NT")) {
			truongThpt.setDiemUuTien("0.5");
		} else {
			truongThpt.setDiemUuTien("0");
		} 
		truongThpt.setMaTruong(truongThptDto.getMaTruong());
		truongThpt.setTenTruong(truongThptDto.getTenTruong());
		truongThpt.setKhuVucUuTien(truongThptDto.getKhuVucUuTien());
		
		return truongThptDAO.updateTruongThpt(truongThpt);
		
	}

	/**
	 * deleteTruongThpt
	 *
	 * @param id
	 * @return
	 */
	public TruongThpt deleteTruongThpt(Integer id) {
		TruongThpt truongThpt = truongThptDAO.findTruongThptById(id);
		if (truongThptDAO.destroyTruongThpt(truongThpt)) {
			return truongThpt;
		} else {
			return null;
		}
		
	}

}
