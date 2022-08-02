<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp4/main.jsp</title>
</head>
<body>
<%
String id = (String)session.getAttribute("id");
// 세션값이 없으면(세션값이 null이면) loginForm.jsp이동
if(id==null) {
	response.sendRedirect("loginForm.jsp");
}

%>
<%=session.getAttribute("id") %>님 로그인 하셨습니다.<br>
<a href="logout.jsp">로그아웃</a><br>
<a href="info.jsp">회원정보조회</a><br>
<a href="updateForm.jsp">회원정보수정</a><br>
<a href="deleteForm.jsp">회원정보삭제</a><br>
<%
if(id!=null) {
	if(id.equals("admin")) {
		%>
		<a href="list.jsp">회원목록</a><br>
		<%
	}
}
%>
</body>
</html>