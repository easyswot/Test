<%@page import="javax.script.ScriptContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp2/cookiePro.jsp</title>
</head>
<body>
<%
// request에 "lang" 태그(파라미터) 값 가져오기
String lang = request.getParameter("lang");
%>
폼에서 입력한 언어 설정 : <%=lang%><br>
<%
// 쿠키값 생성 => 쿠키이름 "clang",  쿠키값 폼에서 입력한 값
Cookie cookie = new Cookie("clang", lang);

// 쿠키 시간설정
cookie.setMaxAge(3600);
// 쿠키 사용자 컴퓨터에 저장
response.addCookie(cookie);
%>
<script type="text/javascript">
	alert("언어설정 쿠키값 생성");
	location.href="cookieForm.jsp";
</script>
</body>
</html>