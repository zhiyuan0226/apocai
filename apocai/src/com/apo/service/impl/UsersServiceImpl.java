package com.apo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apo.mapper.UsersMapper;
import com.apo.pojo.Users;
import com.apo.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;
	
	@Override
	public Users login(Users user) {
		// TODO Auto-generated method stub
		//返回查询的Users
		return usersMapper.selByUser(user);
	}

}
