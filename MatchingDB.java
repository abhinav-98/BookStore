package loginmatching;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MatchingDB
 */
@WebServlet("/MatchingDB")
public class MatchingDB extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String s1 = request.getParameter("txt1");
		String s2 = request.getParameter("txt2");
		
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookStore","root","sqlsewebsite@2");	
			
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from usertable where mobno="+s1+" AND password='"+s2+"'");
		
			
			if(rs.next()) {
				
				
				response.sendRedirect("Welcome1");
			}
			
			else {
				
				out.println("Error , userid or password is incorrect. RELOADING!");
				response.setHeader("Refresh","5;URL=Login.jsp");	
			}
		}
		
		catch(Exception e) {
						
		}

	}

}
