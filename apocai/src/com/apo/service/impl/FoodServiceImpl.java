package com.apo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apo.mapper.FoodMapper;
import com.apo.pojo.Food;
import com.apo.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

	@Resource
	private FoodMapper foodMapper;
	
	@Override
	public List<Food> showAllFood() {
		// TODO Auto-generated method stub
		return foodMapper.selAll();
	}

	@Override
	public Food selById(int id) {
		// TODO Auto-generated method stub
		return foodMapper.selById(id);
	}

	@Override
	public int updateFood(Food food) {
		// TODO Auto-generated method stub
		return foodMapper.updateFood(food);
	}

	@Override
	public int delById(int id) {
		// TODO Auto-generated method stub
		return foodMapper.delById(id);
	}

	@Override
	public int insFood(Food food) {
		// TODO Auto-generated method stub
		return foodMapper.insFood(food);
	}

}
