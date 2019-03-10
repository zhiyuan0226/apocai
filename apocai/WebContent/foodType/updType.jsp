<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<div id="title">修改菜品类别</div>
		</div>	
	</div>
	<form action="updTypeById" method="post">
	<input type="hidden" value="${ foodType.id }" name="id"> 
	<table border="1" style="width=100%" align="center">
			<tr>
				<td style="width=50%" >菜品类别</td>
				<td style="width=50%">
					<input type="text" name="typename" value="${foodType.typename}" >
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交">
				</td>
			</tr>
		
	</table>
	</form>
</body>

</html>