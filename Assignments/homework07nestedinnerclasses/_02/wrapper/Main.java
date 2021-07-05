package homework07nestedinnerclasses._02.wrapper;

//import java.util.ArrayList;
//import java.util.List;

public class Main {

	public static void main(String[] args) {
		Wrapper<Integer> first = new Wrapper<Integer>(47);
		Wrapper<String> second = new Wrapper<>("Alloha!");
		Wrapper<Boolean> third = new Wrapper<>(true);
		
		// S'hos' ne robyt' :(
//		List<Wrapper[]> wrappers = new ArrayList<Wrapper[]>();
//		wrappers.add(first);
//		wrappers.add(second);
//		wrappers.add(third);
		
		System.out.println(first.getValue());
		System.out.println(second.getValue());
		System.out.println(third.getValue());
	}
}
