package com.apo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apo.pojo.FoodType;
import com.apo.service.FoodTypeService;

@Controller
public class FoodTypeController {
	
	@Resource
	private FoodTypeService foodTypeServiceimpl;
	
	// 查找所有类别 跳转至修改food页面
	@RequestMapping("selAllFoodType")
	public String selFoodType(HttpSession session) {
		List<FoodType> listFoodType = foodTypeServiceimpl.selAllFoodType();
		if(listFoodType==null) {
			return "redirect:/error.jsp";
		}else {
			session.setAttribute("listFoodType", listFoodType);
			return "redirect:/food/updateFood.jsp";
		}
	}
	
	// 查找所有类别 跳转至添加food页面
	
	@RequestMapping("selAllFoodTypeToIns")
	public String selAllFoodTypeToIns(HttpSession session) {
		List<FoodType> listFoodType = foodTypeServiceimpl.selAllFoodType();
		if(listFoodType==null) {
			return "redirect:/error.jsp";
		}else {
			session.setAttribute("listFoodType", listFoodType);
			return "redirect:/food/addFood.jsp";
		}
	}
	
	// 展示所有类别
	@RequestMapping("showFoodType")
	public String showFoodType(HttpSession session) {
		
		List<FoodType> listFoodType = foodTypeServiceimpl.selAllFoodType();
		System.out.println(listFoodType);
		if(listFoodType==null) {
			return "redirect:/error.jsp";
		}else {
			session.setAttribute("listFoodType", listFoodType);
			return "forward:/foodType/showType.jsp";
		}
	}
	
	// 添加
	@RequestMapping("insFoodType")
	public String insFoodType(FoodType foodType) {
		int index = foodTypeServiceimpl.insFoodType(foodType);
		if(index>0) {
			return "showFoodType";
		}else {
			return "redirect:/errpr.jsp";
		}
	}
	
	// 修改
	
	@RequestMapping("updType")
	public String updType(int id,HttpSession session) {
		FoodType foodType = foodTypeServiceimpl.selById(id);
		
		if(foodType!=null) {
			session.setAttribute("foodType", foodType);
			return "foodType/updType.jsp";
		}else {
			return "forward:/errpr.jsp";
		}
	}
	
	// 通过id修改
	
		@RequestMapping("updTypeById")
		public String updTypeById(FoodType foodType) {
			int index = foodTypeServiceimpl.updTypeById(foodType);
			
			if(index>0) {
				return "showFoodType";
			}else {
				return "forward:/errpr.jsp";
			}
		}
		
		// 通过id 删除
		
		@RequestMapping("delTypeById")
		public String delTypeById(int id) {
			int index = foodTypeServiceimpl.delTypeById(id);
			
			if(index>0) {
				return "showFoodType";
			}else {
				return "forward:/errpr.jsp";
			}
		}
}
