class Person {
	int age;
	String name;

	// Person(){
	// this.age = 24 ;
	// this.name = "Rahul G. Uppalwar"
	// }

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	Person() {
		this(24, "Rahul G. Uppalwar");
	}

	void printInfo() {
		System.out.println("-------------------");
		System.out.println("Name : " + this.name);
		System.out.println("-------------------");
		System.out.println("Age : " + this.age);
	}

	@Override
	public String toString() {
		return ("Name : " + this.name + "\tAge : " + this.age);
	}
}
