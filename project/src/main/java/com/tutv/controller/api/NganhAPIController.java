/**
 * @package com.tutv.controller.api
 * @date Dec 26, 2021
 * @author tvtu99
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

import com.tutv.dto.NganhDto;
import com.tutv.entity.Nganh;
import com.tutv.response.EntityResponse;
import com.tutv.response.NganhResponse;
import com.tutv.service.NganhService;

/**
 * NganhAPIController
 */
@Controller
@ResponseBody
public class NganhAPIController {
	
	@Autowired
	private NganhService nganhService;
	
	@RequestMapping(value = "nganh", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String showHoSo(@RequestBody NganhDto nganhDto) throws Exception {
		NganhResponse nganh = nganhService.getNganh(nganhDto.getId());
		return nganh.toJson();
	}
	
	@RequestMapping(value = "nganhs", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String listNganh() throws Exception {
		List<NganhResponse> nganh = nganhService.getListNganh();
		return EntityResponse.toJson(nganh);
	}
	
	@RequestMapping(value = "nganhkhoa", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String getListToHopMonByNganh(@RequestBody NganhDto nganhDto) throws Exception {
		List<NganhResponse> nganh = nganhService.getListNganhByKhoa(nganhDto.getIdKhoa());
		return EntityResponse.toJson(nganh);
	}
	
	@RequestMapping(value = "nganh", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String createNganh(@RequestBody NganhDto nganhDto) throws Exception {
		
		Nganh kq = nganhService.saveNganh(nganhDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
	@RequestMapping(value = "nganh", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String updateHoSo(@RequestBody NganhDto nganhDto) throws Exception {
		
		Nganh kq = nganhService.updateNganh(nganhDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
	@RequestMapping(value = "nganh", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String deleteHoSo(@RequestBody NganhDto nguyenVongDto) throws Exception {
		Nganh khoa = nganhService.deleteNganh(nguyenVongDto.getId());
		if (khoa != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
}
