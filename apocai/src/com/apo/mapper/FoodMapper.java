package com.apo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.apo.pojo.Food;

public interface FoodMapper {
	
	/**
	 * 查询全部的food信息
	 * @return
	 * sql语句：select f.id id,f.tid tid,f.foodname foodname,f.material material,f.vipPrice vipPrice, f.marketPrice marketPrice,f.explain1 explain1,f.foodImg foodImg ,t.typename `foodType.typename` from food f left join foodtype t on f.tid=t.id 
	 */
	@Select("select f.id id,f.tid tid,f.foodname foodname,f.material material,f.vipPrice vipPrice, f.marketPrice marketPrice,f.explain1 explain1,f.foodImg foodImg ,t.typename `foodType.typename` from food f left join foodtype t on f.tid=t.id order by id ")
	List<Food> selAll();
	
	/**
	 * 根据id查找食物
	 * @param id
	 * @return
	 * sql:语句
	 * select f.id id,f.tid tid,f.foodname foodname,f.material material,f.vipPrice vipPrice, f.marketPrice marketPrice,f.explain1 explain1,f.foodImg foodImg ,t.typename `foodType.typename` from food f left join foodtype t on f.tid=t.id and f.id=#{0}
	 */
	@Select("select * from food where id = #{id}")
	Food selById(int id);
	
	/**
	 * 修改食物信息
	 * @param food
	 * @return
	 */
	@Update("update food set tid=#{tid},explain1=#{explain1}, foodname=#{foodname},material=#{material},vipPrice=#{vipPrice},marketPrice=#{marketPrice}, foodImg=#{foodImg} where id=#{id}")
	int updateFood(Food food);
	
	/**
	 * 删除食物信息
	 * @param id
	 * @return
	 */
	@Delete("delete from food where id=#{id}")
	int delById(int id);
	
	// 添加food
	@Insert("insert into food values(default,#{tid},#{foodname},#{material},#{vipPrice},#{marketPrice},#{explain1},#{foodImg})")
	int insFood(Food food);
}
