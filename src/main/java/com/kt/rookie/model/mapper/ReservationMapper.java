package com.kt.rookie.model.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kt.rookie.model.vo.NosunVO;
import com.kt.rookie.model.vo.ReservationVO;

@Mapper
public interface ReservationMapper {
	ArrayList<ReservationVO> getRemainSeatsByBusId(String busId);
	
	void doReservation(ReservationVO resVo);

	List<ReservationVO> getReservation();

	void deleteReservation(String reservationId);
}
