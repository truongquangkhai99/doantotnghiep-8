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

	HoSoXetTuyen getHoSoXetTuyenById(Integer id);

	HoSoXetTuyen saveHoSo(HoSoXetTuyen hoSoXetTuyen);


	HoSoXetTuyen updateHoSo(HoSoXetTuyen hoSoXetTuyen);


	List<HoSoXetTuyenResponse> getListHoSo();
	
	HoSoXetTuyenResponse getHoSo(Integer idTaiKhoan);

}
