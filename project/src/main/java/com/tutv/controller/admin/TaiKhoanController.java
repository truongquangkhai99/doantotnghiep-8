/**
 * @package com.tutv.controller.admin
 * @date Dec 28, 2021
 * @author trinh
 */
package com.tutv.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * TaiKhoanController
 */
@Controller
public class TaiKhoanController {
	 @RequestMapping(value = "admin/taikhoan", method = RequestMethod.GET)
   public ModelAndView homePage() {
      ModelAndView mav = new ModelAndView("viewadmintaikhoan");
      return mav;
   }
}
