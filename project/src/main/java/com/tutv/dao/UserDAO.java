/**
 * @package com.tutv.dao
 * @date Sep 7, 2021
 * @author trinh
 */
package com.tutv.dao;

import org.springframework.stereotype.Repository;
import com.tutv.response.UserResponse;

/**
 * UserDAO
 */
@Repository
public interface UserDAO {
	
	/**
	 * getUser
	 *
	 * @param id
	 * @return user
	 */
	public UserResponse getUser(Integer id);

}
