package Lesson_3_OOP_Class_object.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("type the name of the first employee"); String e1Name = br.readLine();
        System.out.println("now enter his rate"); double e1rate = Double.parseDouble(br.readLine());
        System.out.println("and the number of working hours ");double e1hours = Double.parseDouble(br.readLine());
        Employee e1 = new Employee(e1Name, e1rate, e1hours);
        System.out.printf(" Salary %s %.2f and bonus %.2f\n ", e1.getName(), e1.getSalary(), e1.getBonuses());
        System.out.println("type the name of the first employee"); String e2Name = br.readLine();
        System.out.println("now enter his rate"); double e2rate = Double.parseDouble(br.readLine());
        System.out.println("and the number of working hours" );double e2hours = Double.parseDouble(br.readLine());
        Employee e2 = new Employee(e2Name, e2rate);
        e2.setHours(e2hours);
        System.out.printf("Salary %s %.2f and bonus %.2f\n ", e2.getName(), e2.getSalary(), e2.getBonuses());
        System.out.println("type the name of the third employee"); String e3Name = br.readLine();
        System.out.println("now enter his rate"); double e3rate = Double.parseDouble(br.readLine());
        System.out.println("and the number of working hours ");double e3hours = Double.parseDouble(br.readLine());
        Employee e3 = new Employee();
        e3.setName(e3Name);e3.setRate(e3rate); e3.setHours(e3hours);
        System.out.printf("Salary %s %.2f and bonus %.2f\n ", e3.getName(), e3.getSalary(), e3.getBonuses());
        System.out.println("TotalSum: " + Employee.getTotalSum());
    }
}
