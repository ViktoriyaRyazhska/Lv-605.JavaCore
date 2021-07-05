package lesson8.homeworktask1;

abstract class Person {
    private FullName fullName;
    private int age;
    public abstract String activity();

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }


    public Person(int age, FullName fullName) {
        this.age = age;
        this.fullName = fullName;
    }

//    public Person(String firstName, String lastName, int age) {
//        fullName.firstName = firstName;
//        fullName.lastName = lastName;
//        this.age = age;
//    }

    // getters and setters
//    public FullName getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(FullName fullName) {
//        this.fullName = fullName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public class FullName {
//        private String firstName;
//        private String lastName;
//
//        public FullName(String firstName, String lastName) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//
//
//        }



    }

