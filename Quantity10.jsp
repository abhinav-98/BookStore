<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "UserDetails10.jsp">
<h3>Welcome to the book Store</h3>
<h3>Book Name : SQL The Complete Reference</h3> 
<h3>Author    : James Groff</h3> 
<h3>Price     : 667</h3> 


<h3>Please enter the quantity of the book selected</h3><br>
<input type = "text" name = "txt9"><br>
<input type = "submit" value = "Purchase">
</form>



</body>
</html>
<%      

	String s1 = "SQL The Complete Reference";
	String s2 = "James Groff";
	int s3 = 667;
	
		

	HttpSession session1 = request.getSession();
	session1.setAttribute("bname", s1);
	session1.setAttribute("bauthor", s2);
	session1.setAttribute("bprice", s3);
%>