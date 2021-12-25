/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutv.entity.TruongThpt;
import com.tutv.response.TruongThptResponse;

/**
 * TruongThptDAO
 */
@Repository
public interface TruongThptDAO {

	public TruongThpt findTruongThptById(Integer id);

	public TruongThptResponse getTruongThptById(Integer id);
	
	public List<TruongThptResponse> getListTruongThpt();
	
	public TruongThpt createTruongThpt(TruongThpt truongThpt);

	public TruongThpt updateTruongThpt(TruongThpt truongThpt);

	public boolean destroyTruongThpt(TruongThpt truongThpt);
	
}
