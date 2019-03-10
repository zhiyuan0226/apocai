package com.apo.service;

import java.util.List;

import com.apo.pojo.Order1;

public interface Order1Service {
	
	// 显示所有订单
	List<Order1> showAllOrder1();
	
	// 根据条件查询订单
	List<Order1> selOrder1(String name,String foodname,String time);
	
	// 确认订单
	int updConfirmOrder1(int id);
}
