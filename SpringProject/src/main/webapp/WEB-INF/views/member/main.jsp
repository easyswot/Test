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
// 	response.sendRedirect("loginForm.jsp");
}
%>
<%=id%>님 로그인 하셨습니다.<br>
<a href="<%=request.getContextPath()%>/member/logout">로그아웃</a><br>
<a href="<%=request.getContextPath()%>/member/info">회원정보조회</a><br>
<a href="<%=request.getContextPath()%>/member/update">회원정보수정</a><br>
<a href="<%=request.getContextPath()%>/member/delete">회원정보삭제</a><br>
<%
if(id!=null) {
	if(id.equals("admin")) {
		%>
		<a href="<%=request.getContextPath() %>/member/list">회원목록</a><br>
		<%
	}
}
%>
</body>
</html>