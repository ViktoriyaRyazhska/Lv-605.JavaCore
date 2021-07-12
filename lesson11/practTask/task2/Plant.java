package lesson11.practTask.task2;

import java.util.EnumSet;

public class Plant {
	private int size;
	private Color color;
	private Type type;

	public Plant(int size, String color, String type) throws ColorException, TypeException {
		this.size = size;
		setColorAndType(color, type);
	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}

	private void setColorAndType(String color, String type) throws ColorException, TypeException {
		find(Color.class, color);
		find(Type.class, type);
	}
	private static <E extends Enum<E>> void find(Class<E> enumT, String values) throws ColorException{
		EnumSet<E> all = EnumSet.allOf(enumT);
		if(!all.contains(values.toLowerCase())) {
			throw new ColorException("Wrong "+ enumT.getCanonicalName());
		}
		
	}
}
