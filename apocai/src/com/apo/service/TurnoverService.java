package com.apo.service;

import java.util.List;

import com.apo.pojo.Turnover;

public interface TurnoverService {
	// 查询当天营业额
	List<Turnover> selTurnover(String time);
}
