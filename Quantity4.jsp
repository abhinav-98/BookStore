<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "UserDetails4.jsp">
<h3>Welcome to the book Store</h3>
<h3>Book Name : Head First C#</h3> 
<h3>Author    : Andrew Stellman</h3> 
<h3>Price     : 400</h3> 


<h3>Please enter the quantity of the book selected</h3><br>
<input type = "text" name = "txt9"><br>
<input type = "submit" value = "Purchase">
</form>

</body>
</html>
<%      

	String s1 = "Head First C#";
	String s2 = "Andrew Stellman";
	int s3 = 400;
	
		

	HttpSession session1 = request.getSession();
	session1.setAttribute("bname", s1);
	session1.setAttribute("bauthor", s2);
	session1.setAttribute("bprice", s3);
%>