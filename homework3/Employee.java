public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static double totalSum;

    //задаємо конструктор
    public Employee(){
        this.name = "Incognito";
    }
//    описуємо конструктор з двома аргументами
    public Employee(String name, int rate){
//        (ініціалізуємо приватні поля)
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + getSalary()+getBonuses();

    }
// тут відбувається магія гетерів з сетерами
    public int getSalary() {
        return rate * hours;
    }
    public double getBonuses() {
        return getSalary() * 0.1;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum = totalSum - this.getSalary()+this.getBonuses();
        this.hours = hours;
        totalSum= totalSum + this.getSalary()+this.getBonuses();
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "name='" + getName() + '\'' +
                " salary= " + getSalary() +
                ", Bonus= " +  getBonuses() +
                " \n" +
                ", Всього бабла= " + getTotalSum() +
                ", rate= " + getRate() +
                ", hours= " + getHours() +
                '}';
    }
}
