/**
 * @package com.tutv.controller
 * @date Dec 13, 2021
 * @author trinh
 */
package com.tutv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * LoginController
 */
@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView loginPage() {
     ModelAndView mav = new ModelAndView("login");
     return mav;
  }
	
	@RequestMapping(value = "/logina", method = RequestMethod.GET)
  public ModelAndView logoutPage() {
     ModelAndView mav = new ModelAndView("login");
     return mav;
  }
	
	/**
	 * Controller logout
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/logout")
	public String logout(Model model) {
		return "login";
	}
}
