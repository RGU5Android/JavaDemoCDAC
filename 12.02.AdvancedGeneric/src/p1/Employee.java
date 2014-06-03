package p1;

public class Employee extends Person {

	public Employee(int age, String name) {
		super(age, name);
	}

	@Override
	public String toString() {
		return "Employee [age= " + age + ", name= " + name + "]";
	}
}
