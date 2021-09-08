/**
 * @package com.tutv.response
 * @date Sep 7, 2021
 * @author trinh
 */
package com.tutv.response;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * EntityResponse
 */
public class EntityResponse {
	
	/**
	 * Constructor
	 */
	public EntityResponse() {
	}

	/**
	 * toJson
	 *
	 * @return String
	 * @throws Exception
	 */
	public String toJson() throws Exception {
		return toJson(this);
	}

	/**
	 * toJson
	 *
	 * @return String
	 * @throws Exception
	 */
	public static String toJson(Object entity) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
    mapper.setSerializationInclusion(Include.NON_NULL);
//		mapper.setPropertyNamingStrategy(com.fasterxml.jackson.databind.PropertyNamingStrategy.SNAKE_CASE);
		return mapper.writeValueAsString(entity);
	}

	/**
	 * equals
	 *
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		try {
			return this.toJson().equals(((EntityResponse) obj).toJson());
		} catch (Exception e) {
			return false;
		}
	}

}
