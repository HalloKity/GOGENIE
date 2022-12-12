package com.kt.rookie.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

}
