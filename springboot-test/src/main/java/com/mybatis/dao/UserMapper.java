package com.mybatis.dao;

import java.util.List;

import com.mybatis.pojo.User;

public interface UserMapper {
/*<select id="findall" resultType="com.mybatis.pojo.User">
		select * from user
	</select>*/
	public List<User> findall();
}
