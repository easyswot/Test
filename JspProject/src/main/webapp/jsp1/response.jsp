<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/response.jsp</title>
</head>
<body>
<%
//java 내장객체 - HttpServletRequest
// request 객체 생성할 때 같이 response 객체 생성
//HttpServletRequest 사용하기 위해서 웹서버가 객체생성(기억장소 할당)
//HttpServletRequest requset = new HttpServletRequest();

//jsp 내장객체 - response : 사용자 요청 정보를 처리해서 응답정보를 서버에 저장
// 						: response에 저장하면 응답정보 http에 전달
//response.setHeader("En-en") : http정보를 서버가 사용자에게 정보를 변경하도록 함
//response.setContentType("text/html; charset=UTF-8")
//								: 서버에서 사용자에게 내용타입 변경하도록 값 설정
//response.addCookie(쿠키값) : 서버에서 사용자에게 값을 전달해서 하드웨어에 값 저장
// response.sendRedirect("이동할 페이지") : 서버에서 사용자에게 이동하도록 명령을 내림
//		<a href="이동"></a>	location.href="이동"		하이퍼링크 동일하게 이돔
response.sendRedirect("request.jsp");
%>
</body>
</html>