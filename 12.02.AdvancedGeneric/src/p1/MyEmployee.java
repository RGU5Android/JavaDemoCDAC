package p1;

public class MyEmployee extends Employee {

	public MyEmployee(int age, String name) {
		super(age, name);
	}

	@Override
	public String toString() {
		return "MyEmployee [age= " + age + ", name= " + name + "]";
	}

}
