package user_Details;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class UserDetails2
 */
@WebServlet("/UserDetails2")
public class UserDetails2 extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				PrintWriter out = response.getWriter();
				
				String s1 = request.getParameter("date");  // date
				String s2 = request.getParameter("oid");   // order id
				String s3 = request.getParameter("txt1");   // name
			    String s4 = request.getParameter("txt2");   // address
	            String s5 = request.getParameter("txt3");   // number
	            HttpSession session2 = request.getSession();
				String s6 = (String) session2.getAttribute("bquantity");  // book quantity
				String s7 = (String)session2.getAttribute("bookid");  // book id
				
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookStore", "root","sqlsewebsite@2");
				
				PreparedStatement st = (PreparedStatement) con.prepareStatement("insert into order_details (Order_Id,Customer_Name,Phone_No,Address,Quantity,Book_ID,Order_Date) values(?,?,?,?,?,?,?)");
				
				
				st.setString(1, s2);
				st.setString(2, s3);
				st.setString(3, s5);
				st.setString(4, s4);
				st.setString(5, s6);
				st.setString(6, s7);
				st.setString(7, s1);
				
				
				
				
				st.execute();
				
				response.sendRedirect("Thanks.jsp");
				
				
				
			}
			
			catch(Exception e) {
				
				System.out.println(e);
				
				
			}
		
	}

}

