package com.apo.service;

import com.apo.pojo.Users;

public interface UsersService {
	
	// 登录功能
	// 根据登陆页面传递过来的user查询用户
	Users login(Users user);
}
