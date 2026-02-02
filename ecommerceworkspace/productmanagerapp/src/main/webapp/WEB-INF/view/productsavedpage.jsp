<%@page import="com.productmanagerapp.model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Saved</title>
</head>
<body>

<jsp:include page="menubar.jsp"></jsp:include>

<h3>

${products.code}, ${products.name}, ${products.price}

</h3>

<%

Product p = (Product)request.getAttribute("products");

%>

<h3><%= p.getCode() %></h3>

<h3><%= p.getName() %></h3>

<h3><%= p.getPrice() %></h3>




</body>
</html>