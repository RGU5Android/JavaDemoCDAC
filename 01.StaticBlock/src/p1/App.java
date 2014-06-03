package p1;

public class App {
	int x = 10;
	int y = 20;
	static int num = 1;

	// Block
	{
		x = 11;
		y = 22;
		num = 111;
		System.out.println("x : " + x + " y : " + y + " num : " + num);
	}

	// Static Block
	static {
		num = 222;
		// x = 111 ; Only Statc members can be accessed from a static
		// block
		// y = 222 ;
		System.out.println("num : " + num);
	}

	public App() {
		System.out.println("Default Constructor");
	}

	public void AppTest() {
		System.out.println("Testing package");

	}

}
