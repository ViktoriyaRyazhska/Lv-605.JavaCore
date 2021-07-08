package homework2;

public class Main {
	
	public static void main(String[] args) {
		
		Wrapper<Integer> integer = new Wrapper<Integer>(1);
		Wrapper<String> str = new Wrapper<String>("It's a String");
		Wrapper<Boolean> bl = new Wrapper<Boolean>(true);
		
		System.out.println(integer.getValue() +"\n" + str.getValue()+"\n" + bl.getValue());
		
		
	}
}
