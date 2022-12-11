package com.kt.rookie.service;

import java.util.List;

import com.kt.rookie.model.vo.NosunVO;

import java.util.List;

import com.kt.rookie.model.vo.NosunVO;

public interface NosunService {
	List<NosunVO> getNosunList();
	
	List<NosunVO> getNosunListByBusId(String busId);
}
