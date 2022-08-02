<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp2/scopePro</title>
</head>
<body>
<h1>jsp2/scopePro.jsp</h1>
<%
// form 에서 get방식으로 
String id = request.getParameter("id");
String pass = request.getParameter("pass");

// 내장객체 값(모든 형) 저장
pageContext.setAttribute("page", "pageContext Value");
request.setAttribute("req", "request Value");
session.setAttribute("ses", "pageContext Value");
application.setAttribute("app", "application Value");
%>

아이디 : <%=id %><br>
비밀번호 : <%=pass %><br>
pageContext 내장객체 값 : <%=pageContext.getAttribute("page") %><br>
request 내장객체 값 : <%=request.getAttribute("req") %><br>
session 내장객체 값 : <%=session.getAttribute("ses") %><br>
application 내장객체 값 : <%=application.getAttribute("app") %><br>
<!-- http://localhost:8080/JspProject/jsp2/scopeProPro.jsp?id=kim&pass=1111 -->
<!-- get방식으로 주소를 만들때 공백없이 만들기 -->
<%-- <a href="scopeProPro.jsp?id=<%=id%>&pass=<%=pass%>">scopeProPro.jsp로 이동</a><br> --%>
<!-- <script type="text/javascript"> -->
<!-- 	alert("scopeProPro.jsp. 이동"); -->
<%-- 	location.href="scopeProPro.jsp?id=<%=id%>&pass=<%=pass%>"; --%>
<!-- </script> -->
<%
// response.sendRedirect("scopeProPro.jsp?id="+id+"&pass="+pass);

// 현페이지에 있는 모든 request값을 서버에 전달하는 이동방식 => forward 이동방식
// 액션태그 : jsp문법, jsp명령을 태그처럼 사용하기 위한 문법
//		  : forward - request모든 정보를 서버에 전달, 주소줄 변동 없음
%>
<%-- <jsp:forward page="scopeProPro.jsp"/> --%>
</body>
</html>