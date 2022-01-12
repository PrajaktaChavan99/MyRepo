package study;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=5;i++)
		{
			boolean result=true;
			System.out.println("Enter the Password:");
			String password=sc.nextLine();
			result=verify(password);
			if(result==true)
			{
				System.out.println("Password set successfully");
				break;
			}
			else
				System.out.println("Can't set Password so please enter Strong Password");
		}
		System.out.println("Your attempts to set password are over so you Can't set your Password now");

	}
	public static boolean verify(String password)
	{
		boolean a=false,b=false,c=false,d=false,e=false,f=false;
		for(int i=0;i<password.length();i++)
		{
			if(Character.isLetter(password.charAt(0)))
				a=true;
			
			if(password.length()>=8 && password.length()<=20)
				b=true;
			
			if(Character.isUpperCase(password.charAt(i)))
				c=true;
			
			if(Character.isDigit(password.charAt(i)))
				d=true;
			
			if(Character.isLowerCase(password.charAt(i)))
				e=true;
			
			if(password.charAt(i)=='_' || password.charAt(i)=='-' || password.charAt(i)=='#' || password.charAt(i)=='$')
				f=true;
		}
		if(a==true && b==true && c==true && d==true && e==true && e==true )
			return true;
		else 
			return false;
	}

}
