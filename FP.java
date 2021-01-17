package Password;

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
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.sql.*;




/**
 * Servlet implementation class FP
 */
@WebServlet("/FP")
public class FP extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String s1=request.getParameter("txt1");
		String s2=request.getParameter("txt2");
		String s3=request.getParameter("txt3");

		int i=Integer.parseInt(s3);
		PrintWriter out=response.getWriter();
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookStore","root","sqlsewebsite@2");	
			
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from usertable where mobno="+s1+" AND email='"+s2+"' AND PinCode="+i);
			if(rs.next())
			{
				HttpSession obj=request.getSession();  
				obj.setAttribute("mno", s1);
				response.sendRedirect("NewPassword.jsp");				
			}
			else
			{
				out.println("Entered data dosen't match , RELOADING------");
				response.setHeader("Refresh","5;URL=ForgotPassword.jsp");
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
