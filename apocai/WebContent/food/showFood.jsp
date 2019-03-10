<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title></title>
<link rel="stylesheet" type="text/css" href="/apocai/css/FoodListtop.css" />
</head>
<body>

	<div>
		<div id="top" align="center">

			<div id="top_body">
				<img src="/apocai/img/content-bg.gif" />
			</div>
			<div id="top1">
				<img src="/apocai/img/left-top-right.gif" />
			</div>
			<div id="top2">
				<img src="/apocai/img/nav-right-bg.gif" />
			</div>
			<div id="title">菜单信息列表</div>
		</div>
	</div>
	<div id="body">
		<table border="1" cellspacing="0" style="text-align: center; width: 100%">
			<tr>
				<td colspan="10">菜单信息列表</td>
			</tr>
			<tr>
				<td>菜品名称</td>
				<td>展示图片</td>
				<td>原料</td>
				<td>类型</td>
				<td>说明</td>
				<td>市场价格</td>
				<td>市场价销售量</td>
				<td>会员价格</td>
				<td>会员销售量</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${list }" var="food">
			 	<tr>
					<td>${food.foodname }</td>
					<td><img src="img/${food.foodImg }" style="width: 30px; height: 30px;" /></td>
					<td>${food.material }</td>
					<td>${food.foodType.typename }</td>
					<td>${food.explain1 }</td>
					<td>${food.marketPrice }</td>
					<td>0</td>
					<td>${food.vipPrice }</td>
					<td>0</td>
					<td><a href="selFoodById?id=${food.id}" target="content">修改</a>/<a href="delFoodById?id=${food.id}" target="content">删除</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="10">
					<a href="" >上一页</a>
					<a href="">下一页</a>
				</td>
			</tr>

		</table>
	</div>

</body>
</html>