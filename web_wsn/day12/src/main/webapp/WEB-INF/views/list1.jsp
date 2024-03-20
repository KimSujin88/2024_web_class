<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.ArrayList" %>    
<%@page import="day12.Member" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<table>

<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>

<%  ArrayList<Member>  list= (ArrayList<Member>) request.getAttribute("list");
  for( Member  member : list) {
%>
<tr>
<td> <%=member.getM_id() %></td>
<td><%=member.getM_id() %></td>
<td><%=member.getM_id() %></td>
<td><%=member.getM_id() %></td>
<td><%=member.getM_id() %></td>
<td><%=member.getM_id() %></td>
<td><%=member.getM_id() %></td>
</tr>

<%} %>
</table>


<h4>페이징 코드</h4>
<%
int totalCnt = (int) request.getAttribute("totalCnt");
int pageSize = (int) request.getAttribute("pageSize");
int currentPage = (int) request.getAttribute("currentPage");
int currentGrp=0;	//현재페이지에 대한 현재그룹 구하기
int grpSize=5;


//0.현재페이지, 전체레코드수
//1.총페이지수
//2.현재그룹구하기
//3.현재그룹의 시작, 끝 구하기
//4.그룹의 마지막이 전체페이지 수보다 크다면 마지막값을 전체페이지 수로 변경
//5. 반복(시작~끝 [1] [2] [3] [4] [5])
//6.이전 /다음

int remain = totalCnt % pageSize;
int totalPage =0;

//나머지유무
if( remain==0){
	totalPage = totalCnt / pageSize;
}else{
	totalPage = (totalCnt / pageSize) +1;
}

//현재그룹구하기

int remain2= currentPage % grpSize;

if( remain2 ==0){
	currentGrp = currentPage / grpSize;
}else{
	currentGrp = currentPage / grpSize+1;
}


//현재그룹에 대한 시작, 끝 구하기
int grpStartPage = (currentGrp-1) * grpSize+1;
int grpEndpage = currentGrp * grpSize;


//그룹의 마지막이 전체페이지 수보다 크다면 마지막값을 전체페이지 수로 변경
if(grpEndpage >totalPage){
	grpEndpage = totalPage;
}
%>

<% if( currentGrp >1){ %>
  <a href="/day12/list.page?p=<%=grpStartPage-1%>">이전</a>

<% }%>

<%
for( int i=grpStartPage; i<=grpEndpage; i++){
%>
	<a href="/day12/list.page?p=<%=i%>"> [ <%=i %>]</a>
<% }%>

<%	  //5			20
if(grpEndpage < totalPage){
%>
	<a href="/day12/list.page?p=<%=grpEndpage+1 %>">다음</a>

<% }%>
</body>
</html>