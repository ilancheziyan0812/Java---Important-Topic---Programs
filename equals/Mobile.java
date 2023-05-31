package com.equals;

public class Mobile {

	int ram;
	String name;
	
	Mobile(int ram,String name)
	{
		this.ram = ram;
		this.name = name;
	}
	
	public boolean equals(Object obj)
	{
		Mobile m = (Mobile) obj;
		return this.ram == m.ram;
	}
	
}
