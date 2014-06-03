package p1;

public class Test {
	// int x;

	static class StaticInnerClass1 {

		public StaticInnerClass1() {
			// TODO Auto-generated constructor stub
			System.out.println("Constructor of static class StaticInnerClass2");
		}

		// static class InsideStaticInnerClass{
		// public InsideStaticInnerClass() {
		// // TODO Auto-generated constructor stub
		// System.out.println("This is a class inside Static Inner Class");
		// }
		// }

		public void print1() {
			System.out.println("Inner static class method called");
		}
	}

	public static class StaticInnerClass2 {
		public StaticInnerClass2() {
			// TODO Auto-generated constructor stub
			System.out
					.println("Constructor of public static class PublicStaticInnerClass2");
		}

		public void print2() {
			System.out.println("Inner Static class 2 method is called");
		}
	}

	// public static void main(String[] args) {
	//
	// StaticInnerClass1 staticInnerClass1 = new StaticInnerClass1();
	// staticInnerClass1.print1();
	//
	// StaticInnerClass2 staticInnerClass2 = new StaticInnerClass2();
	// staticInnerClass2.print2();
	//
	// }

}
