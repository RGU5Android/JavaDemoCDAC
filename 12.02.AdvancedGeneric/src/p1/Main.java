package p1;

public class Main {

	public static void printObject(PrintClass<?> pc) {
		System.out.println("Object : " + pc);
	}

	// Only Person and its base class can use this function
	public static void printExtendsPerson(PrintClass<? extends Person> pc) {
		System.out.println("Object : " + pc);
	}

	// Only Employee and its base class can use this function
	public static void printExtendsEmployee(PrintClass<? extends Employee> pc) {
		System.out.println("Object : " + pc);
	}

	// Only MyEmployee and its base class can use this function
	public static void printExtendsMyEmployee(
			PrintClass<? extends MyEmployee> pc) {
		System.out.println("Object : " + pc);
	}

	// Only Employee and its super class can use this function
	public static void printSuperEmployee(PrintClass<? super Employee> pc) {
		System.out.println("Object : " + pc);
	}

	public static void main(String[] args) {

		PrintClass<Integer> pcInt = new PrintClass<Integer>(10);
		// System.out.println(pcInt);

		PrintClass<Double> pcDouble = new PrintClass<Double>(20.55);
		// System.out.println(pcDouble);

		PrintClass<String> pcString = new PrintClass<String>(
				"Rahul G. Uppalwar");
		// System.out.println(pcString);

		PrintClass<Person> pp = new PrintClass<Person>(new Person(20, "RGU"));
		// System.out.println(pp);

		PrintClass<Employee> pe = new PrintClass<Employee>(new Employee(21,
				"Rahul"));
		// System.out.println(pe);

		PrintClass<MyEmployee> pme = new PrintClass<MyEmployee>(new MyEmployee(
				22, "Rahul G. Uppalwar"));
		// System.out.println(pme);
		System.out
				.println("***************************************************************************************");

		printObject(pcInt);
		printObject(pcDouble);
		printObject(pcString);
		printObject(pp);
		printObject(pe);
		printObject(pme);

		System.out
				.println("***************************************************************************************");

		printExtendsPerson(pp);
		printExtendsPerson(pe);
		printExtendsPerson(pme);

		System.out
				.println("***************************************************************************************");

		printExtendsEmployee(pe);
		printExtendsEmployee(pme);

		System.out
				.println("***************************************************************************************");

		printExtendsMyEmployee(pme);

		System.out
				.println("***************************************************************************************");

		printSuperEmployee(pp);
		printSuperEmployee(pe);

		System.out
				.println("***************************************************************************************");

	}
}
