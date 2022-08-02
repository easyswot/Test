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
<title>jsp3/selectPro.jsp</title>
</head>
<body>
<%
// request
int num = Integer.parseInt(request.getParameter("num"));

//1단계 JDBC 프로그램 불러오기
Class.forName("com.mysql.cj.jdbc.Driver");

//2단계 JDBC 프로그램 이용해서 디비서버에 접속 => 연결정보 저장
//디비서버에 접근할 디비주소
String dbUrl="jdbc:mysql://localhost:3306/jspdb1?serverTimezone=UTC";
//디비에 접근할 아이디
String dbId="root";
//디비에 접근할 비밀번호
String dbPass="1234";
//디비연결 정보를 Connection형 con변수에 저장
Connection con = DriverManager.getConnection(dbUrl, dbId, dbPass);

//3단계 연결정보를 이용해서 sql구문을 만들기 => PreparedStatement 내장객체 준비
//String sql = "select * from 테이블이름 where 조건열=값";
String sql = "select * from student where num=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setInt(1, num);

//4단계 sql구문을 실행 (insert, update, delete) => sql 구문을 실행한 결과 저장하는 내장객체 ResultSet
ResultSet rs = pstmt.executeQuery();

//5단계 결과를 가지고 출력하건 배열변수 저장(select)
// if rs.next() 결과에서 다음행 이동하고 데이터 있으면 true => 열접근
// if(rs.next()==true) {
	%>
<%-- 	<%=rs.getInt("num")%> --%>
<%-- 	<%=rs.getString("name")%> --%>
	<%
// }
%>
<table border="1">
<tr><td>학생번호</td><td>학생이름</td></tr>
<%
if(rs.next()) {
	%>
	<tr><td><%=rs.getInt("num")%></td><td><%=rs.getString("name")%></td></tr>
	<%
}
%>
</table>
<%




%>

</body>
</html>