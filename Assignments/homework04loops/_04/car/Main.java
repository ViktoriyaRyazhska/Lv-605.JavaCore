package homework04loops._04.car;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

//	Create class Car with fields type, year of production and engine capacity.
//	Create and initialize four instances of class Car. Display cars
//	of certain model year (enter year in the console);
//	ordered by the field year.

	public static void main(String[] args) throws Exception {
		Car[] cars = { new Car(CarType.SEDAN, 1969, (float) 1.9), new Car(CarType.HATCHBACK, 1999, (float) 2.5),
				new Car(CarType.SEDAN, 1996, (float) 3), new Car(CarType.HATCHBACK, 2008, (float) 1.6) };

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the model year of a car you are interested in to get info about it:");
		int modelYear = Integer.parseInt(br.readLine());
		if (modelYear == 1969 || modelYear == 1999 || modelYear == 1996 || modelYear == 2008) {
			for (int c = 0; c < cars.length; c++) {
				if (cars[c].getYearOfProduction() == modelYear) {
					System.out.println(cars[c]);
				}
			}
		} else {
			System.out.println("Wrong year :(");
		}

		Car temp;
		for (int i = 0; i < cars.length; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
					temp = cars[i];
					cars[i] = cars[j];
					cars[j] = temp;
				}
			}

		}
		System.out.println("\nCars sorted by the year of production in ascending order:");
		for (Car c : cars) {
			System.out.println(c);
		}
	}
}
