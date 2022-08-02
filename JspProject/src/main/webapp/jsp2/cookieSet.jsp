<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp2/cookieSet.jsp</title>
</head>
<body>
<%
// 쿠키 : 자바 내장객체 => 개발자 객체생성(기억장소 할당) => 시간설정 => 사용자 컴퓨터 전달
// 쿠키값 만들때 공백, 한글 포함하지 않음, 영문문자열
Cookie cookie = new Cookie("cname", "CookieValue");
// 쿠키 시간 설정
cookie.setMaxAge(1800);
// response내장객체 저장 => http전달 => 사용자 컴퓨터 전달 => 하드웨어 저장
response.addCookie(cookie);
%>
쿠키 변수 : <%=cookie %><br>
쿠키 이름 : <%=cookie.getName() %><br>
쿠키 값 : <%=cookie.getValue() %><br>
<script type="text/javascript">
	alert("쿠키값 생성");
	location.href="cookieTest.jsp";
</script>
</body>
</html>