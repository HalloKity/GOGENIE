package com.kt.rookie.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kt.rookie.model.mapper.NosunMapper;
import com.kt.rookie.model.vo.NosunVO;

@Service
public class NosunImpl implements NosunService{
	@Resource
	private NosunMapper nosunMapper;

	@Override
	public List<NosunVO> getNosunList() {
		return nosunMapper.getNosunList();
	}
	public List<NosunVO> getNosunListByBusId(String busId) {
		return nosunMapper.getNosunListByBusId(busId);
	}
}
