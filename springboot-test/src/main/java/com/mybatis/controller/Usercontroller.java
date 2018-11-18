package com.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mybatis.pojo.User;
import com.mybatis.service.UserService;

@Controller
@RequestMapping("/")
public class Usercontroller {
	@Autowired
	private UserService uservice;
	/*验证链接*/
	@RequestMapping("index")
	@ResponseBody
	public List<User> findALL(){
		return uservice.findAll();
	}

	/*全局运行时异常配置*/
	@RequestMapping("index1")
	@ResponseBody
	public Integer findALL1(){
		Integer i=1/0;
		return i;
	}
	
	/*空指针异常配置*/
	@RequestMapping("index2")
	@ResponseBody
	public Integer findALL2(){
		Integer i = null;
		return i+1;
	}
}
