package com.apo.service;

import java.util.List;

import com.apo.pojo.FoodType;

public interface FoodTypeService {
	// 查找所有的
    List<FoodType> selAllFoodType();
    
    // 增加类别
    int insFoodType(FoodType foodType);
    
    // 通过id查类别
    FoodType selById(int id);
    
    // 通过id修改类别
    int updTypeById(FoodType foodType);
    
    // 通过id删除
    int delTypeById(int id);
}
