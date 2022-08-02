<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1/for.jsp</title>
</head>
<body>
<%
// 배열변수
String hobby[] = {"여행", "게임", "독서"};
String hobby2[] = new String[3];
hobby2[0] = "trip";
hobby2[1] = "game";
hobby2[2] = "read a book";
String hobby3[] = new String[]{"여행", "게임", "독서"};

// for
for(int i = 0 ; i < hobby.length ; i++) {
	%>
	
	<%=hobby[i] %><br>
	
	<%
}


%>

</body>
</html>