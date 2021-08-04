package thirdone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Dogs {
	
	public enum Breed {
		First("Golden Retriever"),
		Second("Welsh Corgi Pembroke"),
		Third("Maltipu");
		
		private String breed;
		
		Breed(String breed) {
			this.breed = breed;
		}
		
		public String getSomethingWrong() {
			return breed;
		}
		
		public String toString() {
			return breed;
		}
	}

	public static void main(String[] args) throws IOException {
		
		String name;
		String breed;
		int age;
		
		public Dogs(String name, String breed, int age) {
			this.name = name;
			this.breed = breed;
			this.age = age;
		}
		
		Dogs d1 = new Dogs("Duffy", Breed.First, 2);
		Dogs d2 = new Dogs("Nikolas", Breed.Second, 4);
		Dogs d3 = new Dogs("Boyscout", Breed.Third, 9);
		
		public boolean equals;
		
		{
			if (d1.name == d2.name);
			return false;
			if (d1.name == d3.name);
			return false;
			if (d2.name == d3.name);
			return false;
		}
		
		{
			if (d1.getAge() > d2.getAge() && d1.getAge() > d3.getAge()) {
				System.out.println("The oldest dog is " + d1);
			}
		}
		
		{
			if (d2.getAge() > d1.getAge() && d2.getAge() > d3.getAge()) {
				System.out.println("The oldest dos is " + d2);
			}
		}
		
		{
			if (d3.getAge() > d1.getAge() && d3.getAge() > d2.getAge()) {
				System.out.println("The oldest dos is " + d3);
			}
		}
	}
}
