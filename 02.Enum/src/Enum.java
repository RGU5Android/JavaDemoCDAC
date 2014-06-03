enum Enum {
	RED, BLUE, GREEN;
	int x;
	static int y = 10;

	Enum() {
		this.x = 11;
	}

	public static void myStaticFun() {
		System.out.println("This is a static function");
		y = 111;
		System.out.println("Static int y = " + y);

	}

	public void myFunction() {
		System.out.println("This is a non static function");
		System.out.println("x = " + x + "\ny = " + y);
	}

}
