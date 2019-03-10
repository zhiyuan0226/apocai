package com.apo.service;

import java.util.List;

import com.apo.pojo.Notice;

public interface NoticeService {
	
	// 显示所有公告信息
	List<Notice> showAllNotice();
	
	// 添加公告
	int insNotice(Notice notice);
	
	// 通过id查公告信息
	Notice selNoticeById(int id);
	
	// 修改公告
	int updNotice(Notice notice);
	
	// 删除公告
	int delById(int id);
}
