package com.apo.service;

import java.util.List;

import com.apo.pojo.Food;

public interface FoodService {
	
	// 查询所有food信息
	List<Food> showAllFood();
	
	// 通过ID查找
	Food selById(int id);
	
	// 修改food
	int updateFood(Food food);
	
	// 通过id删除
	int delById(int id);
	
	// 新增
	int insFood(Food food);
}
