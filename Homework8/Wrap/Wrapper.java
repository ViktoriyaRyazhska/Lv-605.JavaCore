package lesson8.homeworktask1.Wrap;
//Create Wrapper<T> class with private field of T type which is called value.
// In Wrapper class create public constructor and setValue and getValue methods for value field.
public class Wrapper<T> {
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


}
