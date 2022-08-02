<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp3/insertPro.jsp</title>
</head>
<body>
<%
// form	post 한글처리
request.setCharacterEncoding("utf-8");

// request	num	name 파라미터값 저장
int num = Integer.parseInt(request.getParameter("num"));
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
// String sql="insert into 테이블이름(열이름, 열이름) values(값, 값)";
// String sql="insert into 테이블이름(num, name) values(1, '홍길동')";
// String sql="insert into student(num, name) values("+num+", '"+name+"')";
String sql="insert into student(num, name) values(?, ?)";
PreparedStatement pstmt=con.prepareStatement(sql);
pstmt.setInt(1, num);		// 첫번째 ?에 정수형 num 변수값을 넣기
pstmt.setString(2, name);	// 두번째 ?에 문자열 name 변수값을 넣기

// 4단계 sql구문을 실행 (insert, update, delete)
pstmt.executeUpdate();


%>
학생 등록 성공 : <%=pstmt %>

</body>
</html>