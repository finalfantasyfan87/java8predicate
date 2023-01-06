package model;

public class Employee {
	private int age;
	private String firstName;
	private String lastName;
	private double salary;
	private int performanceRating;
	private char gender;
	private String position;
	
	
	public Employee(int age, String firstName, String lastName, double salary, int performanceRating, char gender,
			String position) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.performanceRating = performanceRating;
		this.gender = gender;
		this.position = position;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", performanceRating=" + performanceRating + ", gender=" + gender + ", position=" + position + "]";
	}
	

	

}
