package org.tns.capgemini.c2tc.dsatm_di;

public class Car {

	private Engine engine;
	
	public Car(Engine engine)
	{
		this.engine=engine;
		System.out.println("Car object created");
	}
	
	public void drive()
	{
		engine.start();
		System.out.println("Car is Running");
	}
}