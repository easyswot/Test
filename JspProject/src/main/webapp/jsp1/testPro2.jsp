<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/testPro2.jsp</title>
</head>
<body>
<%
// request에 저장된 값은 String 형
// get방식 기본방식
// post방식 form태그에서만 사용 => 한글 처리 안되어 있음
// request.getParameter() 사용하기 전에 한글 처리 설정
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String pass = request.getParameter("pass");
String name = request.getParameter("name");
String sage = request.getParameter("age");
// 문자열을 정수형으로 변경
// 기본자료형(int age)	- 참조형(String sage)	이므로 형변환이 안됨
int age = Integer.parseInt(sage);
%>
아이디 : <%=id %><br>
비밀번호 : <%=pass %><br>
이름 : <%=name %><br>
나이 : <%=age %><br>
<%
if(age < 20) {
	// 미성년입니다.
	%>
	
	미성년입니다
	
	<%
}
%>
</body>
</html>