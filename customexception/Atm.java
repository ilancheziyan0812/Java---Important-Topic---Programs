package com.customexception;

public class Atm {

	int pin;
	
	Atm(int pin)
	{
		this.pin = pin;
	}
	
	public void checkPin()
	{
		if(pin ==1234)
		{
			System.out.println("Valid Pin ");
		}
		else
		{
			try
			{
				throw new InvalidPinException("Invalid Pin , please Enter Valid Pin");
			}
			catch(InvalidPinException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}
}
