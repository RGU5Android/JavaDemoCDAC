package p1;

public class Employee extends Person {
	double salary = 0.0;

	public Employee(int age, String name, double salary) {
		super(age, name);
		this.salary = salary;
	}

	public Employee() {
		this(25, "PERSON CLASS", 10000.00);
	}

	@Override
	public String toString() {
		String var = "Name : " + this.name + "\t\t" + "Age : " + this.age
				+ "\t\t" + "Salary : " + this.salary;
		return var;
	}
}
