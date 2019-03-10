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
			<div id="title">添加新公告</div>
		</div>	
	</div>
	<form action="../insNotice" method="post">
	<table  border="1" style="text-align:center;border-color:blue;" align="center" cellspacing="0">
			<tr>
				<td style="text-align:right">公告标题：</td><td colspan="2"><input type="text" name="title"></td>
			</tr>
			<tr>
				<td style="text-align:right">公告内容：</td><td colspan="2"><textarea name="inform" rows="5" cols="10"></textarea></td>
			</tr>
			<tr>
				<td colspan="3" style="text-align:center"><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>