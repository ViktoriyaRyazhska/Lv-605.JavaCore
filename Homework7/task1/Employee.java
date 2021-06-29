package lesson7.homework1task;

import java.util.Comparator;
import java.util.function.Function;

public class Employee {
    private String employeeID;
    private String name;
    static PayComparator payComparator = new PayComparator( );

    public Employee(String employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static PayComparator getPayComparator() {
        return payComparator;
    }

    public static void setPayComparator(PayComparator payComparator) {
        Employee.payComparator = payComparator;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    static class PayComparator implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            return (((Payment)o2).calculatePay()-((Payment)o1).calculatePay());
        }

//     а так посортуємо по імені
//        @Override
//        public int compare(Object o1, Object o2) {
//            return ((Employee)o1).getName().compareTo(((Employee)o2).getName()) ;
//
//        }
    }
}
