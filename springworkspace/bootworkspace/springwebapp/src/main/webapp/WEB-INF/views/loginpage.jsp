<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Login Page</h3>

<p style = "color:red">${error}</p>

<div>


		<form action="dologin" method = "post">
		
		
				<div>
				
						<label>Username</label>
						<input type = "text" name = "username">
						
				
				
				</div>
				
				<div>
				
						<label>Password</label>
						<input type = "password" name = "password">
						
				
				
				</div>
				
				<div>
				
						
						<button>Next</button>
						
				
				
				</div>
		
		
		
		
		
		
		</form>






</div>


</body>
</html>