<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "UserDetails3.jsp">
<h3>Welcome to the book Store</h3>
<h3>Book Name : Computer Networking</h3> 
<h3>Author    : James F. Kurose</h3> 
<h3>Price     : 250</h3> 


<h3>Please enter the quantity of the book selected</h3><br>
<input type = "text" name = "txt9"><br>
<input type = "submit" value = "Purchase">
</form>

</body>
</html>
<%      

	String s1 = "Computer Networking";
	String s2 = "James F. Kurose";
	int s3 = 250;
	
		

	HttpSession session3 = request.getSession();
	session3.setAttribute("bname", s1);
	session3.setAttribute("bauthor", s2);
	session3.setAttribute("bprice", s3);
%>