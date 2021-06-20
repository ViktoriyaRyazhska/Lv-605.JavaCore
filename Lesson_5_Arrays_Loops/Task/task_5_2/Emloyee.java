package Lesson_5_Arrays_Loops.Task.task_5_2;

public class Emloyee {
    private String name;
    private int department_number;
    private float salary;

    public Emloyee(){

    }

    //<editor-fold desc="Constructor">
    public Emloyee(String name) {
        this.name = name;
    }

    public Emloyee(String name, int department_number) {
        this.name = name;
        this.department_number = department_number;
    }

    public Emloyee(String name, int department_number, float salary) {
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }
    //</editor-fold>

    //<editor-fold desc="Getter&Setter">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment_number() {
        return department_number;
    }

    public void setDepartment_number(int department_number) {
        this.department_number = department_number;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    //</editor-fold>
}

