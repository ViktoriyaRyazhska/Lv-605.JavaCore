package practice06oop02._01.animals;

//Create interface Animal with methods voice() and feed().
//Create two classes Cat and Dog, which implement this interface.
//Create array of Animal and add some Cats and Dogs to it. Call voice() and feed() method for all of it

public class Main {

	public static void main(String[] args) {
		Animal[] animals = { new Cat("Tom"), new Dog("Butch"), new Cat("Meowsky"), new Dog("Barkoff") };

		for (Animal a : animals) {
			System.out.println(a.toString());
			a.voice();
			a.feed();
			System.out.println();

		}
	}
}
