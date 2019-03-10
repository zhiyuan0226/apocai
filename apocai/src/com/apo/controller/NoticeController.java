package com.apo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apo.pojo.Notice;
import com.apo.service.NoticeService;

@Controller
public class NoticeController {

	@Resource
	private NoticeService noticeServiceimpl;
	/**
	 * 显示所有的公告信息
	 * @param session
	 * @return
	 */
	@RequestMapping("showAllNotice")
	public String showAllNotice(HttpSession session) {
		List<Notice> list = noticeServiceimpl.showAllNotice();
		if(list!=null) {
			session.setAttribute("list", list);
			return "notice/showNotice.jsp";
		}else {
			return "error.jsp";
		}
	}
	/**
	 * 添加公告信息
	 * @param notice
	 * @return
	 */
	@RequestMapping("insNotice")
	public String insNotice(Notice notice) {
		int index = noticeServiceimpl.insNotice(notice);
		if(index>0) {
			return "showAllNotice";
		}else {
			return "error.jsp";
		}
	}
	
	/**
	 * 通过id查找 跳转至修改页面
	 * @param id
	 * @param session
	 * @return
	 */
	@RequestMapping("selNoticeById")
	public String selNoticeById(int id,HttpSession session) {
		Notice notice = noticeServiceimpl.selNoticeById(id);
		if(notice!=null) {
			System.out.println(notice);
			session.setAttribute("notice", notice);
			return "forward:notice/updNotice.jsp";
		}else {
			return "error.jsp";
		}
	}
	
	/**
	 * 修改公告
	 * @param notice
	 * @return
	 */
	@RequestMapping("updNotice")
	public String updNotice(Notice notice) {
		int index = noticeServiceimpl.updNotice(notice);
		if(index>0) {
			return "showAllNotice";
		}else {
			return "error.jsp";
		}
	}
	
	@RequestMapping("delById")
	public String delById(int id) {
		int index = noticeServiceimpl.delById(id);
		if(index>0) {
			return "showAllNotice";
		}else {
			return "error.jsp";
		}
	}
}
