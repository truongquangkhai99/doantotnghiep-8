/**
 * @package com.tutv.controller.api
 * @date Dec 12, 2021
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

import com.tutv.dto.KhoaDto;
import com.tutv.entity.Khoa;
import com.tutv.response.EntityResponse;
import com.tutv.response.KhoaResponse;
import com.tutv.service.KhoaService;

/**
 * KhoaController
 */
@Controller
@ResponseBody
public class KhoaAPIController {
	@Autowired
	private KhoaService khoaService;
	
	@RequestMapping(value = "khoa", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String showHoSo(@RequestBody KhoaDto khoaDto) throws Exception {
		KhoaResponse khoa = khoaService.getKhoa(khoaDto.getId());
		return khoa.toJson();
	}
	
	@RequestMapping(value = "khoas", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String listKhoa() throws Exception {
		List<KhoaResponse> khoa = khoaService.getListKhoa();
		return EntityResponse.toJson(khoa);
	}
	
	@RequestMapping(value = "khoa", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String createKhoa(@RequestBody KhoaDto khoaDto) throws Exception {
		
		Khoa kq = khoaService.saveKhoa(khoaDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
	@RequestMapping(value = "khoa", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String updateHoSo(@RequestBody KhoaDto khoaDto) throws Exception {
		
		Khoa kq = khoaService.updateKhoa(khoaDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
}
