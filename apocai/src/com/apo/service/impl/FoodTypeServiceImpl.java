package com.apo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apo.mapper.FoodTypeMapper;
import com.apo.pojo.FoodType;
import com.apo.service.FoodTypeService;

@Service
public class FoodTypeServiceImpl implements FoodTypeService {

	@Resource
	private FoodTypeMapper foodTypeMapper;
	@Override
	public List<FoodType> selAllFoodType() {
		// TODO Auto-generated method stub
		return foodTypeMapper.selAllFoodType();
	}
	
	@Override
	public int insFoodType(FoodType foodType) {
		// TODO Auto-generated method stub
		return foodTypeMapper.insFoodType(foodType);
	}

	@Override
	public FoodType selById(int id) {
		// TODO Auto-generated method stub
		return foodTypeMapper.selFoodTypeById(id);
	}

	@Override
	public int updTypeById(FoodType foodType) {
		// TODO Auto-generated method stub
		return foodTypeMapper.updTypeByid(foodType);
	}

	@Override
	public int delTypeById(int id) {
		// TODO Auto-generated method stub
		return foodTypeMapper.delTypeById(id);
	}

}
