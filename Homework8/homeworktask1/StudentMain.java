package lesson8.homeworktask1;

public class StudentMain {


    public static void main(String[] args) {
       // Person.FullName personWithName =
             //   new Person(25).new FullName("Vasyl", "Petrenko");
    Student s1 = new Student(new FullName("Vasyl", "Petrenko"),22,2 );
    Student s2 = new Student(new FullName("Vitya", "Pupkin"),23,4 );
       System.out.println(s1.info() + " \n  "  + s2.info());
        System.out.println(s1.activity());
        System.out.println(s2.activity());

}
}