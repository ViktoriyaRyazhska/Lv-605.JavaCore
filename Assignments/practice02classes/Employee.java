package practice02classes;

import java.text.DecimalFormat;

public class Employee {
	static double totalSum;
	private String name;
	private int rate;
	private int hours;

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
		totalSum = totalSum - (getSalary() + getBonuses());
		this.rate = rate;
		totalSum = totalSum + (getSalary() + getBonuses());
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		totalSum = totalSum - (getSalary() + getBonuses());
		this.hours = hours;
		totalSum = totalSum + (getSalary() + getBonuses());
	}

	public Employee() {
	}

	public Employee(String name, int rate) {
		setName(name);
		setRate(rate);
	}

	public Employee(String name, int rate, int hours) {
		setName(name);
		setRate(rate);
		setHours(hours);
	}

	public float getSalary() {
		return hours * rate;
	}

	public double getBonuses() {
		return this.getSalary() * 0.1;
	}

	public double totalPayout() {
		return this.getSalary() + this.getBonuses();
	}

	public String toString() {
		return "Employee: " + name + "; rate: " + rate + "; hours: " + hours + "; salary: " + getSalary()
				+ "; bonuses: " + getBonuses() + ": total: " + totalPayout();
	}

	public static void getTotalSum() {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Sum total of all salaries is " + df.format(totalSum));
	}

	public void changeRate(int rate) {
		totalSum = totalSum - (getSalary() + getBonuses());
		this.rate = rate;
		totalSum = totalSum + (getSalary() + getBonuses());
		System.out
				.println("After changing " + name + "'s rate, the salary is " + (this.getSalary() + this.getBonuses()));
	}
}
