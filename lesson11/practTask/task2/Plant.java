package lesson11.practTask.task2;

import java.util.Arrays;

public class Plant {
	private int size;
	private Color color;
	private Type type;

	public Plant(int size, String color, String type) throws ColorException, TypeException {
		this.size = size;
		setColor(color);
		setType(type);
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}

	public void setColor(String color) throws ColorException {
		if (!Arrays.toString(Color.values()).contains(color.toUpperCase())) {
			throw new ColorException("You have entered non-existing color!");
		}
		this.color = Color.valueOf(color.toUpperCase());
	}
	public void setType(String type) throws TypeException {
		if (!Arrays.toString(Type.values()).contains(type.toUpperCase())) {
			throw new TypeException("You have entered non-existing type!");
		}
		this.type = Type.valueOf(type.toUpperCase());
	}
}
