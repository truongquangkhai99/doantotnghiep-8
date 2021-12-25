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
	public TruongThpt saveTruongThpt(TruongThptDto khoaDto) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * updateTruongThpt
	 *
	 * @param khoaDto
	 * @return
	 */
	public TruongThpt updateTruongThpt(TruongThptDto khoaDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
