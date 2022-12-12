package com.kt.rookie.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kt.rookie.model.mapper.ReservationMapper;
import com.kt.rookie.model.vo.ReservationVO;

@Service
public class ReservationServiceImpl implements ReservationService{
	@Resource
	private ReservationMapper reservationMapper;
	
	@Override
	public void doReservation(ReservationVO resVo) {
		reservationMapper.doReservation(resVo);
	}
}
