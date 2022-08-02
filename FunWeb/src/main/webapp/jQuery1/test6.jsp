<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQuery1/test6.jsp</title>
<script type="text/javascript" src="../script/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
// 		배열변수
		var arr=[
			{"id":"kim", "name":"김길동"},
			{"id":"lee", "name":"이길동"},
			{"id":"park", "name":"박길동"}
		];
		// 대상.each(); => 반복문
// 		$.each(대상,function(){});
		$.each(arr,function(index, item){
// 			alert(index);
// 			alert(item.id);
// 			alert(item.name);
// 			id="arrdiv" item.id+":"+ item.name+"<br>" html() append()
			$('#arrdiv').append(item.id+":"+item.name+"<br>");
		});
		
// 		click()		id="btn" 클릭했을 때
// 		each()		배열변수 내용을 접근 반복해서 
//		append()	table태그 뒷부분에 출력	<tr><td>아이디</td><td>이름</td></tr>
		$('#btn').click(function(){
// 			alert("클릭")	// 클릭 이벤트 동작 확인
			$.each(arr,function(index,item){
				$('table').append("<tr><td>"+item.id+"</td><td>"+item.name+"</td></tr><br>");
			});
			
		});
		
		
		
		
		
		
		
		
	});
</script>
</head>
<body>
<input type="button" value="버튼" id="btn">
<table border="1">
<tr><td>아이디</td><td>이름</td></tr>
</table>
<div id="arrdiv"></div>
</body>
</html>