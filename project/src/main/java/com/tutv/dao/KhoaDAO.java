/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutv.entity.Khoa;
import com.tutv.response.KhoaResponse;

/**
 * KhoaDAO
 */
@Repository
public interface KhoaDAO {
	
	public Khoa findKhoaById(Integer id);

	public KhoaResponse getKhoaById(Integer id);
	
	public List<KhoaResponse> getListKhoa();
	
	public Khoa createKhoa(Khoa khoa);

	public Khoa updateKhoa(Khoa khoa);

	public boolean destroyKhoa(Khoa Khoa);
}
