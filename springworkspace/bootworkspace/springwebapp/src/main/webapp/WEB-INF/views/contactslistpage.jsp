<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacts</title>
</head>
<body>

	<h3>Contacts</h3>
	
	<table border = "1">
			
			<tr>
				<th>ID</th>
			</tr>
			
			<c:forEach var="c" items="${contacts}">
			
			<tr>
				<td>${c.id}</td>
			</tr>
	
	
			</c:forEach>
	
	</table>
	

</body>
</html>