package lesson8.homework.task2;

public class Wrapper<T> {
	T value;
	public Wrapper(T value) {
		this.value = value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
}
