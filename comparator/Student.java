package com.comparator;

public class Student 
{

	int id;
	String name;
	
	Student(int id ,String name)
	{
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return ("Student id : "+ id + " Student name : "+name);
	}
	
}
