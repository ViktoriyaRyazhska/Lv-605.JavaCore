package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//        Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//        all employees of a certain department (enter department number in the console);
//        arrange workers by the field salary in descending order.

public class EmployeeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee[] emp = {
                new Employee("Piter", 4, 5044),
                new Employee("Mike", 3, 4054),
                new Employee("Donald", 5, 3574),
                new Employee("Brus", 5, 9853),
                new Employee("John", 4, 7540)
        };
        System.out.print("Enter department number: ");
        getAllWorkersFromDepartment(emp, Integer.parseInt(br.readLine()));

        System.out.println("Sorted Employee by salary:");
        getSortedEmpArray(emp);

    }
    public static void getAllWorkersFromDepartment(Employee[] emp, int depNum) {
        System.out.println("Employees at this department: ");
        for(Employee e: emp) {
            if(e.getDepartmentnumber()==depNum) System.out.println(e.toString());
        }
    }
    public static void getSortedEmpArray(Employee[] emp) {
        Employee temp;
        for(int i = 0; i < emp.length; i++) {
            for(int j = i+1; j < emp.length; j++) {
                if(emp[i].getSalary()<emp[j].getSalary()) {
                    temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        }
        for(Employee e: emp) {
            System.out.println(e.toString());
        }
    }
    }

