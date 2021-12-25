/**
 * @package com.tutv.controller.api
 * @date Dec 24, 2021
 * @author trinh
 */
package com.tutv.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tutv.dto.NguyenVongDto;
import com.tutv.entity.NguyenVong;
import com.tutv.response.EntityResponse;
import com.tutv.response.NguyenVongResponse;
import com.tutv.service.NguyenVongService;

/**
 * NguyenVongAPUController
 */
@Controller
@ResponseBody
public class NguyenVongAPUController {
	
	@Autowired
	private NguyenVongService khoaService;
	
	@RequestMapping(value = "nguyenvong", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String showHoSo(@RequestBody NguyenVongDto khoaDto) throws Exception {
		NguyenVongResponse khoa = khoaService.getNguyenVong(khoaDto.getId());
		return khoa.toJson();
	}
	
	@RequestMapping(value = "nguyenvongs", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String listNguyenVong() throws Exception {
		List<NguyenVongResponse> khoa = khoaService.getListNguyenVong();
		return EntityResponse.toJson(khoa);
	}
	
	@RequestMapping(value = "nguyenvong", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String createNguyenVong(@RequestBody NguyenVongDto khoaDto) throws Exception {
		
		NguyenVong kq = khoaService.saveNguyenVong(khoaDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
	@RequestMapping(value = "nguyenvong", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String updateHoSo(@RequestBody NguyenVongDto khoaDto) throws Exception {
		
		NguyenVong kq = khoaService.updateNguyenVong(khoaDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
}
