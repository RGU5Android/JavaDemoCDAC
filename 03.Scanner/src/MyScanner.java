class Application {
	int x;
	double y;
	String z;
	private static java.util.Scanner scanner;

	Application(int x, double y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	void printInfo() {
		System.out.println(" INT : " + x);
		System.out.println(" DOUBLE : " + y);
		System.out.println(" STRING : " + z);
	}

	public static void main(String[] args) {

		scanner = new java.util.Scanner(System.in);

		System.out.print("Enter the INT - ");
		int x = scanner.nextInt();
		System.out.println("");

		System.out.print("Enter the Double - ");
		double y = scanner.nextDouble();
		System.out.println("");

		System.out.print("Enter the String - ");
		// next() - it accepts the String till white space is found
		String z = scanner.next();
		System.out.println("");

		Application a1 = new Application(x, y, z);
		a1.printInfo();
	}

}
