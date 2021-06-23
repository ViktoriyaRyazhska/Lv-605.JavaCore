package lesson7.practTask.task1;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = {
				new Cat(),
				new Dog()
		};
		for(Animal animal:animals) {
			System.out.println("I am a " + animal.getClass().getSimpleName());
			animal.feed();
			animal.voice();
		}
	}
	

}
