<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="/apocai/css/top.css" />
<title>Insert title here</title>
<style type="text/css">
	*{
		margin: 0px;
		padding: 0px;		
	}
	td{
		border:1px solid blue;
	}
</style>
</head>
<body bgcolor="">
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
			<div id="title">添加新类别</div>
		</div>	
	</div>
	<div style="background-color: #ECF1F9;height: 100px;padding-top: 20px;">
	<table style="width: 80%; background-color: #ECF1F9;margin-left: 10%;border:1px solid blue;border-radius: 5px;" cellspacing="0">
		
		<form action="../insFoodType" method="get">
			<tr>
				<td style="width:50%;height: 30px" ><h3 align="right">菜品类别</h3></td>
				<td style="width:50%;height: 30px"><input type="text" name="typename" ></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="提交">
				</td>
			</tr>
		</form>
	</table>
	</div>
</body>
</html>