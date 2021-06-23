package lesson7.homework.task2;

public class TestVehicle {
	public static void main(String[] args) {
		Passengers[] vehicles = {
				new Boat(4, 10),
				new Liner(10, 3),
				new Plane(25, 1000000),
				new Helicopter(4, 1000, 5000),
				new Bus(12, "Road 66"),
				new Motorcycle(1, 150),
				new Car(4, "BMW")
		};
		
		for(Passengers vehicle: vehicles) {
			if(vehicle instanceof WaterVehicle) {
				((WaterVehicle) vehicle).isSailing();
				continue;
			}
			
			if(vehicle instanceof FlyingVehicle) {
				((FlyingVehicle) vehicle).fly();
				((FlyingVehicle) vehicle).land();
				continue;
			}
			
			if(vehicle instanceof GroundVehicle) {
				((GroundVehicle) vehicle).drive();
				continue;
			}
			
		}
		
	}
	
}
