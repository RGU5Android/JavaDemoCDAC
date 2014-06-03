package p1;

public class Person {
	int age;
	String name;

	public Person(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
		System.out.println("Constructor Of Person Class");
	}

	public Person() {
		// TODO Auto-generated constructor stub
		this(23, "RGU");
		System.out.println("Constructor Of Person Class");
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public void printInfo() {
		System.out.println("Person :: PrintInfo");
	}
}
