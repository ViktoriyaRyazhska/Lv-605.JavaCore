package homework4;

import java.io.*;

public class Car {
	String type;
	int year;
	float engine;

	public Car() {
	}

	public Car(String type) {
		this.type = type;
	}

	public Car(String type, int year) {
		this.type = type;
		this.year = year;
	}

	public Car(String type, int year, float engine) {
		this.type = type;
		this.year = year;
		this.engine = engine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getEngine() {
		return engine;
	}

	public void setEngine(float engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", engine=" + engine + "]";
	}

	public void input(int i, BufferedReader br) {
		System.out.println("Please enter car " + (i + 1) + " type: ");
		try {
			this.type = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter car " + (i + 1) + " year: ");
		try {
			this.year = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter car " + (i + 1) + " engine capacity: ");
		try {
			this.engine = Float.parseFloat(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void carsOfTheYear(Car[] cars, BufferedReader br) {
		int year = 0;
		System.out.println("Please enter year: ");
		try {
			year = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("All cars produced in " + year + " :");
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].year == year) {
				System.out.println(cars[i].type);
			}
		}
	}
	
	public static void sortByYear(Car[] cars) {
		Car tmp;
		for (int i = 0; i < cars.length; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if(cars[i].getYear() > cars[j].getYear()) {
					tmp = cars[i];
					cars[i] = cars[j];
					cars[j] = tmp;
				}
			}
		}
		//test output
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].toString());
		}
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car[] cars = new Car[4];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		for (int i = 0; i < cars.length; i++) {
			cars[i].input(i, br);
		}

		carsOfTheYear(cars, br);
		sortByYear(cars);

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
