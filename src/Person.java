public class Person {
	// Fields
	String firstName;
	String lastName;
	String ID;
	String title;
	int YOB;

	// Methods
	public String fullName() {
		return firstName + " " + lastName;
	}

	public String formalName() {
		return title + " " + fullName();
	}

	public int getAge() {
		return getAge(2023); // Assuming current year is 2023
	}

	public int getAge(int year) {
		return year - YOB;
	}
}
