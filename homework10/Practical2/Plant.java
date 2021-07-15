package homework10.Practical2;

import java.util.Arrays;

public class Plant {
	private int size;
	private Color color;
	private Type type;

	public Plant() {
	}

	public Plant(int size, String color, String type) throws ColorException, TypeException {
		Color c = colorStrToEnum(color);
		Type t = typeStrToEnum(type);
		
		this.size = size;
		this.color = c;
		this.type = t;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}
	
	private Color colorStrToEnum(String color) throws ColorException{
		if (Arrays.toString(Color.values()).contains(color.toUpperCase())) {
			return Color.valueOf(color);
		}
		throw new ColorException("You have entered non-existing color!");
	}
	
	private Type typeStrToEnum(String type) throws TypeException{
		if (Arrays.toString(Type.values()).contains(type.toUpperCase())) {
			return Type.valueOf(type);
		} 
		throw new TypeException("You have entered wrong type!");
	}
	
}
