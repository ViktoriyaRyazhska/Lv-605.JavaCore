package practice10exceptions._02.plant;

public class Plant {
	int size;
	Color color;
	Type type;

	public Plant(int size, String color, String type) throws ColorException, TypeException {
		Color enumColor = colorStringToEnum(color);
		Type enumType = typeStringToEnum(type);
		this.size = size;
		this.color = enumColor;
		this.type = enumType;
	}

	public Color colorStringToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "red":
			return Color.RED;
		case "blue":
			return Color.BLUE;
		case "green":
			return Color.GREEN;
		default:
			throw new ColorException("Inappropriate color. Avaliable ones are: red, green, or blue.");
		}
	}

	public Type typeStringToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "begonia":
			return Type.BEGONIA;
		case "poppy":
			return Type.POPPY;
		case "daisy":
			return Type.DAISY;
		case "lily":
			return Type.LILY;
		case "lilac":
			return Type.LILAC;
		case "dandelion":
			return Type.DANDELION;
		default:
			throw new TypeException(
					"Inappropriate type of plant. Avaliable ones are: begonia, poppy, daisy, lily, lilac, dandelion.");
		}

	}

	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	}
}
