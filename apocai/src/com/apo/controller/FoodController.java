package com.apo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apo.pojo.Food;
import com.apo.service.FoodService;

@Controller
public class FoodController {

	@Resource
	private FoodService foodServiceImpl;
	
	@RequestMapping("showFood")
	public String showAllFood(HttpSession session) {
		List<Food> list = foodServiceImpl.showAllFood();
		if(list==null) {
			return "error.jsp";
		}else {
			// 存储查到的信息
			session.setAttribute("list", list);
			return "forward:/food/showFood.jsp";
		}
	}
	
	@RequestMapping("selFoodById")
	public String update(int id,HttpSession session) {
		Food food = foodServiceImpl.selById(id);
		if(food==null) {
			return "redirect:/error.jsp";
		}else{
			session.setAttribute("food", food);
			return "forward:/selAllFoodType";
		}
	}
	
	@RequestMapping("delFoodById")
	public String delFoodById(int id) {
		int index = foodServiceImpl.delById(id);
		if(index>0) {
			return "redirect:/showFood";
		}else{
			return "redirect:/error.jsp";
		}
	}
	@RequestMapping("updateFood")
	public String updateFood(Food food,HttpServletRequest req) {
		// 解决没有修改图片的问题
		String oldFoodImg =req.getParameter("oldFoodImg") ;
		if(food.getFoodImg()=="") {
			food.setFoodImg(oldFoodImg);
		}
		System.out.println(food);
		
		int index = foodServiceImpl.updateFood(food);
		if(index>0) {
			return "redirect:/showFood";
		}else {
			return "redirect:/error.jsp";
		}
	}
	
	@RequestMapping("insFood")
	public String insFood(Food food) {
		int index = foodServiceImpl.insFood(food);
		
		if(index>0) {
			return "redirect:/showFood";
		}else {
			return "redirect:/error.jsp";
		}
	}
}
