package homework05oop01._01.bird;

//Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().  
//Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken. 
//Create array Bird and add different birds to it. 
//Call fly() method for all of it. Output the 
//information about each type of created bird.
public class Main {

	public static void main(String[] args) {
		Bird[] birds = { new Eagle(3), new Penguin(1), new Swallow(5), new Chicken(12) };
		
		for (Bird brd : birds) {
			System.out.println(brd);
			brd.fly();
			System.out.println("Is it true, that I've got some feathers? " + brd.getFeathers());
			System.out.println();
		}
	}
}
