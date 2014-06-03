package p1;

public abstract class Person {
	int age;
	String name;

	public Person(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	public Person() {
		// TODO Auto-generated constructor stub
		this(23, "Rahul G. Uppalwar");
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public abstract void printInfo();

}
