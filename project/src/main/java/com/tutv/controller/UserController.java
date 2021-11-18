/**
 * @package com.tutv.controller
 * @date Sep 7, 2021
 * @author trinh
 */
package com.tutv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.tutv.response.UserResponse;
import com.tutv.service.UserService;

/**
 * UserController
 */
@Controller
@ResponseBody
public class UserController {
	/**
	 * userService
	 */
	@Autowired
	private UserService userService;

	/**
	 * Controller show
	 *
	 * @param id
	 * @return json
	 * @throws Exception
	 */
	@RequestMapping(value = "user", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String show() throws Exception {
		UserResponse user = userService.getUser(1);
		return user.toJson();
	}
}