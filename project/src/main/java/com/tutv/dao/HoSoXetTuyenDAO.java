/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutv.entity.HoSoXetTuyen;
import com.tutv.response.HoSoXetTuyenResponse;

/**
 * HoSoXetTuyenDAO
 */
@Repository
public interface HoSoXetTuyenDAO {

	/**
	 * saveHoSo
	 *
	 * @param hoSoXetTuyen
	 * @return
	 */
	HoSoXetTuyen saveHoSo(HoSoXetTuyen hoSoXetTuyen);

	/**
	 * updateHoSo
	 *
	 * @param hoSoXetTuyen
	 * @return
	 */
	void updateHoSo(HoSoXetTuyen hoSoXetTuyen);

	/**
	 * getListHoSo
	 *
	 * @return
	 */
	List<HoSoXetTuyenResponse> getListHoSo();
	
	HoSoXetTuyenResponse getHoSo(Integer idTaiKhoan);

}
