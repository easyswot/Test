<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp4/info.jsp</title>
</head>
<body>
<%
// 로그인하면 세션값이 생성 => 페이지 상관없이 값이 유지 => 세션값 가져오기
String id=(String)session.getAttribute("id");

// 1단계
Class.forName("com.mysql.cj.jdbc.Driver");

// 2단계
// 디비서버에 접근할 디비주소
String dbUrl="jdbc:mysql://localhost:3306/jspdb1?serverTimezone=UTC";
//디비에 접근할 아이디
String dbId="root";
//디비에 접근할 비밀번호
String dbPass="1234";
//디비연결 정보를 Connection형 con변수에 저장
Connection con = DriverManager.getConnection(dbUrl, dbId, dbPass);

// 3단계 연결정보를 이용해서 sql구문을 만들기 => PreparedStatement 내장객체 준비
// String sql = "select * from 테이블이름 where 조건열=값";
String sql = "select * from members where id=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);

// 4단계 sql구문을 실행 => 실행 결과 저장(select)
// => sql 구문을 실행한 결과 저장하는 내장객체 ResultSet
ResultSet rs = pstmt.executeQuery();

// 5단계 결과를 가지고 출력하거나 배열변수 저장(selct)
// if rs.next() 결과에서 다음행 이동하고 데이터 있으면 true => 열접근 => 출력
%>
<table border="1">
<tr><td>아이디</td><td>비밀번호</td><td>이름</td><td>가입날짜</td></tr>
<%
if(rs.next()) {
	%>
	<tr><td><%=rs.getString("id") %></td>
		<td><%=rs.getString("pass") %></td>
		<td><%=rs.getString("name") %></td>
		<td><%=rs.getTimestamp("date") %></td></tr>
	<%
}
%>
</table>
<a href="main.jsp">메인으로 이동</a>
</body>
</html>