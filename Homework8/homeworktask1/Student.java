package lesson8.homeworktask1;

public class Student extends Person{
    private int course;


    public Student(FullName fullName, int age, int course) {
        super(age, fullName);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() +", Course: "+course;
    }

    @Override

    public String activity() {
        return ("I study at university");
    }
}
