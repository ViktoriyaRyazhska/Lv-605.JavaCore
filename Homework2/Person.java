package homework2;

public class Person {
       private String name;
       private int birthYear;
       public Person() {
       }
       public Person(String name) {
              this.name = name;
       }
       public Person(String name, int birthYear) {
              this.name = name;
              this.birthYear = birthYear;
       }

       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public int getBirthYear() {
              return birthYear;
       }

       public void setBirthYear(int birthYear) {
              this.birthYear = birthYear;
       }

      public int getAge() {
              return 2021 - birthYear;
       }

    @Override
       public String toString() {
              return "Person[name=" + name +", birthYear=" + birthYear +", age=" + this.getAge() +"]";
       }
}


