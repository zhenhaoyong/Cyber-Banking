package servlet.client;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.client.ISUser;
import dao.client.ModifyInfo;
import dao.impl.ISUserImpl;
import dao.impl.ModifyInfoImpl;

/**
 * Servlet implementation class LogInServlet
 */
public class LogInServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/**
		 *get attributes from login page 
		 */
		String phoneNo = (String)request.getParameter("phoneNo");
		String password = (String)request.getParameter("password");
		String identity = (String)request.getParameter("identity");
		
		
		ISUser iu = new ISUserImpl();
		ModifyInfo mi = new ModifyInfoImpl();
		HttpSession session = request.getSession();
		
		/**
		 * authenticate identity 
		 */
		if (identity == null) {
			session.setAttribute("false", "Y");
			response.sendRedirect("login/LogIn.jsp");
			return;
		}
		
		String name;
		if (identity.equals("client")) {
			if ((name = iu.isClientExist(phoneNo, password)) == null) {//authenticate false 
				session.setAttribute("false", "Y");
				response.sendRedirect("LogIn.jsp");
			} else {
				session.setAttribute("phoneNo", phoneNo);
				session.setAttribute("name", name);
				session.setAttribute("password", password);
				session.setAttribute("identity", identity);
				session.setAttribute("email", mi.quiryEmail(phoneNo));
				
				Cookie cookien = new Cookie("phoneNo", phoneNo);
				Cookie cookiep = new Cookie("password", password);
				Cookie cookiei = new Cookie("identity", identity);
				
				response.addCookie(cookiei);
				response.addCookie(cookiep);
				response.addCookie(cookien);
				response.sendRedirect("customerHOME.jsp");
			}
		}
		
		if (identity.equals("staff")) {
			if ((name = iu.isStaffExist(phoneNo, password)) == null) {//authenticate false 
				session.setAttribute("false", "Y");
				response.sendRedirect("LogIn.jsp");
			} else {
				session.setAttribute("name", name);
				session.setAttribute("phoneNo", phoneNo);
				session.setAttribute("password", password);
				session.setAttribute("identity", identity);
				
				Cookie cookien = new Cookie("phoneNo", phoneNo);
				Cookie cookiep = new Cookie("password", password);
				Cookie cookiei = new Cookie("identity", identity);
				
				response.addCookie(cookiei);
				response.addCookie(cookiep);
				response.addCookie(cookien);
				response.sendRedirect("/OnlineBank/staff/page_1.html");
			}
		}
		
		if (identity.equals("administrator")) {
			
			if ((name = iu.isAdminExist(phoneNo, password)) == null) {
				session.setAttribute("false", "Y");
				response.sendRedirect("LogIn.jsp");
			} else {
				session.setAttribute("name", name);
				session.setAttribute("phoneNo", phoneNo);
				session.setAttribute("password", password);
				session.setAttribute("identity", identity);
				
				Cookie cookien = new Cookie("phoneNo", phoneNo);
				Cookie cookiep = new Cookie("password", password);
				Cookie cookiei = new Cookie("identity", identity);
				
				response.addCookie(cookiei);
				response.addCookie(cookiep);
				response.addCookie(cookien);
				response.sendRedirect("/OnlineBank/administator/page_1.html");
			}
		}
		
		
	}

}
