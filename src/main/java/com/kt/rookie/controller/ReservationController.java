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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kt.rookie.model.vo.ReservationVO;
import com.kt.rookie.service.ReservationService;

@Controller
public class ReservationController {
	@Resource
	private ReservationService reservationService;

	@PostMapping(value="/reservation-bus")
	@ResponseBody
	public void doReservation(@RequestBody List<ReservationVO> reservation) {	
		
		System.out.println(reservation);

		for (ReservationVO resList : reservation) {
			ReservationVO resVO = new ReservationVO();
			System.out.println(resList);
			System.out.println(resList.getReserveDate());
			resVO.setReserveDate(resList.getReserveDate());
			resVO.setBusId(resList.getBusId());
			resVO.setStationId(resList.getStationId());
			reservationService.doReservation(resVO);
		}
	}
	
	@RequestMapping("/reservation-bus")
	@ResponseBody
	public List<ReservationVO> getReservationList(){

		List<ReservationVO> resList = reservationService.getReservationList();
		System.out.println(resList);
		
		return resList;
	}
	
	@RequestMapping("/commute-bus/remain/{bus_id}")
	@ResponseBody
	public List<ReservationVO> getRemainSeat(@PathVariable("bus_id") String busId){
		
		List<ReservationVO> seats = reservationService.getRemainSeat(busId);
		System.out.println(seats);
		
		return seats;
	}
	
	@RequestMapping(value="/reservation-bus/cancel/{reservation_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void cancelReservation(@PathVariable("reservation_id") String reservationId) {	
		
		reservationService.deleteReservation(reservationId);
	
	}

}
