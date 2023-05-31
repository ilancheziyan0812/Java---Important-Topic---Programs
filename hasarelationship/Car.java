package com.hasarelationship;

public class Car {

	private int speed;
	private String name;
	
	
	
	public void  carSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public void  carName(String  name)
	{
		this.name = name;
	}
	public void carInfo()
	{
		System.out.println("Speed is : "+speed+" Car name : "+name);
	}
	public static void main(String[] args) {
		
		Car c = new Car();
		c.carSpeed(1000);
		c.carName("Suzuki");
		c.carInfo();
		
		Model m = new Model();
		m.model();
		
	}
	
}


class Model extends Car
{

	
	public void model()
	{
		Engine e = new Engine();
		e.engine();
	}
	
}
class Engine extends Model
{
	public void engine()
	{
		System.out.println("Engine number 1234");
	}
}
