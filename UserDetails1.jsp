<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import = "java.util.Date" %> 
 <%@page import = "java.util.Random" %> 
 <%@page import = "java.text.SimpleDateFormat" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "UserDetails1">


Order Date : 
<%     
Date date = new Date();
SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
String stringDate= DateFor.format(date);
out.println(stringDate);
%><br>

<input type = "hidden" value = <%=stringDate%> name = "date">

Order ID:

<%

Random random  = new Random();
int orderid = random.nextInt(Integer.MAX_VALUE);

out.println(orderid);

%><br>

<input type = "hidden" value = <%=orderid%> name = "oid">


<%

String bookid = "C1";

HttpSession session1 = request.getSession();


String s1  =(String)session1.getAttribute("bname");
String s2 = (String) session1.getAttribute("bauthor");
int s3 = (Integer)session1.getAttribute("bprice");

String s4 = request.getParameter("txt9");

int s5 = Integer.parseInt(s4);
int s6 = s3*s5;

session1.setAttribute("bquantity", s4);
session1.setAttribute("bookid", bookid);



%>


 <h3> Enter Name : </h3> <input type = "text" name = "txt1"> <br>
 
 <h3>Enter Address : </h3>
 <textarea rows = '5' cols = '50' name = 'txt2'></textarea><br>

<h3>Enter Phone Number : </h3>

<input type = "number" name = "txt3"><br>


<h3>Purchased Book Details : </h3> 

<table border = "1">




<tr>
<td>Name</td>

<td>Author</td>
<td>Price</td>
<td>Quantity</td>
<td>Total</td>
<tr>
<td><%=s1 %></td>
<td><%=s2 %></td>
<td><%=s3 %></td>
<td><%=s4 %></td>
<td>Rs. <%=s6 %></td>


</tr>
</table><br>
<input type = "submit" value = "Confirm">
</form>

<form action = "Welcome1">

<input type = "submit" value = "Cancel">


</form>




</body>
</html>