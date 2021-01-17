<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "UserDetails5.jsp">
<h3>Welcome to the book Store</h3>
<h3>Book Name : What is HTML 5?</h3> 
<h3>Author    : Brett McLaughlin</h3> 
<h3>Price     : 300</h3> 


<h3>Please enter the quantity of the book selected</h3><br>
<input type = "text" name = "txt9"><br>
<input type = "submit" value = "Purchase">
</form>

</body>
</html>
<%      

	String s1 = "What is HTML 5?";
	String s2 = "Brett McLaughlin";
	int s3 = 300;
	
		

	HttpSession session1 = request.getSession();
	session1.setAttribute("bname", s1);
	session1.setAttribute("bauthor", s2);
	session1.setAttribute("bprice", s3);
%>