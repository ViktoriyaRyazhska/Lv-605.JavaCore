import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person();
        person1.setFirstName("Volodya");
        person1.setLastName("Hrytsuk");
        person1.setBirthYear(2000);

        Person person2 = new Person();
        person2.setFirstName("Olha");
        person2.setLastName("Grygorash");
        person2.setBirthYear(2001);

        Person person3 = new Person("Oleh", "Shebunchak");
        person3.setBirthYear(2002);

        Person person4 = new Person("Adam", "Smerechuk");
        person4.setBirthYear(2001);

        System.out.println("Age of the first person: " + person1.getAge());
        System.out.println("Age of the second person: " + person2.getAge());
        System.out.println("Age of the third person: " + person3.getAge());
        System.out.println("Age of the fourth person: " + person4.getAge());

        Person person5 = new Person();
        person5.input();

        System.out.println(person1.output());
        System.out.println(person2.output());
        System.out.println(person3.output());
        System.out.println(person4.output());
        System.out.println(person5.output());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Change your first and last name data of first person: ");
        person1.changeName(br.readLine(), br.readLine());
        System.out.println("Change your first and last name data of second person: ");
        person2.changeName(br.readLine(), br.readLine());
        System.out.println("Change your first and last name data of third person: ");
        person3.changeName(br.readLine(), br.readLine());
        System.out.println("Change your first and last name data of fourth person: ");
        person4.changeName(br.readLine(), br.readLine());
        System.out.println("Change your first and last name data of fifth person: ");
        person5.changeName(br.readLine(), br.readLine());

        System.out.println(person1.output());
        System.out.println(person2.output());
        System.out.println(person3.output());
        System.out.println(person4.output());
        System.out.println(person5.output());
    }
}
