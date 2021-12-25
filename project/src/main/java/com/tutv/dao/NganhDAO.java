/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutv.entity.Nganh;
import com.tutv.response.NganhResponse;

/**
 * NganhDAO
 */
@Repository
public interface NganhDAO {
	
	public Nganh findNganhById(Integer id);

	public NganhResponse getNganhById(Integer id);
	
	public List<NganhResponse> getListNganh();
	
	public Nganh createNganh(Nganh nganh);

	public Nganh updateNganh(Nganh nganh);

	public boolean destroyNganh(Nganh nganh);

	/**
	 * getListNganhByKhoa
	 *
	 * @param idKhoa
	 * @return
	 */
	public List<NganhResponse> getListNganhByKhoa(Integer idKhoa);
}
