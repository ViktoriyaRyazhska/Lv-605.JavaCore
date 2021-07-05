package homework07nestedinnerclasses._01.person;

public class FullName {
	private String firstName;
	private String lastName;

	public FullName() {

	}

	public FullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	// Ask Vika how to implement Builder in this case
	public FullNameBuilder getFullName() {
		return new FullNameBuilder();
	}

	public static class FullNameBuilder {
		private FullName fullName = new FullName();

		private FullNameBuilder() {

		}

		public FullNameBuilder setFirstName(String firstName) {
			fullName.firstName = firstName;
			return this;
		}

		public FullNameBuilder setLastName(String lastName) {
			fullName.lastName = lastName;
			return this;
		}
	}
}
