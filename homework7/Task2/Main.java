package homework7.Task2;

public class Main {

	public static void main(String[] args) {
		Wrapper<Integer> intWrapper = new Wrapper<Integer>();
		intWrapper.setValue(10);
		Wrapper<String> stringWrapper = new Wrapper<String>();
		stringWrapper.setValue("Some text");
		Wrapper<Boolean> boolWrapper = new Wrapper<Boolean>();
		boolWrapper.setValue(true);
		System.out.println(intWrapper.getValue());
		System.out.println(stringWrapper.getValue());
		System.out.println(boolWrapper.getValue());
	}

}
