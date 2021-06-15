package lesson4.homework.task2;

public class DogTest {
	public static void main(String[] args) {
		Dog dogs[] = new Dog[3];
		dogs[0] = new Dog("Lucky", Breed.GERMAN_SHEPHERD, 5);
		dogs[1] = new Dog("Cooper", Breed.CORGI, 1);
		dogs[2] = new Dog("Lucy", Breed.CHUG, 2);
		boolean sameDogName = false;
		for(Dog d1:dogs) { //циклом for each проходжу по масиву собак і перевіряю кожну можливу пару собак
			for(Dog d2:dogs) { 
				if(d1.getName().toLowerCase()==d2.getName().toLowerCase()) {
					sameDogName = true; //якщо співпадають імена то в змінну вказую true
					break;
				}
			}
		}
		System.out.println("There is two dogs with the same names? "+sameDogName);
		
		int oldestDogIndex = 0; //оголошую змінну, в яку в циклі вкажу індекс найстарішої собкаи
		for(int i = 0; i<dogs.length; i++) {
			//якщо вік собаки з індексом і більше ніж собаки з індексом oldestDogIndex, то змінюю oldestDogIndex
			if(dogs[i].getAge()>dogs[oldestDogIndex].getAge()) oldestDogIndex = i;
		}
		System.out.println("The oldest dog name is " + dogs[oldestDogIndex].getName() 
				+ " and it is a " + dogs[oldestDogIndex].getBreed().toString().toLowerCase());
	}
}
