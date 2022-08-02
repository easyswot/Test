<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp4/insertPro.jsp</title>
</head>
<body>
<%
// post request 한글처리
request.setCharacterEncoding("utf-8");

// request id pass name 파라미터 값 가져오기 => 변수 저장
String id = request.getParameter("id");
String pass = request.getParameter("pass");
String name=request.getParameter("name");

// 1단계 JDBC 프로그램 불러오기
Class.forName("com.mysql.cj.jdbc.Driver");

// 2단계 JDBC 프로그램 이용해서 디비서버에 접속 => 연결정보 저장
// 디비서버에 접근할 디비주소
String dbUrl="jdbc:mysql://localhost:3306/jspdb1?serverTimezone=UTC";
//디비에 접근할 아이디
String dbId="root";
//디비에 접근할 비밀번호
String dbPass="1234";
//디비연결 정보를 Connection형 con변수에 저장
Connection con = DriverManager.getConnection(dbUrl, dbId, dbPass);

// 3단계 연결정보를 이용해서 sql구문을 만들기 => PreparedStatement 내장객체 준비
// String sql="insert into 테이블이름(열이름, 열이름, 열이름) values(값, 값, 값)";
String sql="insert into members(id, pass, name, date) values(?, ?, ?, now())";
PreparedStatement pstmt=con.prepareStatement(sql);
pstmt.setString(1, id);		// 첫번째 ?에 문자열 id 변수값을 넣기
pstmt.setString(2, pass);	// 두번째 ?에 문자열 pass 변수값을 넣기
pstmt.setString(3, name);	// 세번째 ?에 문자열 name 변수값을 넣기

// 4단계 sql구문을 실행 (insert, update, delete)
pstmt.executeUpdate();

%>
회원 등록 성공 : <%=pstmt %>
<script type="text/javascript">
	alert("회원가입 성공");
	location.href="loginForm.jsp";
</script>
</body>
</html>