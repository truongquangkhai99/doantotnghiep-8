/**
 * @package com.tutv.controller.api
 * @date Dec 23, 2021
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
import com.tutv.dto.TruongThptDto;
import com.tutv.entity.TruongThpt;
import com.tutv.response.EntityResponse;
import com.tutv.response.KhoaResponse;
import com.tutv.response.TruongThptResponse;
import com.tutv.service.TruongThptService;

/**
 * TruongThptAPIController
 */

@Controller
@ResponseBody
public class TruongThptAPIController {
	
	@Autowired
	private TruongThptService truongThptService;
	
	@RequestMapping(value = "truongthpt", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String showTruongThpt(@RequestBody TruongThptDto khoaDto) throws Exception {
		KhoaResponse khoa = truongThptService.getTruongThpt(khoaDto.getId());
		return khoa.toJson();
	}
	
	@RequestMapping(value = "truongthpts", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String listTruongThpt() throws Exception {
		List<TruongThptResponse> khoa = truongThptService.getListTruongThpt();
		return EntityResponse.toJson(khoa);
	}
	
	@RequestMapping(value = "truongthpt", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String createTruongThpt(@RequestBody TruongThptDto khoaDto) throws Exception {
		
		TruongThpt kq = truongThptService.saveTruongThpt(khoaDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
	@RequestMapping(value = "truongthpt", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String updateHoSo(@RequestBody TruongThptDto khoaDto) throws Exception {
		
		TruongThpt kq = truongThptService.updateTruongThpt(khoaDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}

}
