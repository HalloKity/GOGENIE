package com.kt.rookie.model.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.kt.rookie.model.vo.NosunVO;
import com.kt.rookie.model.vo.ReservationVO;

@Mapper
public interface NosunMapper {
	ArrayList<NosunVO> getNosunList();
	
	ArrayList<NosunVO> getNosunListByBusId(String busId);
}
