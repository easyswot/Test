<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp2/cookieDel.jsp</title>
</head>
<body>
<%
// 쿠키값 삭제
// 사용자 컴퓨터 쿠키값 가져오기 => request에 저장
// request에서 쿠키값 가져오기
Cookie cookies[] = request.getCookies();

// 쿠키값이 있으면
// for 배열 한칸씩 접근
// 쿠키값 찾기 => 쿠키 이름이 "cname" 찾기
if(cookies!=null) {
	for(int i = 0 ; i < cookies.length ; i++) {
		if(cookies[i].getName().equals("cname")) {
			cookies[i].setMaxAge(0);
			response.addCookie(cookies[i]);
		}
	}
}
// 찾은 쿠키값의 시간을 0으로 설정
// response 내장객체 저장 => http전달 => 사용자 컴퓨터 전달 => 하디웨어 저장

%>

<script type="text/javascript">
	alert("쿠키값 삭제");
	location.href="cookieTest.jsp";
</script>
</body>
</html>