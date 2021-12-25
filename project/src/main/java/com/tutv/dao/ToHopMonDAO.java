/**
 * @package com.tutv.dao
 * @date Dec 11, 2021
 * @author trinh
 */
package com.tutv.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutv.entity.ToHopMon;
import com.tutv.response.ToHopMonResponse;

/**
 * ToHopMonDAO
 */
@Repository
public interface ToHopMonDAO {
	
	public ToHopMon findToHopMonById(Integer id);

	public ToHopMonResponse getToHopMonById(Integer id);
	
	public List<ToHopMonResponse> getListToHopMon();
	
	public List<ToHopMonResponse> getListToHopMonByNganh(Integer idNganh);
	
	public ToHopMon createToHopMon(ToHopMon toHopMon);

	public ToHopMon updateToHopMon(ToHopMon toHopMon);

	public boolean destroyToHopMon(ToHopMon toHopMon);
}
