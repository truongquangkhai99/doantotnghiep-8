/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao;

import org.springframework.stereotype.Repository;

import com.tutv.entity.HoSoXetTuyen;

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

}
