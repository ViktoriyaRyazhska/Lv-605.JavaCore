package homework2;

public class Main2 {
    public static void main (String... args) {
        Person p1 = new Person();
        p1.setName("Olena");
        p1.setBirthYear(1995);

        Person p2 = new Person("Julia");
        p2.setBirthYear(1994);

        Person p3 = new Person("Vlad", 2018);

        Person p4 = new Person("Elis", 2017);

        Person p5 = new Person("Max", 2002);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        int result1 = p1.getAge();
        int result2 = p2.getAge();
        int result3 = p3.getAge();
        int result4 = p4.getAge();
        int result5 = p5.getAge();

    }
}
