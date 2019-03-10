package com.apo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apo.pojo.Order1;
import com.apo.service.Order1Service;

@Controller
public class Order1Controller {

	@Resource
	private Order1Service order1ServiceImpl;
	
	@RequestMapping("showOrder1")
	public String showOrder1(HttpSession session) {
		List<Order1> list = order1ServiceImpl.showAllOrder1();
		if(list!=null) {
			session.setAttribute("list", list);
			return "order1/showOrder1.jsp";
		}else {
			return "error.jsp";
		}
	}
	
	@RequestMapping("searchOrder1")
	public String searchOrder1(HttpSession session) {
		List<Order1> list = order1ServiceImpl.showAllOrder1();
		if(list!=null) {
			session.setAttribute("list1", list);
			return "order1/searchOrder1.jsp";
		}else {
			return "error.jsp";
		}
	}
	
	@RequestMapping("searchOrder1ByCondition")
	public String searchOrder1ByCondition(String name,String foodname,String time,HttpSession session) {
		if("".equals(name)) {
			name="%%";
		}else {
			name="%"+name+"%";
		}
		if("".equals(foodname)) {
			foodname="%%";
		}else {
			foodname="%"+foodname+"%";
		}
		if("".equals(time)) {
			time="%%";
		}else {
			time="%"+time+"%";
		}
		List<Order1> list = order1ServiceImpl.selOrder1(name, foodname, time);
		if(list!=null) {
			session.setAttribute("list1", list);
			return "order1/searchOrder1.jsp";
		}else {
			return "error.jsp";
		}
	}
	
	@RequestMapping("confirmOrder1")
	public String confirmOrder1(int id) {
		int index = order1ServiceImpl.updConfirmOrder1(id);
		System.out.println("iiiiiiiiiii"+id);
		if(index>0) {
			return "showOrder1";
		}else {
			return "error.jsp";
		}
	}
	
}
