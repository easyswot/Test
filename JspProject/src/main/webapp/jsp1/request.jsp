<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/request.jsp</title>
</head>
<body>
<%
// java 내장객체 - HttpServletRequest
// HttpServletRequest 사용하기 위해서 웹서버가 객체생성(기억장소 할당)
// HttpServletRequest requset = new HttpServletRequest();

// jsp 내장객체 - request : 기억장소, 사용자의 요청정보를 서버에 저장
//						: 태그(파라미터)정보, 서버정보, 클라이언트정보, 세션정보, 쿠키정보, http정보
%>
서버 정보 : <%=request.getServerName() %><br>
서버 포트 : <%=request.getServerPort() %><br>
URL 정보 : <%=request.getRequestURL() %><br>
URI 정보 : <%=request.getRequestURI() %><br>
프로토콜(통신규약) : <%=request.getProtocol() %><br>
요청방식 : <%=request.getMethod() %><br>
프로젝트(컨텍스트) 경로 : <%=request.getContextPath() %><br>
서버물리적인 경로 : <%=request.getRealPath("/") %><br>
사용자 IP주소 : <%=request.getRemoteAddr() %><br>
http 브라우저(한글) : <%=request.getHeader("accept-language") %><br>
http 브라우저(종류) : <%=request.getHeader("user-agent") %><br>
</body>
</html>