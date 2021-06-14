package lesson2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Person pr0 = new Person();
        Person pr1 = new Person();
        Person pr2 = new Person("Hlushko", "Andrii");
        Person pr3 = new Person("Seniuk", "Victoriia");
        Person pr4 = new Person("Steve", "Wozniak");

        pr0.input();
        pr1.input();
        pr2.setBirthYear(2000);
        pr3.setBirthYear(1988);
        pr4.setBirthYear(1950);
        pr0.changeName("Steve", "Jobs");
        pr1.changeName("Kevin", "Mitnick");
        pr3.changeName("Andrii", "Hlushko");
        pr0.output();
        pr1.output();
        pr2.output();
        pr3.output();
        pr4.output();

    }
}
