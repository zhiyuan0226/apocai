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
 <title>销售列表</title>
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
			<div id="title">销售订单查询</div>
		</div>	
	</div>
    <form action="searchOrder1ByCondition" method="post">
	    <table style="border-color:blue;margin-top:50px;margin-bottom:50px;width:1200px" align="center" border="1" cellspacing="0" cellpadding="0">
		    <tr>
		   	 	<td style="text-align:right">按用户名查询</td>
		   	 	<td><input type="text" name="name"></td>
		    </tr>
		    <tr>
		     	<td style="text-align:right">按菜品名称查询</td>
		     	<td><input type="text" name="foodname"></td>
		    </tr>
		    <tr>
		     	<td style="text-align:right">按销售日期查询</td>
		     	<td><input type="date" name="time">
		     	<input type="submit" value="提交"></td>
		    <tr>
	    </table>
	    
   <table style="border-color:blue;width:1200px;text-align:center" align="center" border="1" cellspacing="0" cellpadding="0">
    		<tr>
    			<td colspan="12">销售订单查询结果信息列表</td>
    		</tr>
    		<tr>
    			<td >订单号</td>
    			<td >顾客姓名</td>
    			<td >食物</td>
    			<td >数量</td>
    			<td >价格</td>
    			<td >地址</td>
    			<td >联系方式</td>
    			<td >时间</td>
    			<td >状态</td>
    		</tr>
    		<c:forEach	items="${list1}" var="order1">
    			<tr>
    				<td >${order1.id }</td>
    				<td >${order1.name }</td>
    				<td >${order1.foodName }</td>
    				<td >${order1.foodNumber}</td>
    				<td >${order1.money }</td>
    				<td >${order1.address }</td>
    				<td >${order1.phone }</td>
    				<td >${order1.time }</td>
    				<td >${order1.state }</td>
    			</tr>
    		</c:forEach>
    	</table>
 	</body>
</html>