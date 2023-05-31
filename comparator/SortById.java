package com.comparator;

import java.util.Comparator;

import com.comparable.Song;

public class SortById implements Comparator<Student> {
	
	public int compare(Student s1,Student s2)
	{
		return s1.name.compareTo(s2.name);
	}
	
	
	
	
	
}
