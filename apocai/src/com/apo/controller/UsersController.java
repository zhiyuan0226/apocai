package com.apo.controller;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apo.pojo.Users;
import com.apo.service.UsersService;

@Controller
public class UsersController {
	@Resource
	private UsersService usersServiceImpl;
	
	@RequestMapping("login")
	public String login(Users user,HttpServletRequest req,HttpServletResponse resp) {
		Users login = usersServiceImpl.login(user);
		if(login==null) {
			return "redirect:/error.jsp";
		}else {
			// 创建cookie信息 实现三天免登陆
			Cookie cookie=new Cookie("id", login.getId()+"");
			// 设置cookie的有效期
			cookie.setMaxAge(24*3600*3);
			// 添加cookie信息
			resp.addCookie(cookie);
			return "redirect:/main.jsp";
		}
	}
	
	@RequestMapping("ck")
	public String cookie(HttpServletRequest  req,HttpServletResponse resp) {
		Cookie[] cookies = req.getCookies();
		
		if(cookies!=null) {
			// 便利cookies
			for(Cookie c:cookies) {
				if("id".equals(c.getName())) {
					return "redirect:/main.jsp";
				}
			}
		}	
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("logout")
	public String logout(HttpServletRequest  req,HttpServletResponse resp) {
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
			// 便利cookies
			for(Cookie c:cookies) {
				if("id".equals(c.getName())) {
					c.setMaxAge(0);
					resp.addCookie(c);
					return "redirect:/index.jsp";
				}
			}
		}	
		return "redirect:/index.jsp";
	}
}
