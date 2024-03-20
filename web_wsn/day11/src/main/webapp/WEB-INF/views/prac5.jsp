<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String[] bookNames = (String[]) request.getAttribute("bookNames"); %>


<%
for( int i=0; i< bookNames.length; i++){
	String b = bookNames[i];
	out.println(b);
}
%> <br>


<%
for( String a : bookNames)
	out.println(a);

%>

</body>
</html>