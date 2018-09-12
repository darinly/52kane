package com.kane.repository;

import org.apache.ibatis.annotations.Select;

import com.kane.domain.Test;

public interface TestMapper {

	@Select("select * from test where id=#{id}")
	Test findTestById(Integer id);
	
}
