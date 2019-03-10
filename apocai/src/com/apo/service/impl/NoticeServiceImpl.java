package com.apo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.apo.mapper.NoticeMapper;
import com.apo.pojo.Notice;
import com.apo.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Resource
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> showAllNotice() {
		// TODO Auto-generated method stub
		return noticeMapper.selAllNotice();
	}

	@Override
	public int insNotice(Notice notice) {
		// TODO Auto-generated method stub
		return noticeMapper.insNotice(notice);
	}

	@Override
	public int updNotice(Notice notice) {
		// TODO Auto-generated method stub
		return noticeMapper.updNotice(notice);
	}

	@Override
	public Notice selNoticeById(int id) {
		// TODO Auto-generated method stub
		return noticeMapper.selNoticeById(id);
	}

	@Override
	public int delById(int id) {
		// TODO Auto-generated method stub
		return noticeMapper.delById(id);
	}
	
	
}
