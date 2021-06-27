package homework;

public class BirdMain {

	
	public static void main(String[] args) {
		
		
		Bird [] birds = {new Eagle (true, "Brown and white"), 
				new Swallow (true, " Dark and purple"),
				new Penguin (true, "Black and white"),
				new Chicken (true, " Depends on the breed")};
		
	
	
	for (Bird i : birds) {
		System.out.println(i);
		i.fly();
	}

}
}