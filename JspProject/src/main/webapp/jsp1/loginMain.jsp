<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/loginMain.jsp</title>
</head>
<body>
<%=session.getAttribute("id") %>님 로그인 함<br>
<a href="logout.jsp">로그아웃</a>

</body>
</html>