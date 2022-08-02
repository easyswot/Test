<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQuery1/test8.jsp</title>
<script type="text/javascript" src="../script/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
// 		click()		id="btn" 클릭했을 때
// 		ajax()		url test8_json.jsp, success function(rdata) dataType:'json'
// 		each()		배열변수 내용을 접근 반복해서 
// 		append()	table태그 뒷부분에 출력	<tr><td>아이디</td><td>이름</td></tr>
		$('#btn').click(function(){
			$.ajax({
				url:'test8_json.jsp',
				dataType:'json',
				success:function(rdata){
					$.each(rdata, function(index,item){
						$('table').append("<tr><td>"+item.id+"</td><td>"+item.name+"</td></tr><br>");
					});
				}
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
</body>
</html>