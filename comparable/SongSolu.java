package com.comparable;

import java.util.TreeSet;

public class SongSolu {

	public static void main(String[] args) {
		
		Song s1 = new Song(4.8,"once upon a time");
		Song s2 = new Song(5.8,"parava");
		
		TreeSet<Song> t = new TreeSet<Song>();
		t.add(s1);
		t.add(s2);
		
		for(Song s : t)
		{
			System.out.println(s);
		}

	}

}
