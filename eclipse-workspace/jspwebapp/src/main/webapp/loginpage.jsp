<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>


<jsp:include page="menu.jsp"></jsp:include>

<%

if(session.getAttribute("usersession") == null) { %>
	
	<h3>Login Form</h3>

	<form action="checklogin.jsp" method="post">

	<input type="text" name="username" placeholder="Enter Username" >
	<input type="password" name="password" placeholder="Enter Password">
	<button type="submit" name="login">Login</button>

	</form>
	

<%	
}else {  
	
	String username = (String) session.getAttribute("usersession");
	
	
	%>
	
	
	<h3>Hello <%= username %> </h3>
	
	
<%
}
%>





</body>
</html>