package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class changePasswordServlet
 */
@WebServlet("/changePasswordServlet")
public class changePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changePasswordServlet() {
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
		String userpass=request.getParameter("userpass");
		String confpass=request.getParameter("confpass");
		String ano=request.getParameter("ano");
		System.out.println("userpass :"+userpass);
		System.out.println("confpass :"+confpass);
		System.out.println("ano :"+ano);
		
		Long accno=Long.parseLong(ano);
		if(userpass.equals(confpass))
		{
			System.out.println("Password Confirmed..");
			AccountDetailsDao ad=new AccountDetailsDao();
			ad.updatePassword(accno, userpass);
			System.out.println("In change password servlet Password Updated..");
		}
		else
		{
			System.out.println("Different passwords..");
		}
	}

}
