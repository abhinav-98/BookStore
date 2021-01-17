<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "UserDetails2.jsp">
<h3>Welcome to the book Store</h3>
<h3>Book Name : Thinking In Java</h3> 
<h3>Author    : Thinking In Java</h3> 
<h3>Price     : 300</h3> 


<h3>Please enter the quantity of the book selected</h3><br>
<input type = "text" name = "txt9"><br>
<input type = "submit" value = "Purchase">
</form>

</body>
</html>
<%      

	String s1 = "Thinking In Java";
	String s2 = "Thinking In Java";
	int s3 = 300;
	
		

	HttpSession session2 = request.getSession();
	session2.setAttribute("bname", s1);
	session2.setAttribute("bauthor", s2);
	session2.setAttribute("bprice", s3);
%>