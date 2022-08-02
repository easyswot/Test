<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp2/cookieTest.jsp</title>
</head>
<body>
<%
// 세션 : 자바 내장객체 => 서버 객체생성 => jsp 내장객체
//	   : 연결정보를 저장, 세션을 이용해서 페이지 상관없이 값을 유지
//	   : 차이점 - 서버에 메모리 저장, 보안상 중요한 데이터 저장할 때 사용(로그인 인증)
// 쿠키 : 자바 내장객체 => 개발자 객체생성 => 시간설정 => 사용자 컴퓨터 전달
//		 => 사용자 컴퓨터 하드웨어에 파일로 저장
//	   : C:\Users\ITWILL\AppData\Local\Microsoft\Windows\INetCache
//	   : 공통점 - 서버, 연결 상관없이 값을 유지, 유저 하드웨어 저장, 보안상 상관없는 내용,
//		 서버 부하를 줄이고자 함

// 사용자 컴퓨터 쿠키값 가져오기 => request에 저장
// 사용자가 브라우저 주소입력 페이지 요청 => http(태그정보, 서버정보, 유저정보, 쿠키정보, sessionID, 헤더정보)
// => 서버에 도착 => request에 http가 들고온 정보 저장
// request에서 쿠키값 가져오기
Cookie cookies[] = request.getCookies();
// 쿠키값이 있으면
if(cookies!=null) {
	// for 배열 한칸씩 접근
	for(int i=0 ; i < cookies.length ; i++) {
		// 쿠키값 찾기 => 쿠키 이름이 "cname" 찾기
		if(cookies[i].getName().equals("cname")) {
			out.println("찾은 쿠키변수주소값 : "+ cookies[i] + "<br>");
			out.println("찾은 쿠키이름 : "+ cookies[i].getName() + "<br>");
			out.println("찾은 쿠키 값 : "+ cookies[i].getValue() + "<br>");
		}
	}
}

%>
</body>
<input type="button" value="쿠키값 생성" onclick="location.href='cookieSet.jsp'">
<input type="button" value="쿠키값 삭제" onclick="location.href='cookieDel.jsp'">
</html>