package p1;

public class Employee extends Person {
	public Employee() {
		// TODO Auto-generated constructor stub
		super(44, "RGU");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Name : " + this.name + " || Age : " + this.age);
	}

	public void printInfo2() {
		// TODO Auto-generated method stub
		System.out.println("Print Info 2 Method Of Class Employee");
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", toString()="
				+ super.toString() + "]";
	}
}
