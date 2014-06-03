package p1;

public class Person {
	int age = 0;
	String name = null;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;

	}

	public Person() {
		this(24, "RGU");
	}

	@Override
	public String toString() {
		String var = "Name : " + this.name + "\t\t" + "Age : " + this.age;
		return var;
	}

}