<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%  String data2  =  ( String)request.getAttribute("data");

for( int i=1; i<=5; i++){
	out.println( data2);
}

%>


<c:forEach var="j" begin="1" end="5">
${data}
</c:forEach>



</body>
</html>