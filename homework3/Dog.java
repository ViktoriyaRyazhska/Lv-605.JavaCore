package homework3;

import java.io.*;

public class Dog {
	private String name;
	private Breed breed;
	private int age;

	public Dog() {
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	public Dog(String name, Breed breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public Dog(String name, Breed breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void CheckNames(Dog[] dogs) {
		if (dogs[0].name == dogs[1].name || 
				dogs[0].name == dogs[2].name || 
				dogs[1].name == dogs[2].name) {
			System.out.println("There are two dogs with the same name.");
		} else {
			System.out.println("There are no dogs with the same name.");
		}
	}

	public static void OldestDog(Dog[] dogs) {
		Dog theOldestDog = dogs[0];
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i].age > theOldestDog.age) {
				theOldestDog = dogs[i];
			}
		}
		System.out.println("The name and the kind of the oldest dog is: " 
				+ theOldestDog.name + ", " + theOldestDog.getBreed());
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Dog[] dogs = new Dog[3];
		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
		}
		for (int i = 0; i < dogs.length; i++) {
			System.out.println("Please enter dog " + (i + 1) + " name: ");
			try {
				dogs[i].setName(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Please enter dog " + (i + 1) 
					+ " breed (COLLIE, BOXER, PUG, DALMATIAN, LABRADOR):");
			try {
				//TODO: We should check the wrong input here.
				dogs[i].setBreed(Breed.valueOf(br.readLine()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Please enter dog " + (i + 1) + " age:");
			try {
				dogs[i].setAge(Integer.parseInt(br.readLine()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			 
		}
		CheckNames(dogs);
		OldestDog(dogs);
		
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
