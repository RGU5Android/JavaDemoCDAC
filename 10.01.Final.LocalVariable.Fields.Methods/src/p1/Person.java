package p1;

public class Person {
	int age;
	String name;
	final double income; // final field must be initialized at the time of
							// declaration or in every constructor or in a
							// block.

	public Person(int age, String name, double income) {
		// TODO Auto-generated constructor stub
		System.out.println("Person Constructor");
		this.income = income;
		this.age = age;
		this.name = name;
	}

	public Person() {
		// TODO Auto-generated constructor stub
		this(23, "Rahul G. Uppalwar", 5001.0);
		System.out.println("Person Constructor");
	}

	public final void printInfo1() {
		System.out.println("Person :: printInfo()");
		System.out.println("public final void printInfo1()");
	}

	public void printInfo2() {
		System.out.println("Person :: printInfo()");
		System.out.println("public final void printInfo2()");
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", income=" + income
				+ "]";
	}

}
