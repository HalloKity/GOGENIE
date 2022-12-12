package com.kt.rookie.service;

import java.util.List;

import com.kt.rookie.model.vo.ReservationVO;

public interface ReservationService {

	void doReservation(ReservationVO resVO);

	List<String> getReservationList();

	List<ReservationVO> getRemainSeat(String busId);

	void deleteReservation(String reservationId);
}
