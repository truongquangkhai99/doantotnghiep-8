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

import com.tutv.dto.ToHopMonDto;
import com.tutv.entity.ToHopMon;
import com.tutv.response.EntityResponse;
import com.tutv.response.ToHopMonResponse;
import com.tutv.service.ToHopMonService;

/**
 * ToHopMonAPIController
 */
@Controller
@ResponseBody
public class ToHopMonAPIController {
	
	@Autowired
	private ToHopMonService toHopMonService;
	
	@RequestMapping(value = "tohopmon", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String showHoSo(@RequestBody ToHopMonDto toHopMonDto) throws Exception {
		ToHopMonResponse toHopMon = toHopMonService.getToHopMon(toHopMonDto.getId());
		return toHopMon.toJson();
	}
	
	@RequestMapping(value = "tohopmons", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String listToHopMon() throws Exception {
		List<ToHopMonResponse> toHopMon = toHopMonService.getListToHopMon();
		return EntityResponse.toJson(toHopMon);
	}
	
	@RequestMapping(value = "tohopmonnganh", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String getListToHopMonByNganh(@RequestBody ToHopMonDto toHopMonDto) throws Exception {
		List<ToHopMonResponse> toHopMon = toHopMonService.getListToHopMonByNganh(toHopMonDto.getIdNganh());
		return EntityResponse.toJson(toHopMon);
	}
	
	@RequestMapping(value = "tohopmon", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String createToHopMon(@RequestBody ToHopMonDto toHopMonDto) throws Exception {
		
		ToHopMon kq = toHopMonService.saveToHopMon(toHopMonDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
	
	@RequestMapping(value = "tohopmon", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String updateHoSo(@RequestBody ToHopMonDto toHopMonDto) throws Exception {
		
		ToHopMon kq = toHopMonService.updateToHopMon(toHopMonDto);
		if (kq != null) {
			return "{\"kq\":\"ok\"}";
		}
		else {
			return "{\"kq\":\"error\"}";
		}
	}
}
