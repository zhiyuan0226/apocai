package com.apo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apo.mapper.TurnoverMapper;
import com.apo.pojo.Turnover;
import com.apo.service.TurnoverService;

@Service
public class TurnoverServiceImpl implements TurnoverService {

	@Resource
	private TurnoverMapper turnoverMapper;
	@Override
	public List<Turnover> selTurnover(String time) {
		// TODO Auto-generated method stub
		return turnoverMapper.selTurnover(time);
	}

}
