package p1;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Person() {
		this(23, "Rahul G. Uppalwar");
	}

	@Override
	public String toString() {
		return "Person : AGE = " + age + " NAME = " + name + "\n";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
