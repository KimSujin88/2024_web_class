<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String[] foods = (String[]) request.getAttribute("foods"); %>

<%
for( int i=0; i< foods.length; i++){
	String f = foods[i];
	out.println(f);
}
%> <br>

<%
for( String a : foods){
	out.println(a);
}

%>


</body>
</html>