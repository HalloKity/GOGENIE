package com.kt.rookie.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kt.rookie.model.mapper.NosunMapper;
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

	@Override
	public List<ReservationVO> getReservationList() {
		// TODO Auto-generated method stub
		return reservationMapper.getReservation();
	}

	public List<ReservationVO> getRemainSeat(String busId) {
		// TODO Auto-generated method stub
		return reservationMapper.getRemainSeatsByBusId(busId);
	}

	@Override
	public void deleteReservation(String reservationId) {
		// TODO Auto-generated method stub
		reservationMapper.deleteReservation(reservationId);
	}
}
