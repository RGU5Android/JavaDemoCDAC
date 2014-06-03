package in.rahul.ComparableInterface;

public class Person implements Comparable<Person> {
	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person { Age = " + age + ", Name = " + name + " } ";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() is called");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		return true;
	}

	@Override
	public int compareTo(Person arg0) {
		System.out.println("compareTo() is called");
		int result = 0;

		if (this.age == arg0.age) {
			result = 0;
		} else if (this.age > arg0.age) {
			result = 1;
		} else if (this.age < arg0.age) {
			result = -1;
		}
		return result;
	}

	// In case of compareTo :
	// if it return 0 - equals
	// if it return 1 - this > arg0
	// if it return -1 - this < arg0

}
