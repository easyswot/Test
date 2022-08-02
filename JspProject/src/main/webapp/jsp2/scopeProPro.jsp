<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp2/scopeProPro.jsp</title>
</head>
<body>
<h1>jsp2/scopeProPro.jsp</h1>
<%
// request에 저장된 파라미터(태그)값 가져오기 => 변수 저장
String id = request.getParameter("id");
String pass = request.getParameter("pass");
%>

아이디 : <%=id %><br>
비밀번호 : <%=pass %><br>
pageContext 내장객체 값 : <%=pageContext.getAttribute("page") %><br>
request 내장객체 값 : <%=request.getAttribute("req") %><br>
session 내장객체 값 : <%=session.getAttribute("ses") %><br>
application 내장객체 값 : <%=application.getAttribute("app") %><br>
</body>
</html>