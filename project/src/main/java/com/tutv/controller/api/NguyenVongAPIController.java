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
public class NguyenVongAPIController {
	
	@Autowired
	private NguyenVongService nguyenVongService;
	
	@RequestMapping(value = "nguyenvong", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String showHoSo(@RequestBody NguyenVongDto nguyenVongDto) throws Exception {
		NguyenVongResponse khoa = nguyenVongService.getNguyenVong(nguyenVongDto.getId());
		return khoa.toJson();
	}
	
	@RequestMapping(value = "nguyenvong", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String deleteHoSo(@RequestBody NguyenVongDto nguyenVongDto) throws Exception {
		NguyenVong khoa = nguyenVongService.deleteNguyenVong(nguyenVongDto.getId());
		if (khoa != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
	@RequestMapping(value = "nguyenvongs", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String listNguyenVong() throws Exception {
		List<NguyenVongResponse> khoa = nguyenVongService.getListNguyenVong();
		return EntityResponse.toJson(khoa);
	}
	
	@RequestMapping(value = "nguyenvong", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String createNguyenVong(@RequestBody NguyenVongDto nguyenVongDto) throws Exception {
		
		NguyenVong kq = nguyenVongService.saveNguyenVong(nguyenVongDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
	@RequestMapping(value = "nguyenvong", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String updateHoSo(@RequestBody NguyenVongDto nguyenVongDto) throws Exception {
		
		NguyenVong kq = nguyenVongService.updateNguyenVong(nguyenVongDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
}
