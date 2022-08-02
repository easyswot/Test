<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp3/updatePro.jsp</title>
</head>
<body>
<%
// form post request 한글처리
request.setCharacterEncoding("utf-8");

// request num name 파라미터값 저장 => 가져오기
int num = Integer.parseInt(request.getParameter("num"));
String name = request.getParameter("name");

// 1단계 JDBC 프로그램 불러오기
Class.forName("com.mysql.cj.jdbc.Driver");

// 2단계 JDBC 프로그램 이용해서 디비서버에 접속 => 연결정보 저장
// 디비서버에 접근할 디비주소
String dbUrl="jdbc:mysql://localhost:3306/jspdb1?serverTimezone=UTC";
// 디비에 접근할 아이디
String dbId="root";
// 디비에 접근할 비밀번호
String dbPass="1234";
// 디비연결 정보를 Connection형 con변수에 저장
Connection con = DriverManager.getConnection(dbUrl, dbId, dbPass);

// 3단계 연결정보를 이용해서 sql구문을 만들기 => PreparedStatement 내장객체 준비
// String sql="update 테이블이름 set 수정열=값 where 조건열=값";
String sql="update student set name=? where num=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, name);
pstmt.setInt(2, num);

// 4단계 sql구문을 실행 (insert, update, delete)
pstmt.executeUpdate();
%>

학생 수정 성공 : <%=pstmt %>

</body>
</html>