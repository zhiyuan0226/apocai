package com.apo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apo.mapper.Order1Mapper;
import com.apo.pojo.Order1;
import com.apo.service.Order1Service;

@Service
public class Order1ServiceImpl implements Order1Service{
	@Resource
	private Order1Mapper order1Mapper;
	@Override
	public List<Order1> showAllOrder1() {
		// TODO Auto-generated method stub
		return order1Mapper.selAllOrder1();
	}
	@Override
	public List<Order1> selOrder1(String name, String foodname, String time) {
		// TODO Auto-generated method stub
		return order1Mapper.selOrder1(name, foodname, time);
	}
	@Override
	public int updConfirmOrder1(int id) {
		// TODO Auto-generated method stub
		return order1Mapper.updOrder1State(id);
	}

}
