package net.login.registerpage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.login.register.*;
import net.login.model.*;

/**
 * Servlet implementation class registeruser
 */
@WebServlet("/registration")
public class registeruser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private register robj=new register();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registeruser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatch=request.getRequestDispatcher("registration.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		UserBase reg=new UserBase();
		reg.setUsername(username);
		reg.setPassword(password);
		try {
		if(robj.registeruser(reg)==1) {
			response.sendRedirect("registersuccess.jsp");
		}else {
			response.sendRedirect("RegError.jsp");
		}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
