package Welcome;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class Welcome1
 */
@WebServlet("/Welcome1")
public class Welcome1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head><body><h3>" + "Welcome to the book store" + "</h3></body></head></html>");

		StringBuffer sb = new StringBuffer("Let Us C");
		StringBuffer sb1 = new StringBuffer("SQL The Complete Reference");
		StringBuffer sb2 = new StringBuffer("Thinking In Java");
		StringBuffer sb3 = new StringBuffer("Computer Networking");
		StringBuffer sb4 = new StringBuffer("Head First C#");
		StringBuffer sb5 = new StringBuffer("What is HTML 5?");
		StringBuffer sb6 = new StringBuffer("Html5 in Action");
		StringBuffer sb7 = new StringBuffer("OOPs with C++");
		StringBuffer sb8 = new StringBuffer("C++ : The Complete Reference");
		StringBuffer sb9 = new StringBuffer("Head First SQL");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookStore", "root",
					"sqlsewebsite@2");

			Statement stmt = (Statement) con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from books");
			out.println("<table border=1 width=25% height=25%>");
			out.println("<tr><th>Books Id</th><th>Books Name</th><th>Author</th><th>Price</th><tr>");
			while (rs.next()) {
				String s1 = rs.getString(1);

				String s3 = rs.getString(3);
				int s4 = rs.getInt(4);

				String s2 = rs.getString(2);
				if (s2.contentEquals(sb)) {

					out.println("<tr><td>" + s1 + "</td><td>" + "<a href = 'Quantity1.jsp'>" + s2 + "</td><td>" + s3
							+ "</td><td>" + s4 + "<tr></td>");

				}

				if (s2.contentEquals(sb1)) {

					out.println("<tr><td>" + s1 + "</td><td>" + "<a href = 'Quantity10.jsp'>" + s2 + "</td><td>" + s3
							+ "</td><td>" + s4 + "<tr></td>");

				}
				if (s2.contentEquals(sb2)) {

					out.println("<tr><td>" + s1 + "</td><td>" + "<a href = 'Quantity2.jsp'>" + s2 + "</td><td>" + s3
							+ "</td><td>" + s4 + "<tr></td>");

				}
				if (s2.contentEquals(sb3)) {

					out.println("<tr><td>" + s1 + "</td><td>" + "<a href = 'Quantity3.jsp'>" + s2 + "</td><td>" + s3
							+ "</td><td>" + s4 + "<tr></td>");

				}
				if (s2.contentEquals(sb4)) {

					out.println("<tr><td>" + s1 + "</td><td>" + "<a href = 'Quantity4.jsp'>" + s2 + "</td><td>" + s3
							+ "</td><td>" + s4 + "<tr></td>");

				}
				if (s2.contentEquals(sb5)) {

					out.println("<tr><td>" + s1 + "</td><td>" + "<a href = 'Quantity5.jsp'>" + s2 + "</td><td>" + s3
							+ "</td><td>" + s4 + "<tr></td>");

				}
				if (s2.contentEquals(sb6)) {

					out.println("<tr><td>" + s1 + "</td><td>" + "<a href = 'Quantity6.jsp'>" + s2 + "</td><td>" + s3
							+ "</td><td>" + s4 + "<tr></td>");

				}
				if (s2.contentEquals(sb7)) {

					out.println("<tr><td>" + s1 + "</td><td>" + "<a href = 'Quantity7.jsp'>" + s2 + "</td><td>" + s3
							+ "</td><td>" + s4 + "<tr></td>");

				}
				if (s2.contentEquals(sb8)) {

					out.println("<tr><td>" + s1 + "</td><td>" + "<a href = 'Quantity8.jsp'>" + s2 + "</td><td>" + s3
							+ "</td><td>" + s4 + "<tr></td>");

				}
				if (s2.contentEquals(sb9)) {

					out.println("<tr><td>" + s1 + "</td><td>" + "<a href = 'Quantity9.jsp'>" + s2 + "</td><td>" + s3
							+ "</td><td>" + s4 + "<tr></td>");

				}

			}
		
			
			out.println("</table>");
			out.println("</html></body>");
			con.close();
			
			//out.println("<html><body>" + "<form action = 'Login.jsp'></form>" + "<input type = 'submit' value = 'Log Out'" + "</body></html>");
			
			
		}

		catch (Exception e) {

		}

	}

}
