<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>后台管理系统</title>
        <link rel="stylesheet" type="text/css" href="/apocai/css/index1.css" />
    </head>
    <body>
    	<!--
        	作者：offline
        	时间：2018-07-31
        	描述：顶部
        -->
    		<div id="top-left"></div>
			<div id="top-right">
				<a id="top-img" href="logout"></a>
			</div>
			
			
			<!--
            	作者：offline
            	时间：2018-07-31
            	描述：left内容
            -->
			<div id="left">
				<ul>
					<li class="menu">
						<b>菜单管理</b>						
							<li>
								<img src="/apocai/img/menu_topline.gif" />
							</li>
							
							<li class="menus">
								<a href="selAllFoodTypeToIns" target="content">添加新菜单</a>
							</li>
							<li class="menus">
								<a href="showFood" target="content">菜单信息列表</a>
							</li>
					</li>
					<li class="menu">
						<b>菜单类别管理</b>						
							<li>
							<img src="/apocai/img/menu_topline.gif" />
							</li>
							<li class="menus">
								<a href="foodType/addType.jsp"  target="content">添加新类别</a>
							</li>
							<li class="menus">
								<a href="showFoodType" target="content">类别信息列表</a>
							</li>
					</li>
					<li class="menu">
						<b>公告信息管理</b>						
							<li>
							<img src="/apocai/img/menu_topline.gif" />
							</li>
							<li class="menus">
								<a href="notice/addNotice.jsp" target="content">添加新公告</a>
							</li>
							<li class="menus">
								<a href="showAllNotice" target="content">通告信息列表</a>
							</li>
					</li>
					<li class="menu">
						<b>销售订单管理</b>						
							<li>
							<img src="/apocai/img/menu_topline.gif" />
							</li>
							<li class="menus">
								<a href="showOrder1" target="content">销售订单信息列表</a>
							</li>
							<li class="menus">
								<a href="searchOrder1" target="content">销售订单信息查询</a>
							</li>
							<li class="menus">
								<a href="order1/turnover.jsp" target="content">本日销售统计</a>
							</li>
					</li>
					<li class="fmenu"><a href="Staff1" target="content"><b>系统用户管理</b></a></li>
					<li class="fmenu"><a href="logout"><b>注销退出</b></a></li>
				</ul>
				
			</div>
			<!--
            	作者：offline
            	时间：2018-07-31
            	描述：右边内容 就是一个框架标签
            -->
			<div id="right">
			<iframe src= "showFood" name="content">		
				
			</iframe>
			</div>
 	</body>
</html>