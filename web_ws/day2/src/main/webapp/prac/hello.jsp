<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

String menu="카레덮밥";
String category="밥";
int price  =9000;


%>
<table>
<tr>
<td>메뉴명</td>
<td>카테고리</td>
<td>가격</td>
</tr>

<tr>
<td><%=menu %></td>
<td><%=category %></td>
<td><%=price %></td>
</tr>


<tr>
<td></td>
<td></td>
<td></td>
</tr>



</table>
</body>
</html>