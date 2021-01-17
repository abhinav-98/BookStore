package user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String user_mobno = request.getParameter("number");
		String user_password = request.getParameter("password");
		String user_email = request.getParameter("emailaddress");
		String user_add1 = request.getParameter("addressline1");
		String user_add2 = request.getParameter("addressline2");
		String user_city = request.getParameter("city");
		String user_pincode = request.getParameter("pincode");

		try {
			User1DAO obj = new User1DAO();
			obj.addUser(user_mobno, user_password, user_email, user_add1, user_add2, user_city, user_pincode);

		} catch (HibernateException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	
		out.println("User data is saved successfully.");
		out.println("Redirecting to Login Page. Wait........");
		
		
		response.setHeader("Refresh","5;URL=Login.jsp");
		
		
	}

}
