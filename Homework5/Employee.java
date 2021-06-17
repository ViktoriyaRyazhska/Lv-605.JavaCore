package Lesson5;
//Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//all employees of a certain department (enter department number in the console);
//arrange workers by the field salary in descending order.
public class Employee {
    private String name;
    private int departmentnumber;
    private int salary;



    public Employee(String name, int departmentnumber, int salary){
        this.name = name;
        this.departmentnumber = departmentnumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(int departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentnumber=" + departmentnumber +
                ", salary=" + salary +
                '}';
    }
}
