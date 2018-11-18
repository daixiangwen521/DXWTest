package com.mybatis.Globalexceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	
	@ResponseBody
	@ExceptionHandler(RuntimeException.class)
	public Map<String,Object> exceptionHandler(){
		Map<String,Object> map=new HashMap<>();
		map.put("状态码", 500);
		map.put("提示", "运行时错误");
		return map;
	}
	
	
	@ResponseBody
	@ExceptionHandler(NullPointerException.class)
	public Map<String,Object> exceptionHandler1(){
		Map<String,Object> map=new HashMap<>();
		map.put("状态码", 500);
		map.put("提示", "空指针异常");
		return map;
	}
}
