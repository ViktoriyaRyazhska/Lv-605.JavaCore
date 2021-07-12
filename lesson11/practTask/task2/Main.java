package lesson11.practTask.task2;

public class Main {

	public static void main(String[] args) {
		Plant[] plants = new Plant[5];
		try {
			plants[0] = new Plant(5, "yellow", "poppy");
			plants[1] = new Plant(5, "yellow", "iasda");
			plants[2] = new Plant(5, "asdasd", "iris");
			plants[3] = new Plant(5, "red", "blue");
			plants[4] = new Plant(5, "blue", "poppy");
		} catch (ColorException | TypeException e) {
			System.err.println(e);
			e.printStackTrace();
		}
		for(Plant p: plants) {
			System.out.println(p);
		}
	}

}
