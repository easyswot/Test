<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp2/include1.jsp</title>
</head>
<body>
<%
// include 액션태그 : jsp문법, 태그처럼 사용
//				  : 반복되는 태그내용을 파일로 따로 저장
//				  : <jsp:include page="파일이름"/> 액션태그 구문을 이용해 가져와서 사용
//				  : 반복되는 태그내용을 파일 하나만 수정하면 모든 페이지에 적용
%>
<h1>jsp2/include1.jsp</h1>
<table border="1" width="600" height="600">
<tr><td colspan="2"><jsp:include page="includeTop.jsp"/></td></tr>
<tr><td>왼쪽메뉴</td><td>본문 내용1</td></tr>
<tr><td colspan="2"><jsp:include page="includeBottom.jsp"/></td></tr>
</table>

</body>
</html>