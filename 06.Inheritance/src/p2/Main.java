package p2;

import p1.Employee;
import p1.Person;
import p1.Student;

class Main {
	public static void main(String[] args) {
		// Person p1 = new Person() ;
		// System.out.println(p1);

		Person ps1 = new Student();
		System.out.println(ps1);
		System.out
				.println("Hash Code For Object with referrence Of Person and Object Of Student"
						+ ps1.hashCode());

		Person pe1 = new Employee();
		System.out.println(pe1);

		Person ps2 = new Student(25, "Rahul", 25000.00);
		System.out.println(ps2);

		Person pe2 = new Employee(26, "Uppalwar", 35000.00);
		System.out.println(pe2);

	}
}
