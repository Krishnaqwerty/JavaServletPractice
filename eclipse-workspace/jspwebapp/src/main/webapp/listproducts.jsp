<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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

String url = "jdbc:mysql://localhost/demo";
String username = "root" ;
String password = "root@39" ;

try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con = DriverManager.getConnection(url, username, password) ;
	
	String query = "select * from products;" ;
	PreparedStatement stmt = con.prepareStatement(query);
	
	ResultSet rs = stmt.executeQuery();
	
	
	
	%>
	
	
		
		
	
	
	
	


<h3>List of Items</h3>

<table>

<tr>



<th>Code</th>
<th>Name</th>
<th>Price</th>

</tr>

<%  while(rs.next()) {
	
	String code = rs.getString("code") ;
	String name = rs.getString("name");
	int price = rs.getInt("price");
	
	
	%>


<tr> 



<td> <%= code %> </td>
<td> <%= name %> </td>
<td> <%= price %> </td>

</tr>


<% 
}

rs.close();
stmt.close();
con.close();

} catch (SQLException e) {

System.out.println(e.getMessage());
}
%>

</table>

</body>
</html>