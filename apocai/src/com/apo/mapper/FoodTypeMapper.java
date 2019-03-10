package com.apo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.apo.pojo.FoodType;

public interface FoodTypeMapper {

	// 根据 id 查找食物类别
	@Select("select * from foodtype where id=#{0}")
	FoodType selFoodTypeById(int id);
	
	// 查找所有的食物类别
	@Select("select * from foodtype")
	List<FoodType> selAllFoodType();
	
	/**
	 *  添加食物类别
	 */
	@Insert("insert into foodtype values(default,#{typename})")
	int insFoodType(FoodType foodType);
	
	// 修改食物类别
	@Update("update foodtype set typename=#{typename} where id=#{id}")
	int updTypeByid(FoodType foodType);
	
	// 通过id删除食物
	
	@Delete("delete from foodtype where id=#{0}")
	int delTypeById(int id);
}
