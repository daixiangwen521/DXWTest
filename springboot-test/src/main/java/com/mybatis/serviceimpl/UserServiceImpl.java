package com.mybatis.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.dao.UserMapper;
import com.mybatis.pojo.User;
import com.mybatis.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper usermapper;
	@Override
	public List<User> findAll() {
		
		return usermapper.findall();
	}

}
