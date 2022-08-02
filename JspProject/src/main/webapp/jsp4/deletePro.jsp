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
<title>jsp4/deletePro.jsp</title>
</head>
<body>
<%
// request id pass 파라미터 값 가져오기 => 변수 저장
String id = request.getParameter("id");
String pass = request.getParameter("pass");

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
String sql="select * from members where id=? and pass=?";
PreparedStatement pstmt = con.prepareStatement(sql);
pstmt.setString(1, id);
pstmt.setString(2, pass);

// 4단계 sql구문을 실행 (insert, update, delete)
ResultSet rs = pstmt.executeQuery();

// 5단계 결과를 가지고 출력하거나 배열변수 저장(select)
// if rs.next() 결과에서 다음행 이동하고 데이터 있으면 true => 아이디 비밀번호 일치
//		3단계 수정 String sql="delete from 테이블이름 where 조건열=값";
//		4단계 sql구문을 실행 (insert, update, delete)
//		main.jsp 이동
// else								데이터 없으면 false => 아이디 비밀번호 틀림
//									아이디 비밀번호 틀림메시지 출력, 뒤로 이동
if(rs.next()) {
	sql = "delete from members where id=?";
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, id);
	
	pstmt.executeUpdate();
	
	// 세션값 초기화
	session.invalidate();
	
	response.sendRedirect("main.jsp");
	
} else {
	%>
	<script type="text/javascript">
		alert("아이디 비밀번호 틀림");
		history.back();
	</script>
	<%
}

%>
</body>
</html>