<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="day2.Food" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
width:500px;
border:1px solid black;
margin:0 auto;
}

td{
border:1px solid black;
}
</style>
</head>
<body>

<% 

 Food f = new Food("카레덮밥","밥",9000);
 Food f2 = new Food("돈까스덮밥","밥",8900);
%>
<table>
<tr>
<td>메뉴명</td>
<td>카테고리</td>
<td>가격</td>
</tr>

<tr>
<td><%=f.getName() %></td>
<td><%=f.getCategory() %></td>
<td><%=f.getPrice() %></td>
</tr>


<tr>
<td><%=f2.getName() %></td>
<td><%=f2.getCategory() %></td>
<td><%=f2.getPrice() %></td>
</tr>



</table>
</body>
</html>