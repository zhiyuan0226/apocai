package com.apo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apo.pojo.Turnover;
import com.apo.service.TurnoverService;

@Controller
public class TurnoverController {
	@Resource
	private TurnoverService turnoverServiceImpl;
	
	@RequestMapping("selTurnoverByTime")
	public String selTurnoverByTime(String time,HttpSession session) {
		if("".equals(time)) {
			time="%%";
		}else {
			time="%"+time+"%";
		}
		
		List<Turnover> list = turnoverServiceImpl.selTurnover(time);
		if(list!=null) {
			session.setAttribute("list4", list);
			return "order1/turnover.jsp";
		}else {
			return "error.jsp";
		}
	}
}
