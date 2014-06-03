package p1;

public class Person {
	int age;
	String name;

	public Person() {
		// TODO Auto-generated constructor stub
		this.age = 23;
		this.name = "Rahul G. Uppalwar";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Name : " + this.name + " || Age : " + this.age);
	}

}
