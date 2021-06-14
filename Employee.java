

	public class Employee {
		private String name;
		int rate;
		int hours;
		private static int number = 0;
		private static int sum = 0;

		public Employee() {
		number++;
		}

		public Employee(String name) {
		this.name = name;
		number++;
		}

		public String getName() {
		return name;
		}

		public void setName(String name) {
		this.name = name;
		}

		public double getrate() {
		return rate;
		}

		public void setrate(int rate) {
		this.rate = rate;
		sum = ((rate* hours));
		}

		public static double getAvgrate() {
		return (double) sum / number;
		}

		public boolean betterEmployee(Employee Employee) {
		return this.getrate() > Employee.getrate();
		}

		@Override
		public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + "]";
		}
		}



		public class Main {

		public static void main(String[] args) {
		Employee Employee1 = new Employee("Oleg");
		Employee1.setrate(4);
		Employee Employee2 = new Employee("Anna");
		Employee2.setrate(5);
		Employee Employee3 = new Employee();
		Employee3.setName("Mary");
		Employee3.setrate(4);
		System.out.println("Out Employees");
		System.out.println(Employee1);
		System.out.println(Employee2);
		System.out.println(Employee3);
		System.out.println();
		System.out.print("Employee 1 has better rate than Employee2 ");
		System.out.println(Employee1.betterEmployee(Employee2));
		System.out.println();
		System.out.printf("Average rate is " + "%.2f", Employee.getAvgrate());
		}

		}

