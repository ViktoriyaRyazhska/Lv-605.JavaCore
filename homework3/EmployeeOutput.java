

public class EmployeeOutput {
    public static void main(String[] args) {
        Employee first = new Employee( "Vanya", 4, 2);
        Employee second = new Employee("Vasya", 2, 6);// виклик конструктора(з аргументами)
        Employee third = new Employee("Kolya", 3, 8);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


    }
}
