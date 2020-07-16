package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.controller.*;
/**
 * Servlet implementation class forgetPasswordServlet
 */
@WebServlet("/forgetPasswordServlet")
public class forgetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forgetPasswordServlet() {
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
		Long accno;
		String password;
		String ID=request.getParameter("accno");
		String email= request.getParameter("email");
		accno=Long.parseLong(ID);
		System.out.println("Accno: "+ID);
		System.out.println("email: "+email);
		AccountDetailsDao add=new AccountDetailsDao();
		password=add.searchAccount(accno, email);
		System.out.println("password: "+password);
		if(password==null)
		{
			System.out.println("Invalid From ForgetPasswordServlet");
		}
		else
		{
			otpGenerator og=new otpGenerator();
			String otp=og.getOTP();
			og.sendEmail(email, otp);
			System.out.println("mail sent...");
			
			request.setAttribute("otp", otp);
			request.setAttribute("ano", accno);
			getServletConfig().getServletContext().getRequestDispatcher("/otpValidation.jsp").forward(request, response);
		}
	}

}
