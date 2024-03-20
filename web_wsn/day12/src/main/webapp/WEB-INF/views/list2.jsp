<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.ArrayList" %>    
<%@page import="day12.Member" %>
<%@page import="day12.PageHandler" %>
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


<% PageHandler handler= (PageHandler) request.getAttribute("handler"); %>


<%if( handler.getCurrentGrp() >1) { %>
    <a href="/day12/list2.page?p=<%=handler.getGrpStartPage()-1%>">이전</a>
<%} %>

<%
 for( int i=handler.getGrpStartPage() ; i<= handler.getGrpEndPage() ; i++){
%>
   <a href="/day12/list2.page?p=<%=i%>">  [ <%=i%> ]</a>	
<%	 
 }
%>

 
 <%if(  handler.getGrpEndPage() < handler.getTotalPage()  ) {  %> 
     <a href="/day12/list2.page?p=<%=handler.getGrpEndPage() +1%>">  <다음> </a> 
 <%} %>

</body>
</html>