package com.kane.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kane.domain.Test;
import com.kane.service.TestService;

@RestController
public class TestController {

	@Resource(name = "TestService")
	TestService testService;
	
	@RequestMapping("/")
	public String Kane() {
		String pig = "我有一头大白猪呀\n"
				+ "真呀真得意\n"
				+ "有一天我心血来潮牵着去逛街\n"
				+ "我手里抱着大白猪\n"
				+ "我心里真得意\n"
				+ "不知怎么哗啦啦啦爱上一只猪\n"
				+ "                  ----大白猪之歌\n"
				+ "                  ----作者-李大帅哥\n"
				+ "                  ----献给我的大白猪-杨小美猪\n";	
		return pig;
	}
	
	@RequestMapping("/test")
	public Test findTest() {
		Test test = testService.findTestById(1);
		return test;
	}
	
}
