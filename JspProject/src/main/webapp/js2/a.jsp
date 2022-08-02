<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>a.jsp</h1>
<%
//폼에서 가져온 데이터 => 서버 내장객체 request에 저장
// request.함수()	request.getParameter("태그이름")
%>
이름 : <%=request.getParameter("tx") %><br>
주민번호 : <%=request.getParameter("jumin1") %>-
		<%=request.getParameter("jumin2") %><br>
아이디 : <%=request.getParameter("id")%><br>
비밀번호 : <%=request.getParameter("pass") %><br>
이메일 : <%=request.getParameter("email") %><br>
전화번호 : <%=request.getParameter("phone") %><br>
핸드폰번호 : <%=request.getParameter("mobile") %><br>
우편번호 : <%=request.getParameter("postcode") %>
         <%=request.getParameter("address1") %><br>
상세주소 : <%=request.getParameter("address2") %><br>
*회원분류 : <%=request.getParameter("grade") %><br>

</body>
</html>