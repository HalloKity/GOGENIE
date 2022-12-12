package com.kt.rookie.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kt.rookie.model.vo.ReservationVO;
import com.kt.rookie.service.ReservationService;

@Controller
public class ReservationController {
	@Resource
	private ReservationService reservationService;

	@PostMapping(value="/reservation-bus")
	@ResponseBody
	public void doReservation(@RequestBody ReservationVO reservation) {	
		System.out.println(reservation);
		ReservationVO resVO = new ReservationVO();
		resVO.setReserveDate(reservation.getReserveDate());
		resVO.setBusId(reservation.getBusId());
		resVO.setStationId(reservation.getStationId());
		reservationService.doReservation(resVO);

	}
	
	@RequestMapping("/reservation-bus")
	@ResponseBody
	public Map<String,List> getReservationList(){
		List<Map<String,String>> content = new ArrayList<Map<String, String>>();

		List<String> resList = reservationService.getReservationList();
		System.out.println(resList);
		
		Map<String, List> result = new HashMap<>();
		result.put("content", resList);
		
		return result;
	}
	
	@RequestMapping("/commute-bus/remain/{bus_id}")
	@ResponseBody
	public Map<String,List> getRemainSeat(@PathVariable("bus_id") String busId){
		List<Map<String,String>> content = new ArrayList<Map<String,String>>();
		
		List<ReservationVO> seats = reservationService.getRemainSeat(busId);
		System.out.println(seats);
		
		Map<String,List> result = new HashMap<>();
		result.put("content", seats);
		
		return result;
	}

}
