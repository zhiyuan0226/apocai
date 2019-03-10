<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.ResultSetMetaData" %>
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
			<div id="title">本日销售统计</div>
		</div>	
	</div>
	<form action="../selTurnoverByTime" method="post" >
		<input type="date" name="time">
		<input type="submit" value="查询">
	</form>
	<table style="border-color:blue;width:1200px;text-align:center" align="center" border="1" cellspacing="0" cellpadding="0">
		<tr>
			<td colspan="4">本日销售额统计</td>
		</tr>
		<c:forEach items="${list4}" var="turnover">
			<tr>
				<td>${turnover.time }</td>
				<td>${turnover.foodname }</td>
				<td>${turnover.number }</td>
				<td>${turnover.money }</td>
			</tr>
		
		</c:forEach>
	</table>
</body>
</html>