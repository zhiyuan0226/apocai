<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<link rel="stylesheet" type="text/css" href="/apocai/css/denglu.css" />
</head>
<body>
	<div id="top"></div>
	<div id="content">
		<div id="left">
			<img src="img/logo.png" />
			<table style="width: 262px; margin-top: 30px;">
				<tr>
					<td><img src="/apocai/img/icon-mail2.gif" />客户服务邮箱： <a
						href="www.baidu.com">admin@apsfc.com</a></td>
				</tr>
				<tr>
					<td><img src="/apocai/img/icon-phone.gif" />官方网站： <a
						href="www.baidu.com">http://www.apsfc.com</a></td>
				</tr>

				<tr>
					<td>
						<table
							style="margin-top: 50px; margin-left: 100px; font-size: 20px;">
							<tr>
								<td style="font-size: 20px;"><img src="img/icon-demo.gif" /><a
									href="#">使用说明</a></td>
							</tr>
							<tr align="center">
								<td style="font-size: 20px;"><img
									src="img/icon-login-seaver.gif" /><a href="#">在线客服</a></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</div>
		<div id="right">
		
			<table>
				<form action="login" method="get">
					<tr>
						<td colspan="2">登录网上订餐后台管理</td>
					</tr>
					<tr>
						<td>管理员：</td>
						<td><input type="text" name="name" class="input" /></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input type="password" name="password" class="input" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="checkbox" name="denglu" checked="checked" />5天内自动登录
						</td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="提交"
							style="width: 50px; height: 20px;" /></td>
					</tr>

				</form>
			</table>

		</div>
	</div>
	<p align="center" style="color: #fff;">Copyright © 2015-2020</p>
</body>
</html>