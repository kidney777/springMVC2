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
<title>Upload</title>
</head>


<body>

		<form action="<%=basePath %>//upload/multiFileUpload.shtml" method ="post" enctype ="multipart/form-data">
		<p>大头照：<input type="file" name="bigHeadImage"></p>
		<p>大头照2：<input type="file" name="bigHeadImage1"></p>
		<p>大头照3：<input type="file" name="bigHeadImage2"></p>
<!-- 		<p>GoodID：<input type="text" name="goodId"></p> -->
		<p><input type="submit" value="上传"></p>
		</form>
</body>
</html>