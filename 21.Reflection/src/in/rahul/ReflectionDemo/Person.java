package in.rahul.ReflectionDemo;

class Person {
	static int age;
	String name;
	public static final int i = 20;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
