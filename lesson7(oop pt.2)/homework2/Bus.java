package homework2;

public class Bus extends GroungVEhicle{
	
	private String route;

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Bus(int passengers, String route) {
		super(passengers);
		this.route = route;
	}
	

}
