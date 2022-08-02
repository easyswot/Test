<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/session.jsp</title>
</head>
<body>
<%
//java 내장객체 - HttpSession
//	사용자가 서버에 접속하자마자 HttpSession 객체 생성
//HttpSession 사용하기 위해서 웹서버가 객체생성(기억장소 할당)
//HttpSession session = new HttpSession();

//jsp 내장객체 - session : 사용자와 서버 연결정보를 서버에 저장
//						: sessionId 부여

// 세션기억장소 삭제 : 1. 브라우저 닫기
//				   2. 30분 동안 작업이 멈춤
// 				   3. 세션기억장소 삭제 명령 => 로그아웃
%>
세션아이디 : <%=session.getId() %><br>
<!-- 세션아이디 : 47D2305FAAC69FF17DCCA9341808CEED -->
세션생성시간 : <%=session.getCreationTime() %><br>
세션접근시간 : <%=session.getLastAccessedTime() %><br>
세션유지시간 : <%=session.getMaxInactiveInterval() %>초<br>
세션유지시간 변경:
<%
// session.setMaxInactiveInterval(1);		// 출력이 아니고 명령이므로 <%= 안씀
%><br>
세션유지시간확인 : <%=session.getMaxInactiveInterval() %>초<br>
세션전체삭제 :
<%
// session.invalidate();
%><br>
세션기억장소 안에 값을 저장 :
<%
// session.setAttribute("ses", "sessionValue");	// value값에 공백이나 한글이 들어가면 안됨
%><br>
세션기억장소 안에 값을 가져오기 : <%=session.getAttribute("ses") %>	<%// 세션전체삭제를 하면 값이 없으므로 오류가 생김%>
</body>
</html>