<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>

<%

String username = request.getParameter("username");
String password = request.getParameter("password");

if(username.equals("Jai") && password.equals("Veeru"))
{
	
	session.setAttribute("usersession", username);
%>

<h3>Hello <%= username %> </h3>

<%
}else{
	

%>

<h3>Invalid Login !</h3>

<%
}
%>

</body>
</html>