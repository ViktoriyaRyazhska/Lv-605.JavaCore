package lesson7.homework.task2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {

	public FlyingVehicle(int passengers) {
		super(passengers);
	}
	
	public abstract void fly();
	
	public abstract void land();
	
}
