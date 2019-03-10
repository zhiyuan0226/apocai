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
<title>类别信息列表</title>
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
		<div id="title">类别信息列表</div>
	</div>	
</div>
	<form action="TypeInfo" method="post">
		<table border="1" style="width:90%;text-align:center;border-color:blue;" align="center" cellspacing="0">
			<tr >
				<td style="width: 50%">类别</td>
				<td colspan="2">操作</td>
			</tr>
		
				<c:forEach items="${listFoodType }" var="foodType">
					<tr>
						<td>${foodType.typename }</td>
						<td><a href="updType?id=${foodType.id  }">修改</a>/<a href="delTypeById?id=${foodType.id  }">删除</a></td>
					</tr>
				</c:forEach>
			
		</table>
	</form>
</body>
</html>