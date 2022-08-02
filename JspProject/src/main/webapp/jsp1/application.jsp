<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/application.jsp</title>
</head>
<body>
<%
// java ServletContext 내장객체
//	사용자가 서버에 접속하자 마자 HttpSession 객체 생성
// HttpSession 사용하기 위해서 웹서버가 객체생성(기억장소 할당)
// ServletContext	application=new ServletContext();
// jsp 내장객체 application : 서버에 대한 정보를 저장 내장객체
//						  : 서버가 start되면 기억장소 할당, 값 계속 유지
//						  : 서버가 stop되면 기억장소 삭제

%>
서버 정보 : <%=application.getServerInfo() %><br>
서버 물리적인 경로 : <%=application.getRealPath("/") %>
서버 값 저장 : <br>
<%
application.setAttribute("app", "application value");
%>
서버 저장된 값 가져오기 : <%=application.getAttribute("app") %><br>
<%
// java PageContext 내장객체
// pageContext 사용하기 위해서 웹서버가 객체생성(기억장소 할당)
// pageContext	pageContext = new PageContext();
// jsp pageContext 내장객체 : 현 페이지 정보를 저장하는 내장객체
//						  : 페이지 변경이 되면 기존 페이지 정보는 사라지고 새롭게 기억장소에
//							할당되면서 현 페이지 정보 저장

// java JspWriter 내장객체
// JspWriter 웹서 객체생성
// JspWriter out = new JspWriter();
// jsp out 내장객체 : 출력 정보를 저장하는 내장객체
%>
출력정보를 저장하는 기억장소 크기 : <%=out.getBufferSize() %>Byte<br>
남아있는 크기 : <%=out.getRemaining() %>Byet<br>
<%
out.println("출력 정보를 저장하는 내장객체<br>");
// 출력 마무리(기억장소 삭제)
out.close();
// out.println("출력 마무리 후 출력<br>");		// err 스트림이 닫혔습니다.
%>
</body>
</html>