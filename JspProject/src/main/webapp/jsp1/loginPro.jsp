<%@page import="javax.script.ScriptContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/loginPro.jsp</title>
</head>
<body>
<%
// 폼에서 입력한 내용을 http가 들고 서버에 옴
// 서버에서 request, response 내장객체 객체 생성(기억장소 할당)
// request http가 들고온 값을 저장
// "id", "pass" 태그이름(파라미터이름)에 저장되어있는 값을 가져오기
String id = request.getParameter("id");
String pass = request.getParameter("pass");
%>
폼에서 입력한 아이디 : <%=id %><br>
폼에서 입력한 비밀번호 : <%=pass %><br>

<%
// 데이터베이스에 저장된 아이디 kim 비밀번호 p123
String dbId = "kim";
String dbPass = "p123";
%>
데이터베이스에 저장된 아이디 : <%=dbId %><br>
데이터베이스에 저장된 비밀번호 : <%=dbPass %><br>

<%
// 폼에서 가져온 아이디 디비 아이디 비교	동시에 폼에서 가져온 비밀번호 디비 비밀번호 비교
// 기본자료형 비교 10 == 20
// 참조형(문자열) 비교 문자열.equals(문자열)
if(id.equals(dbId) && pass.equals(dbPass)) {
	// 일치 => 로그인 인증(세션 : 연결만 되어있으면 페이지 상관없이 값을 유지) => 메인페이지 이동
			session.setAttribute("id", id);
			response.sendRedirect("loginMain.jsp");
			%>일치<%
} else {
			%>틀림
			<Script type="text/javascript">
				alert("입력하신 정보 틀림");
				history.back();
			</script>
			<%
}
%>
</body>
</html>