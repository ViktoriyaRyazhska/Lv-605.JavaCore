package homework7;

public class Wrapper<T extends Shape> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
