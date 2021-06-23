package lesson7.homework.task2;

public class Bus extends GroundVehicle {
	private String route;
	public Bus(int passengers, String route) {
		super(passengers);
		this.route = route;
	}

	@Override
	public void drive() {
		System.out.println("The bus starts to drive");
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}
	
	
}
