<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<body>

	<h1>hello jsp</h1>
	<form action="<%=basePath%>/test6.shtml" method="get">
		<p>
			用户： <input type="text" name="user">
		</p>
		<p>
			年&nbsp;龄: <input type="text" name="age">
		</p>

		<p>
			密&nbsp;码： <input type="text" name="pass">
		</p>

		<p>
			<input type="submit" value="submit">
		</p>
	</form>
</body>
</html>