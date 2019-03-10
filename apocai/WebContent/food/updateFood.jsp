<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新菜单</title>
<link rel="stylesheet" type="text/css" href="/apocai/css/top.css" />
</head>
<body>
	<div>		
		<div id="top" align="center">
				
			<div id="top_body">
				<img src="/apocai/img/content-bg.gif"  />
			</div>
			<div id="top1">
				<img src="/apocai/img/left-top-right.gif" />
			</div>	
			<div id="top2">
				<img src="/apocai/img/nav-right-bg.gif" />
			</div>
			<div id="title">修改菜品信息</div>
		</div>	
	</div>
	<form action="../updateFood" method="post" >
	<table align="center" border="1" >	
		
		<input type="hidden" name="id" value="${food.id }">
				<tr>
				<td>菜品名称：</td>
				<td>
					<input type="text" name="foodname" value="${food.foodname }">
				</td>
			</tr>
			<tr>
				<td>原料：</td>
				<td>
					<input type="text" name="material" value="${food.material }">
				</td>
			</tr>
			<tr>
				<td>市场价格：</td>
				<td>
					<input type="text" name="marketPrice"value="${food.marketPrice}">
				</td>
			</tr>
			<tr>
				<td>会员价格：</td>
				<td>
					<input type="text" name="vipPrice"value="${food.vipPrice}">
				</td>
			</tr>
			<tr>
				<td>说明：</td>
				<td>
					<input type="text" name="explain1"value="${food.explain1}">
				</td>
			</tr>
				<tr>
				<td>菜品类别：</td>
				<td>
					<input type="hidden" name="oldtid" value="${food.tid }">
					<select name="tid">	
						<c:forEach items="${listFoodType}" var="foodtype">
							<c:choose> 
							   <c:when test="${ foodtype.id==food.tid}">
							   		<option value="${ foodtype.id}" selected="selected">${ foodtype.typename}</option>
							   </c:when>
							   <c:otherwise>
							   		<option value="${ foodtype.id}">${ foodtype.typename}</option>
							   </c:otherwise> 
							</c:choose> 
						</c:forEach>
									
					</select>		
				</td>
			</tr>
			<tr>
				<td>展示图片:</td>
				<td>
					<img src="../img/${food.foodImg}"  style="width:100px;height:100px" />
					<input type="hidden" name="oldFoodImg" value="${food.foodImg }"/>
					<input type="file"  name="foodImg" />
				</td>
			</tr>
			<tr align="center">
				<td colspan="2" >
					<input  type="submit" value="提交查询内容"/>
				</td>
			</tr>
	</table>
	</form>
</body>
</html>