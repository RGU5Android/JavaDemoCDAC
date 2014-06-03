class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printInfo();

		System.out
				.println("*****************************************************************************************************************");

		Person p2 = new Person(23, "Rohit Mishra");
		p2.printInfo();

		System.out
				.println("*****************************************************************************************************************");

		// One Dimension Array Of Class ;
		Person p3[] = new Person[5];
		for (int index = 0; index < p3.length; index++) {
			p3[index] = new Person();
		}
		for (int index1 = 0; index1 < p3.length; index1++) {
			p3[index1].printInfo();
		}

		System.out
				.println("*****************************************************************************************************************");

		Person p4[] = new Person[] { new Person(12, "AAA"),
				new Person(13, "BBB"), new Person(14, "CCC"),
				new Person(15, "DDD"), new Person(16, "EEE"), };
		for (int index2 = 0; index2 < p3.length; index2++) {
			p4[index2].printInfo();
		}

		System.out
				.println("*****************************************************************************************************************");

		Person p5[][] = new Person[5][];
		for (int init = 0; init < p5.length; init++) {
			p5[init] = new Person[10];
		}

		for (int row = 0; row < p5.length; row++) {
			for (int col = 0; col < p5[row].length; col++) {
				p5[row][col] = new Person(111, "2D Class Array");
			}
		}

		for (Person pn[] : p5) {
			for (Person tempPerson : pn) {
				System.out.println(tempPerson);
			}

		}
		System.out
				.println("*****************************************************************************************************************");
	}
}
