package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class validateOtpServlet
 */
@WebServlet("/validateOtpServlet")
public class validateOtpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validateOtpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String otp=request.getParameter("otp");
		String ano=request.getParameter("ano");
		String userotp=request.getParameter("userotp");
		System.out.println("otp :"+otp);
		System.out.println("ano :"+ano);
		System.out.println("ano :"+userotp);
		
		if(otp.equals(userotp))
		{
			System.out.println("otp verified successfully");
			request.setAttribute("ano", ano);
			getServletConfig().getServletContext().getRequestDispatcher("/NewPassword.jsp").forward(request, response);
		}
		else
		{
			System.out.println("Invalid otp");
		}
	}

}
