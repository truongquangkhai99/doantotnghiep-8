/**
 * @package com.tutv.controller.user
 * @date Dec 21, 2021
 * @author trinh
 */
package com.tutv.controller.user;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.tutv.config.MyFile;
import com.tutv.service.HoSoXetTuyenService;

/**
 * HoSoController
 */
@Controller
public class FileController {
	
	@Autowired HoSoXetTuyenService hoSoXetTuyenService;
	 @RequestMapping(value = "user/file", method = RequestMethod.GET)
	 public String index(Model model) {
	    model.addAttribute("myFile", new MyFile());
	    return "viewfile";
	  }
	 
	 @RequestMapping(value = "user/uploadFile", method = RequestMethod.POST)
	  public String uploadFile(MyFile myFile, Model model) {
	   
	    String fileName = null;
	    try {
	    	
	      MultipartFile multipartFile = myFile.getMultipartFile();
	      fileName = multipartFile.getOriginalFilename();
	      hoSoXetTuyenService.updateFile(fileName);
	      File file = new File("D:/DoAnTotNghiep/project/src/main/webapp/imghoso", fileName);
	      multipartFile.transferTo(file);
	      
	      
	      
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
			return "viewfile";
	  }
}
