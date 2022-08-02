<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/testPro3.jsp</title>
</head>
<body>
<%
// post 방식으로 넘어오면 request 한글설정 해야 함
request.setCharacterEncoding("utf-8");
// request 저장된 태그(파라미터) 가져오기
String id = request.getParameter("id");
String pass = request.getParameter("pass");
String intro = request.getParameter("intro");
String gender = request.getParameter("gender");
// String hobby = request.getParameter("hobby");	// getParameter : 이름 하나에 값 하나
// 이름 하나에 값을 여러 개 가져오기 => getParameterValues()
// 여러 개 값을 저장하는 변수 (배열변수) = getParameterValues()
String hobby[] = request.getParameterValues("hobby");
String sgrade = request.getParameter("grade");

int grade = Integer.parseInt(sgrade);
%>
아이디 : <%=id%><br>
비밀번호 : <%=pass %><br>
자기소개 : <%=intro %><br>
성별 : <%=gender %><br>
취미 선택 개수 : <%=hobby.length %><br>
취미 주소 : <%=hobby %><br>
취미 :
<%
if(hobby != null) {
	for(int i = 0 ; i < hobby.length ; i++) {
		%>
		<%=hobby[i] %>
		<%
	}
}
%><br>
학년 : <%=grade %>

</body>
</html>