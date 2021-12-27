/**
 * @package com.tutv.controller.user
 * @date Dec 21, 2021
 * @author trinh
 */
package com.tutv.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * HoSoController
 */
@Controller
public class NganhController {
	 @RequestMapping(value = "admin/nganh", method = RequestMethod.GET)
   public ModelAndView homePage() {
      ModelAndView mav = new ModelAndView("viewadminnganh");
      return mav;
   }
}
