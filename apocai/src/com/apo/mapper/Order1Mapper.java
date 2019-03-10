package com.apo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.apo.pojo.Order1;

public interface Order1Mapper {
	
	// 查询所有订单
	@Select("select o.id,c.name,f.foodname,o.number foodNumber,f.marketprice*o.number money ,c.address,c.phone,o.state,o.time from order1 o ,food f ,customer c where o.cid=c.id and o.foodid=f.id order by time desc")
	List<Order1> selAllOrder1();
	
	// 根据条件查询订单
	@Select("select *\r\n" + 
			" from (select o.id,c.name,f.foodname,o.number foodNumber,f.marketprice*o.number money ,c.address,c.phone,o.state,o.time from order1 o ,food f ,customer c where o.cid=c.id and o.foodid=f.id) s\r\n" + 
			" where name like #{0} and foodname like #{1} and time like #{2} order by time desc")
	List<Order1> selOrder1(String name,String foodname,String time);
	
	// 确认订单
	@Update("update order1 set state=1 where id=#{0}")
	int updOrder1State(int id);
}
