package homework;

public abstract class Person {

	
		private int age;
		private FullName fullName;
		
		
		public Person(FullName fullName, int age) {			
			this.age = age;
			this.fullName = fullName;
		}
		
		public String info() {
			
			return "First name : " + fullName.getFirstName() + " Last name: " + fullName.getLastName() + "Age: " + age;
		}
		
		public abstract String activity();
		
}
