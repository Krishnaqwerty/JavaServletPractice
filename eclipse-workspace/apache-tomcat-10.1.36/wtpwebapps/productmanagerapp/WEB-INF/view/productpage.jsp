<%@page import="java.util.ArrayList"%>
<%@page import="com.productmanagerapp.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="jakarta.tags.core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<body>

<jsp:include page="menubar.jsp"></jsp:include>

<h1>Products</h1>

<%

List<Product> products = (ArrayList)request.getAttribute("products");


%>

<table>

<tr>
<th>Product ID </th>
<th>Name </th>
<th>Price </th>


</tr>

<%

for(Product p : products){

%>

<tr>


<td>
<%= p.getCode() %>

</td>
<td>

 <%= p.getName() %>
 
 </td>
 
 <td>
  <%= p.getPrice() %>
  
  </td>
  
  
 
  
  </tr>



<% } %>


</table>



<h3>Second Copy of the Table using jstl</h3>

<table>




<tr>
<th>Code</th>
<th>Name</th>
<th>Price</th>
<th>Delete</th>

</tr>

<c:forEach var="item" items="${products}">

<tr>

<td>${item.code}</td>
<td>${item.name}</td>
<td>$${item.price}</td>

	<td>
  
  <form action="productspage" method="get" onsubmit="return doCheck();">
  <input type="hidden" name="op" value="del">
  <input type="hidden" name="code" value=${item.code}> 
  
  <button>Delete</button>
  </form>
  
  
  </td>


</tr>

</c:forEach>



</table>

<script type="text/javascript">

	function doCheck(){
		if(prompt('Are You Sure ?') == 'y')
			return true ;
		else
			return false;
	}

</script>

</body>
</html>