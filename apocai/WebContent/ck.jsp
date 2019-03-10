<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:forward page="ck" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script language="javascript" type="text/javascript"> 
/* // 以下方式直接跳转
window.location.href='hello.html'; */
// 以下方式定时跳转
setTimeout("javascript:location.href='/ck'", 5000); 
</script>
<body>
111
</body>
</html>