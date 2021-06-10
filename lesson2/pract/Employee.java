package lesson2;

public class Employee {
	private String name;
	private int rate;
	private int hours;
	private static double totalSum;
	//constructor
	public Employee() {
		this.name = "NoName";
	}
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum+=getSalary()+getBonuses();
	}
	
	//get and set
	public double getBonuses() {
		return getSalary()*0.1;
	}
	public int getSalary() {
		return rate*hours;
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
	public void changeRate(int rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		totalSum-=this.getSalary()+this.getBonuses();
		this.hours = hours;
		totalSum+=this.getSalary()+this.getBonuses();
	}
	public static double getTotalSum() {
		return totalSum;
	}
	//toString
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours 
				+ ", salary=" + this.getSalary() + ", bonus="+ this.getBonuses() 
				+ ", totalSum=" + this.getTotalSum() +"]";
	}
	
	
	
}
