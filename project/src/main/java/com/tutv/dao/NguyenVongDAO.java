/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutv.entity.NguyenVong;
import com.tutv.response.NguyenVongResponse;

/**
 * NguyenVongDAO
 */
@Repository
public interface NguyenVongDAO {
	
	public NguyenVong findNguyenVongById(Integer id);

	public NguyenVongResponse getNguyenVongById(Integer id);

	public List<NguyenVongResponse> getListNguyenVong();

	public NguyenVong createNguyenVong(NguyenVong nguyenVong);

	public NguyenVong updateNguyenVong(NguyenVong nguyenVong);

	public boolean destroyNguyenVong(NguyenVong nguyenVong);
}