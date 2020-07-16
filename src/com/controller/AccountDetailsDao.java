package com.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class AccountDetailsDao 
{
	Connection con;
	PreparedStatement ps;
	Statement statement;
	ResultSet rs;

	public void myConnection() throws Exception
	{
		final String driver="oracle.jdbc.OracleDriver";
		final String username="system";
		final String password="neha123";
		final String url="jdbc:oracle:thin:@localhost:1521:XE";
		//Step1- load driver..
		Class.forName(driver);
		//Step2-Connection to DB
		con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection :"+con);
	}

	public void updatePassword(long accNo,String password)
	{
		int i;
		String newPass=null;
		EncryptionDecryption en=new EncryptionDecryption();
		newPass=en.encrypt(password);
		System.out.println("Encrypted New password :"+newPass);
		try
		{
			myConnection();
			ps=con.prepareStatement("select * from Account_Details where accno=?");
			ps.setLong(1, accNo);
			ResultSet rs=ps.executeQuery();		
			if(rs.next())
			{
				System.out.println("In Database of Ano :"+accNo);
				ps=con.prepareStatement("update Account_Details set password=? where accno=?");
				ps.setString(1,newPass);
				ps.setLong(2,accNo);
				i=ps.executeUpdate();
				if(i>0)
				{
					System.out.println("password Updated");
				}	
			}
			else
			{
				System.out.println("In update password method Account not found");
			}
		}
		catch(Exception e)
		{
			System.out.println("In update password method\t"+e);
		}
	}
	public String searchAccount(long accNo,String email) 
	{
		String em=null;
		String password=null;
		try
		{
			myConnection();
			ps=con.prepareStatement("select * from Account_Details where accno=?");
			ps.setLong(1, accNo);
			ResultSet rs=ps.executeQuery();
		
			if(rs.next())
			{
				em=rs.getString(4);
				System.out.println("Database:"+em+"\nEntered"+email);
				if(em.equals(email))
				{
					password=rs.getString(3);
					System.out.println("In Account Serach Email method Account found Email Found\t");
					
				}
				else
				{
					System.out.println("invalid Email");
				}
			}
			else
			{
				System.out.println("In Account Serach Account method Account not found");
			}
		}
		catch(Exception e)
		{
			System.out.println("In Account Serach Email method\t"+e);
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return password;
	}

			
}
