package com.comparable;

public class Song implements Comparable<Song> {

	 private Double duration;
	private String name;

	Song(double duration ,String name)
	{
		this.duration = duration;
		this.name =name;
	}

	public String toString()
	{
		return (" Song duration "+ duration + " Song name "+name);
	}

//	public int compareTo(Song s)
//	{
//		return this.duration.compareTo(s.duration);
//	}
	
	public int compareTo(Song s)
	{
		return this.name.compareTo(s.name);
	}

}
