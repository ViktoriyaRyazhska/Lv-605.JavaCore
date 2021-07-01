package lesson8.homework.task2;

public class WrapperTest {

	public static void main(String[] args) {
		Wrapper<Integer> intWrapper =  new Wrapper<>(10);
		Wrapper<String> strWrapper =  new Wrapper<>("Hello!");
		Wrapper<Boolean> boolWrapper =  new Wrapper<>(false);
		
		System.out.println(intWrapper.getValue());
		System.out.println(strWrapper.getValue());
		System.out.println(boolWrapper.getValue());
	}

}
