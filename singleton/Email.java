
package com.singleton;

public class Email {

	private static Email email;
	
	private Email()
	{
		System.out.println("Enter Your EmailId");
	}
	
	public static void checkEmailid()
	{
		
		if(email == null)
		{
			email = new Email();
			System.out.println("Email id generated Successfully");
		}
		else
		{
			System.out.println("Email id already generated");
		}
	}
	
}
