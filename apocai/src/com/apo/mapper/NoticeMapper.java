package com.apo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.apo.pojo.Notice;

public interface NoticeMapper {
	
	// 查询所有公告信息
	@Select("select * from notice order by updateTime desc")
	List<Notice> selAllNotice();
	
	// 添加公告信息
	@Insert("insert into notice values(default,#{title},#{inform},default,default)")
	int insNotice(Notice notice);
	
	// 通过id查公告信息
	@Select("select * from notice where id=#{id}")
	Notice selNoticeById(int id);
	
	// 修改公告信息
	@Update("update notice set title=#{title},inform=#{inform},updateTime = default,createTime=#{createTime} where id=#{id}")
	int updNotice(Notice notice);
	
	// 通过id 删除
	@Delete("delete from notice where id=#{0}")
	int delById(int id);
}
