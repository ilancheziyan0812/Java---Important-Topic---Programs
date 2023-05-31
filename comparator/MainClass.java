package com.comparator;

import java.util.TreeSet;

public class MainClass 
{

	public static void main(String[] args)
	{

		Student s1 = new Student(103,"john");
		Student s2 = new Student(102,"ram");
		Student s3 = new Student(101,"kaali");
		SortById id = new SortById();
		TreeSet<Student> t = new TreeSet<Student>(id);

		t.add(s1);
		t.add(s2);
		t.add(s3);

		for(Student s : t)
		{
			System.out.println(s);
		}
	}

}
