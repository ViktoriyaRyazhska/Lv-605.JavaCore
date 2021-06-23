package homework03conditions._02.dog;
//Create class Dog with fields name, breed, age. 

//Declare enum for field breed. 
//Create 3 instances of type Dog. 
//Check if there is no two dogs with the same name. 
//Display the name and the kind (breed) of the oldest dog. 

public class Main {

	public static void main(String[] args) {
		Dog one = new Dog("Lafi", Breed.BULLDOG, 4);
		Dog two = new Dog("Chuck", Breed.RETRIEVER, 7);
		Dog three = new Dog("Molly", Breed.ROTTWEILER, 2);

		Dog oldest = one;

		boolean check = false;

		if (one.equals(two)) {
			check = true;
		} else {
			if (two.equals(three)) {
				check = true;
			} else {
				if (three.equals(one)) {
					check = true;
				} else {
					check = false;
				}
			}
		}

		if (check) {
			System.out.println("There are dogs with the same name.");
		} else {
			System.out.println("All dogs have different names.");
		}

		if (two.getAge() > oldest.getAge()) {
			oldest = two;
		}
		if (three.getAge() > oldest.getAge()) {
			oldest = three;
		}

		System.out.println("Oldest dog is named " + oldest.getName() + ", and it's of "
				+ oldest.getBreed().toString().toLowerCase() + " breed.");

	}
}