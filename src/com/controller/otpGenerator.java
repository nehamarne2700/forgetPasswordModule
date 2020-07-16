package com.controller;

import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class otpGenerator 
{
	public String getOTP()
	{
		String conOtp=null;
		String numbers="0123456789";
		String values=numbers;
		Random rndm_method=new Random();
		int len=6;
		char[] otp=new char[len];
		for(int i=0;i<len;i++)
		{
			otp[i]=values.charAt(rndm_method.nextInt(values.length()));
			
		}
		conOtp=String.valueOf(otp);
		System.out.println(conOtp);
		return conOtp;
	}
	public void sendEmail(String email,String otp)
	{
		String ReceiverAddress=email ;
		System.out.println("Add="+ReceiverAddress);
		final String username = "pratiksha.21820071@viit.ac.in";
		final String password = "abc12345";
		String bodyMessage="\t\tHello..\n\tForget Password Request.\nThis is for verifying your Account in our Bank.\n Your OTP code is : "+otp;
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true"); 
		//prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		//System.out.println("4");
		try {
		Session ss = Session.getInstance(prop,new javax.mail.Authenticator()
		{
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() 
			{
				return new javax.mail.PasswordAuthentication(username, password);

			}
		});
		
			//System.out.println("5");
			Message message = new MimeMessage(ss);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(ReceiverAddress));
			message.setSubject("New Account request approved");
			message.setText(bodyMessage);
			//System.out.println("6");
			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) 
		{
			System.out.println("Email\t"+e);
		}
	}

}
