<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="member.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// jQuery1/test8_json.jsp

// 자바 디비 => json 변경
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
String sql="select * from members";
PreparedStatement pstmt=con.prepareStatement(sql);

// 4단계 sql구문을 실행 (insert, update, delete)
ResultSet rs=pstmt.executeQuery();

// 5단계 다음행으로 이동
// 배열 List
List memberList=new ArrayList();
// json-simple-1.1.1.jar 설치
// 배열 json
JSONArray jsonArray=new JSONArray();
while(rs.next()){
// 	MemberDTO memberDTO=new MemberDTO();
// 	memberDTO.setId(rs.getString("id"));
// 	memberDTO.setName(rs.getString("name"));
	JSONObject jsonObject=new JSONObject();
	jsonObject.put("id", rs.getString("id"));
	jsonObject.put("name", rs.getString("name"));
	// 배열 한칸에 저장
// 	memberList.add(memberDTO);
	jsonArray.add(jsonObject);
}
%>
<%=jsonArray%>