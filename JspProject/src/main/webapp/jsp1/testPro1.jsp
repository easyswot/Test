<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/testPro1.jsp</title>
</head>
<body>
<!-- http://localhost:8080/JspProject/jsp1/testForm1.jsp -->
<!-- https://www.naver.com/ -->
<!-- https://www.daum.net/ -->
<%
// http://localhost:8080/JspProject/jsp1/testPro1.jsp?name=kim&num=1
// 폼에서 입력한 데이터를 http가 get방식(주소줄에 보이면서 들고감)으로 데이터를 서버에 들고감
// 웹서버에서 http가 들고온 정보 name=kim, num=1 를 request 저장공간을 만들고 저장
// 프로그래머가 명령을 => request에서 파라미터(태그) 값을 가져와서 출력

// 웹서버 명령을 처리해서 결과 http에 전달 => 사용자 전달
request.setCharacterEncoding("utf-8");

String name = request.getParameter("name");
String snum = request.getParameter("num");

// num을 정수형으로 변경
int num = Integer.parseInt(snum);
%>
이름 : <%=name %><br>
좋아하는 숫자 : <%=snum %>
좋아하는 숫자 + 100 : <%=num+100 %><br>
</body>
</html>