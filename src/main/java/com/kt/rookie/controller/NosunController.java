package com.kt.rookie.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kt.rookie.model.vo.NosunVO;
import com.kt.rookie.service.NosunService;

@Controller
public class NosunController {
	@Resource
	private NosunService nosunService;
	
	@RequestMapping("/commute-bus")
	@ResponseBody
	public List<NosunVO> getNosunList(Model model) {

		List<NosunVO> nosunList = nosunService.getNosunList();
		for(NosunVO vo :nosunList) {
			Map<String,String> nosun = new HashMap<>();
			nosun.put("station_id", vo.getStationId());
			nosun.put("bus_id", vo.getBusId());
			nosun.put("commute_id", vo.getCommuteId());
			nosun.put("line", vo.getLine());
			nosun.put("main_place",vo.getMainPlace());
			nosun.put("detail_place", vo.getDetailPlace());
			nosun.put("departure_time",vo.getDepartureTime());
			nosun.put("office_place",vo.getOfficePlace());
			nosun.put("office_time", vo.getOfficeTime());
			nosun.put("latitude",vo.getLatitude().toString());
			nosun.put("longtitude", vo.getLongitude().toString());
		}
		return nosunList;
	}
	
	@RequestMapping("/commute-bus/{bus_id}")
	@ResponseBody
	public List<NosunVO> getNosunListByBusId(@PathVariable("bus_id") String busId) {

		List<NosunVO> nosunList = nosunService.getNosunListByBusId(busId);
		for(NosunVO vo :nosunList) {
			Map<String,String> nosun = new HashMap<>();
			nosun.put("bus_id", vo.getBusId());
			nosun.put("station_id", vo.getStationId());
			nosun.put("main_place",vo.getMainPlace());
			nosun.put("detail_place", vo.getDetailPlace());
			nosun.put("departure_time",vo.getDepartureTime());
			nosun.put("latitude",vo.getLatitude().toString());
			nosun.put("longtitude", vo.getLongitude().toString());
		}
		
		return nosunList;
	}
}
