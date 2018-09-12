package com.kane.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kane.domain.Test;
import com.kane.repository.TestMapper;
import com.kane.service.TestService;

@Service("TestService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;
	
	@Transactional
	@Override
	public Test findTestById(Integer id){
		return testMapper.findTestById(id);
	}
	
}