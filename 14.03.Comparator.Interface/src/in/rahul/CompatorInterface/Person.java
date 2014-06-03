package in.rahul.CompatorInterface;

import java.util.Comparator;

public class Person implements Comparator<Person>{
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

	// In case of compare :
	// if it return 0 	- arg0 = arg1
	// if it return 1 	- arg0 > arg1
	// if it return -1 	- arg0 < arg1
		
	@Override
	public int compare(Person arg0, Person arg1) {
		int result = 0 ;
		if(arg0.age == arg1.age){
			result = 0 ;
		}else if(arg0.age > arg1.age){
			result = 1 ;
		}else if(arg0.age < arg1.age){
			result = -1 ;
		}
		return result;
	}
}
