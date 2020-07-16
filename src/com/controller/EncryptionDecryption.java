package com.controller;

public class EncryptionDecryption
{
	public static void main(String[] args)
	{
		String encrypted=encrypt("Pratiksha");
		System.out.println("Encrypted\t"+encrypted);
		String decrypted=decrypt("Vxgzoqyng");
		System.out.println("Decrypted\t"+decrypted);
	}
	
	public static String encrypt(String data)
	{
		String text=data;
		int key=6;
		int len=text.length();
		char[] n=new char[len];
		
		for(int i=0;i<text.length();i++)
		{
			char x=text.charAt(i);
			//System.out.println("Character "+x+" at "+i);
			n[i]=(char) (x+key);
		}
		String v=String.valueOf(n);
		return v;
	}
	
	public static String decrypt(String data)
	{
		String text=data;
		int key=6;
		int len=text.length();
		char[] n=new char[len];
		
		for(int i=0;i<text.length();i++)
		{
			char x=text.charAt(i);
			//System.out.println("Character "+x+" at "+i);
			n[i]=(char) (x-key);
		}
		String v=String.valueOf(n);
		return v;
	}
}
