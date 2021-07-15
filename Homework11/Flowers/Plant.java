package lesson11.Flowers;

import java.util.Arrays;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        this.size = size;
        this.color = colorStrToEnum(color);
        this.type = typeStrToEnum(type);

    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
    private Color colorStrToEnum(String color) throws ColorException {
        if (Arrays.toString(Color.values()).contains(color.toUpperCase())) {
            return Color.valueOf(color.toUpperCase());
        }
        throw new ColorException("You have entered non-existing color!");
    }

    private Type typeStrToEnum (String type) throws TypeException {
            if (Arrays.toString(Type.values()).contains(type.toUpperCase())) {
                return Type.valueOf(type.toUpperCase());
            }
            throw new TypeException("You have entered non-existing type!");
        }


    }


