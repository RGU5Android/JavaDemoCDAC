import p1.Test;

class Main {
	public static void main(String[] args) {

		// Test.StaticInnerClass1 innerClass1 = new Test.StaticInnerClass1();
		// innerClass1.print1() ;
		// Since the class is not public.

		Test.StaticInnerClass2 innerClass2 = new Test.StaticInnerClass2();
		innerClass2.print2();
	}
}