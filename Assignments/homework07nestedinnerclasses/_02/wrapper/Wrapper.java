package homework07nestedinnerclasses._02.wrapper;

public class Wrapper<T> {
	private T value;

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
