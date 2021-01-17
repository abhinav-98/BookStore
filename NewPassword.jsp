<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="showpassword.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="aqua">
<body>

	<h1 align="center">Set new password</h1>
	<form action = "NewPassword">	
		
		Set password:*<input type="password" name="txt1" id="myInput2" required><br> 
		Confirm password:*<input type="password" name="txt2" id="myInput" required><br>
		<input type="checkbox" onclick="myFunction()">Show Password 
		<input type="submit" value="submit" style="color: red">

	</form>
</body>
</html>