package forthone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Car {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String[] type = {"TESLA", "AUDI", "BMW", "TOYOTA"};
		int[] yearOfProd = {2019, 2013, 2015, 2009};
		int[] engCap = {5, 2, 1, 4};
		
			System.out.println("We have a few cars - 2009, 2013, 2015, 2019 years. Enter the year you need: ");
			int yearOfProduction = Integer.parseInt(br.readLine());
		
			switch (yearOfProduction) {
			case 2019:
				System.out.println("The type of car: " + type[0] + ", and it's engine capacity: " + engCap[0] + ".");
				break;
			case 2013:
				System.out.println("The type of car: " + type[1] + ", and it's engine capacity: " + engCap[1] + ".");
				break;
			case 2015:
				System.out.println("The type of car: " + type[2] + ", and it's engine capacity: " + engCap[2] + ".");
				break;
			case 2009:
				System.out.println("The type of car: " + type[3] + ", and it's engine capacity: " + engCap[3] + ".");
				break;
			default:
				System.out.println("You entered a year, we don't have a car.");
				break;
			}
			
			int ca;
			for (int i = 0; i < yearOfProd.length; i++) {
				for (int j = i + 1; j < yearOfProd.length; j++) {
					if (yearOfProd[i] < yearOfProd[j]) {
						ca = yearOfProd[i];
						yearOfProd[i] = yearOfProd[j];
						yearOfProd[j] = ca;
					}
				}
			}

			System.out.println("Cars, ordered by years:");
			
			for (int i = 0; i < yearOfProd.length; i++) {
				System.out.print(yearOfProd[i] + "; ");
			}

			}
		}