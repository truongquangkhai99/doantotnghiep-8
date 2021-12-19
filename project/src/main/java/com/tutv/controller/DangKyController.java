/**
 * @package com.tutv.controller
 * @date Dec 15, 2021
 * @author trinh
 */
package com.tutv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * DangKyController
 */
@Controller
public class DangKyController {
	@RequestMapping(value = "/dangky", method = RequestMethod.GET)
  public ModelAndView dangKyPage() {
     ModelAndView mav = new ModelAndView("dangky");
     return mav;
  }
}
