package servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.client.ModifyInfo;
import dao.impl.ModifyInfoImpl;

/**
 * Servlet implementation class ModifyInfo
 */
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ModifyInfo mi = new ModifyInfoImpl();
		
		String phoneNo = (String)request.getParameter("phoneNo");
		String password = (String)request.getParameter("password");
		String email = (String)request.getParameter("email");
		String nowPhone = (String)session.getAttribute("phoneNo");
		
		String res = mi.modifyInfo(nowPhone, phoneNo, email, password);
		
		if (!res.equals("The phoneNo has bound")) {
			nowPhone = phoneNo;
			session.setAttribute("phoneNo", nowPhone);
		}
		
		session.setAttribute("email", mi.quiryEmail(nowPhone));
		session.setAttribute("password", mi.quiryPassword(nowPhone));
		session.setAttribute("modify", res);
		
		response.sendRedirect("modifyInfo.jsp");
		
	}

}
