package com.apo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.apo.pojo.Turnover;

public interface TurnoverMapper {
	
	@Select("select time, foodname,sum(o.number) number,sum(o.number*f.marketprice) money from order1 o left join food f on o.foodid=f.id  and time like #{0} group by foodname")
	List<Turnover> selTurnover(String time);
}
