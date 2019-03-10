package com.apo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apo.pojo.Users;

public interface UsersMapper {
	
	@Select("select * from users where name=#{name} and password=#{password}")
	Users selByUser(Users user);
}
