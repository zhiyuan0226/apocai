<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/apocai/css/top.css" />
<title>Insert title here</title>
</head>
<body>
	<div>		
		<div id="top" align="center" >
				
			<div id="top_body">
				<img src="/apocai/img/content-bg.gif"  />
			</div>
			<div id="top1">
				<img src="/apocai/img/left-top-right.gif" />
			</div>	
			<div id="top2">
				<img src="/apocai/img/nav-right-bg.gif" />
			</div>
			<div id="title">通告信息列表</div>
		</div>	
	</div>
	
	<table border="1" style="text-align:center;border-color:blue;width: 90%" align="center" cellspacing="0">
		<tr style="height: 60px ">
			<td colspan="5">公告信息列表</td>
		</tr>
		<tr style="height: 60px ">
			<td  style="width:10% ">标题</td>
			<td  >内容</td>
			<td  style="width:10% ">添加时间</td>
			<td  style="width:10% ">修改时间</td>
			<td  style="width:10% ">操作</td>
		</tr>
		<c:forEach items="${list}" var="notice">
			<tr style="height: 60px ">
				<td>${notice.title }</td>
				<td>${notice.inform }</td>
				<td>${notice.createTime }</td>
				<td>${notice.updateTime }</td>
				<td><a href="selNoticeById?id=${notice.id }">修改</a>/<a href="delById?id=${notice.id }">删除</a></td>
			</tr>
		</c:forEach>
		
			
	
	</table>

</body>

</html>