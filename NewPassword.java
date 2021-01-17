package Password;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Newpassword
 */
@WebServlet("/NewPassword")
public class NewPassword extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try
		{
			PrintWriter out=response.getWriter();
			String s1=request.getParameter("txt1");
			String s2=request.getParameter("txt2");
			if((s1.isEmpty())||( s2.isEmpty()))
			{
				out.println("Reset password And Confirm Password Cannot be blank");
				out.println("You will be redirected to that entry in 5 seconds");
				response.setHeader("Refresh","5;URL=Newpassword");
			
				
			}
			else if(s1.equals(s2))
			{
				HttpSession obj1=request.getSession();
				String mno=(String) obj1.getAttribute("mno");
				obj1.setAttribute("mno", null);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BookStore","root","sqlsewebsite@2");
			Statement st=con.createStatement();
			st.executeUpdate("update usertable set password='"+s1+"' where mobno='"+mno+"'");
			out.println("Password has been updated , redirecting to login page. ");
			response.setHeader("Refresh","5;URL=Login.jsp");
			}
			else
			{
				out.println("Passwords do not Match , RELOADING");
				response.setHeader("Refresh","5;URL=NewPassword.jsp");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
