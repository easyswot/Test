<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/logout.jsp</title>
</head>
<body>
<%
// 세션연결정보 삭제
session.invalidate();

// loginMain.jsp 이동
response.sendRedirect("loginMain.jsp");

%>

</form>
</body>
</html>