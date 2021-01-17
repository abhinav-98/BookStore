<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h3>Your Order has been confirmed. The books shall be delivered within 2 days. </h3>




<%
response.setContentType("text/html");
out.println("<html><body>" + "<h3>Redirecting to Home Page</h3>" + "</body></html>");
response.setHeader("Refresh","5;URL=Welcome1");

%>

</body>
</html>