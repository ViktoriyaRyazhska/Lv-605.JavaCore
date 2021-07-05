package practice07nestedinnerclasses._02.wrapper;

public class ShapeWrapper<T extends Shape> {
	private T t;

	public ShapeWrapper(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
}
