package lesson7.homework1task;

import java.util.Arrays;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("1", "Ira", 7200),
                new SalariedEmployee("2", "Anya", 951477, 8, 280),
                new ContractEmployee("3", "Viktor", 14500),
                new SalariedEmployee("4", "Ivan", 357852, 5, 420)


        };

        Arrays.sort(employees, Employee.getPayComparator());

        for(Employee employee: employees) {
            System.out.println(employee);
            System.out.println(((Payment)employee).calculatePay());
        }
    }
    }

