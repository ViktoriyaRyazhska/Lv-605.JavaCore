package homework1;

public class DogMain {

	public static void main(String[] args) {
		
		
		Dog d = new Dog("Zeus", Breed.BERNESE, 7);
		Dog d1 = new Dog ("Zeus", Breed.COLLIE, 6);
		Dog d2 = new Dog ("Volt", Breed.SAMOYED,5);
		
		Dog oldestDog = d;
		
		boolean check = false;
		
		if (d.equals(d1)) {
			
			check = true;{
				
			}
		if (d1.equals(d2)){
			check=true;
		}
		if (d.equals(d)) {
			check = true;
		}
		
	}
		if (d1.getAge() > oldestDog.getAge()) {
			oldestDog = d1;
		}
		
		if (d2.getAge() > oldestDog.getAge()) {
			oldestDog = d2;
		}
	
	
		System.out.println("The Name of the oldest Dog is - " + oldestDog.getName() + "\n" + "The Age of the oldest dog is - " + oldestDog.getBreed().toString().toLowerCase());
}
}
