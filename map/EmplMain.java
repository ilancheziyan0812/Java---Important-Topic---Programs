package com.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EmplMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101,"john");
		Employee e2 = new Employee(103,"ram");
		Employee e3 = new Employee(102,"lokesh");

		Map <Integer,Employee> m1 = new LinkedHashMap<Integer,Employee>();
		
		m1.put(e1.getId(), e1);
		m1.put(e2.getId(), e2);
		m1.put(e3.getId(), e3);
		

		Set<Integer> key = m1.keySet();
		for(Integer e : key)
		{
			System.out.println(e+" "+m1.get(key));
		}
		
			
		
		

	}

}
