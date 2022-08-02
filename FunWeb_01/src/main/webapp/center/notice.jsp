<%@page import="board.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="board.BoardDAO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/default.css" rel="stylesheet" type="text/css">
<link href="../css/subpage.css" rel="stylesheet" type="text/css">
<link href="../css/list.css" rel="stylesheet" type="text/css">
<!--[if lt IE 9]>
<script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/IE9.js" type="text/javascript"></script>
<script src="http://ie7-js.googlecode.com/svn/version/2.1(beta4)/ie7-squish.js" type="text/javascript"></script>
<script src="http://html5shim.googlecode.com/svn/trunk/html5.js" type="text/javascript"></script>
<![endif]-->
<!--[if IE 6]>
 <script src="../script/DD_belatedPNG_0.0.8a.js"></script>
 <script>
   /* EXAMPLE */
   DD_belatedPNG.fix('#wrap');
   DD_belatedPNG.fix('#main_img');   

 </script>
 <![endif]-->
</head>
<body>
<div id="wrap">
<!-- 헤더들어가는 곳 -->
<jsp:include page="../inc/top.jsp"></jsp:include>
<!-- 헤더들어가는 곳 -->

<!-- 본문들어가는 곳 -->
<!-- 메인이미지 -->
<div id="sub_img_center"></div>
<!-- 메인이미지 -->

<!-- 왼쪽메뉴 -->
<nav id="sub_menu">
<ul>
<li><a href="../center/notice.jsp">Notice</a></li>
<li><a href="../fcenter/fnotice.jsp">File Download</a></li>
<li><a href="../gcenter/gnotice.jsp">Gallery</a></li>
<li><a href="#">Service Policy</a></li>
</ul>
</nav>
<!-- 왼쪽메뉴 -->

<!-- 게시판 -->
<%

BoardDAO boardDAO=new BoardDAO();

// 한 페이지에 보여줄(가져올) 글 개수 설정
int pageSize=10;
// 페이지 번호 가져오기
//http://localhost:8080/FunWeb_01/center/notice.jsp
//http://localhost:8080/FunWeb_01/center/notice.jsp?pageNum=2
String pageNum=request.getParameter("pageNum");
if(pageNum==null){
	pageNum="1";
}
// 페이지번호 => 정수형 변경
int currentPage=Integer.parseInt(pageNum);
// 시작하는 행부터 10개(Mysql, limit 1,10), 첫행~끝행 (oracle 11~20)
// pageNum   pageSize => startRow   endRow
//    1         10    =>      1          10
//    2         10    =>      11         20
//    3         10    =>      21         30

// currentPage와 pageSize로 startRow, endRow 구하기
// (1-1)*10 + 1 = 1
// (currentPage - 1) * pageSize + 1 = startRow
// 1*10 = 20
// currentPage * pageSize = endRow

int startRow=(currentPage-1)*pageSize+1;

int endRow=currentPage*pageSize;
// 끝나는 행
// startRow    pageSize   =>   endRow
//   1             10      =>    1+10-1  =>  10
//   11            10      =>    11+10-1 =>  20
//   21            10      =>    21+10-1 =>  30
// int endRow=startRow+pageSize-1;

//시작하는 행부터 10개(Mysql limit 1,10)
//String sql="select * from board order by num desc limit 1,10";
//													limit 시작위치, 반환개수
// List boardList = getBoardList() 메서드 호출
List boardList=boardDAO.getBoardList(startRow, pageSize);

// 전체 글 개수
int count=boardDAO.getBoardCount();
%>
<article>
<h1>Notice</h1>
<!-- <div> -->
<%-- 	<div>새 글 수 / <%=count%></div> --%>
<!-- </div> -->
<table id="notice">
<tr><th class="tno">No.</th>
    <th class="ttitle">Title</th>
    <th class="twrite">Writer</th>
    <th class="tdate">Date</th>
    <th class="tread">Read</th></tr>
    <%
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy.MM.dd");
    for(int i=0;i<boardList.size();i++){
    	BoardDTO boardDTO=(BoardDTO)boardList.get(i);
    	%>
    	<tr onclick="location.href='content.jsp?num=<%=boardDTO.getNum()%>'">
    		<td><%=boardDTO.getNum()%></td>
    		<td class="left"><%=boardDTO.getSubject()%></td>
    		<td><%=boardDTO.getName()%></td>
    		<td><%=dateFormat.format(boardDTO.getDate())%></td>
    		<td><%=boardDTO.getReadcount()%></td>
    	</tr>
    	<%
    }
    %>
</table>
<div id="table_search">
	<form method="post" name="search" action="searchBbs.jsp">
		<select name="keyWord"><!-- 검색컬럼 -->
			<option value="Title">제목</option>
			<option value="Content">내용</option>
			<option value="Name">아이디</option>
		</select>
		
		<input type="text" name="searchText" value="" class="input_box">
		<button type="submit" class="btn">search</button>
	</form>
</div>
<div id="table_search">
<%
String id=(String)session.getAttribute("id");

if(id!=null) {
	%>
	<input type="button" value="글쓰기" class="btn" style="margin-right: 190px;"
		onclick="location.href='write.jsp'">
	<%
}
%>

</div>
<div class="clear"></div>
<%
// 한 페이지에 보여줄 페이지 개수 설정
int pageBlock=5;
// 시작하는 페이지 번호 구하기
// currentPage   pageBlock => startPage
//    1~10           10    =>    1
//    11~20          10    =>    11
//    21~30          10    =>    21
// (1~10) / 10 * 10 + 1 = 1
// (currentPage-1)/pageBlock*pageBlock+1 = startPage
int startPage=(currentPage-1)/pageBlock*pageBlock+1;

// startPage와 pageBlock으로 끝나는 페이지 번호 구하기
// startPage   pageBlock => endPage
//    1             10         10
//    11            10         20
//    21            10         30
// 1 + 10 - 1 = 10
// startPage + pageBlock - 1 = endPage
int endPage = startPage+pageBlock-1;

// 전체 글 개수 count => select count(*) from board
// int count=boardDAO.getBoardCount();

//전체 페이지 개수 구하기
// 전체 글 개수 / 한 화면에 보여줄 글 개수 + 나머지 글 없으면 0 , 있으면 +1
int pageCount=count/pageSize + (count%pageSize==0?0:1);

// 페이지가 10페이지 안될 경우
if(endPage>pageCount){
	endPage=pageCount;
}
%>

<div id="page_control">
<%
if(startPage>pageBlock) {
	%>
	<a href="notice.jsp?pageNum=<%=startPage-pageBlock%>">Prev</a>
	<%
}
for(int i=startPage;i<=endPage;i++){
	if(currentPage==i){
		%>
		<a href="notice.jsp?pageNum=<%=i%>" 
			style="color: tomato; font-weight: bold; text-decoration: underline;"><%=i%></a>
		<%
	} else {
		%>	
		<a href="notice.jsp?pageNum=<%=i%>"><%=i%></a>
		<%
	}
}

if(endPage < pageCount){
	%>
	<a href="notice.jsp?pageNum=<%=startPage+pageBlock%>">Next</a>
	<%
}
%>

</div>
</article>
<!-- 게시판 -->
<!-- 본문들어가는 곳 -->
<div class="clear"></div>
<!-- 푸터들어가는 곳 -->
<jsp:include page="../inc/bottom.jsp"></jsp:include>
<!-- 푸터들어가는 곳 -->
</div>
</body>
</html>