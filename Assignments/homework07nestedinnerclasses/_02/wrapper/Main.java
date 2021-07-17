package homework07nestedinnerclasses._02.wrapper;

public class Main {

	public static void main(String[] args) {
		Wrapper<Integer> first = new Wrapper<>(47);
		Wrapper<String> second = new Wrapper<>("Alloha!");
		Wrapper<Boolean> third = new Wrapper<>(true);
		
		System.out.println(first.getValue());
		System.out.println(second.getValue());
		System.out.println(third.getValue());
	}
}
