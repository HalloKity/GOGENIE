package com.kt.rookie.model.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.kt.rookie.model.vo.NosunVO;

@Mapper
public interface NosunMapper {
	ArrayList<NosunVO> getNosunList();

}
