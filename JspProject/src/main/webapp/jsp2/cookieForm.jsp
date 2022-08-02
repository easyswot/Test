<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp2/cookieForm.jsp</title>
</head>
<%
// request에서 쿠키값 가져오기
Cookie cookies[] = request.getCookies();

// 쿠키값 있으면
String cookieValue="";
if(cookies!=null) {
	// for 배열 한칸씩 접근
	for(int i=0 ; i<cookies.length ; i++) {
		// 쿠키값 찾기 => 쿠키이름이 "clang" => 출력
		if(cookies[i].getName().equals("clang")) {
			out.println("찾은 쿠키 이름 : " + cookies[i].getName() + "<br>");
			out.println("찾은 쿠키 값 : " + cookies[i].getValue() + "<br>");
			cookieValue=cookies[i].getValue();
		}
			
	}
}

%>
<body>
<%
if(cookieValue.equals("korean")) {
	%><h1>안녕하세요</h1><%
} else {
	%><h1>Hello</h1><%
}
%>


<form action="cookiePro.jsp" method="get">
언어 설정 <input type="radio" name="lang" value="korean" <%if(cookieValue.equals("korean")){%>checked<%}%>>한국어
<input type="radio" name="lang" value="english" <%if(cookieValue.equals("english")){%>checked<%}%>>영어
<input type="submit" value="언어설정">



</form>
</body>
</html>