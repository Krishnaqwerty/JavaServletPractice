<%@page import="java.util.Map"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

HashMap<String, Integer> productMap = new HashMap<>();

productMap.put("mouse", 1000);
productMap.put("mobile", 10000);
productMap.put("moon", 10);
productMap.put("bike", 1000000);



%>

<table>

<tr>

<th>Product Name</th>
<th>Price</th>
<th>BUY</th>

</tr>

<%

Iterator<Map.Entry<String, Integer>> iterator = productMap.entrySet().iterator() ;


while(iterator.hasNext()){
	Map.Entry<String, Integer> entry = iterator.next();
	
	


%>

<tr>

<td><%= entry.getKey() %></td>

<td><%= entry.getValue() %></td>


<%!

HashMap<String, Integer> itemtoadd = new HashMap<>();

void updateCart(String name, Integer price){
	
	itemtoadd.put(name, price);
	
	
	
}
	
	%>



<td> <input type="checkbox" class="addtocart"  value="yes"></td>

</tr>


<% } %>



</table>

<a href="cart.jsp"> <button>Go To Cart</button> </a>

<%

int count = 0

%>





</body>
</html>