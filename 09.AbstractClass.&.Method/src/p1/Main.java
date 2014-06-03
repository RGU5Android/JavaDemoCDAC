package p1;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.printInfo();
		employee.printInfo2();
		System.out.println(employee);
		System.out
				.println("*******************************************************************");

		Person pe = new Employee();
		pe.printInfo();
		System.out.println(pe);
		System.out
				.println("*******************************************************************");

		// Anonymous Class Object is being created.
		// The class which is used to create an Anonymous Object is Anonymous
		// Class
		// Person person = new <Child Class Of Person>
		// But this is not done.

		Person person = new Person(25, "AAAAA") {

			@Override
			public void printInfo() {
				// TODO Auto-generated method stub
				System.out
						.println("Anonymous Object Of Class Person is created");
			}
		};

		person.printInfo();
		System.out.println(person);

		// Person person = new Person() ; - Cannot instantiate the type Person
		// since it is an Abstract class
		// System.out.println(person);
	}
}
