package p1;

public class Main {
	public static void main(String[] args) {

		System.out.println("CTest1 cTest1 = new CTest1()");
		CTest1 cTest1 = new CTest1();
		cTest1.itest1();
		System.out
				.println("***************************************************************************");

		System.out.println("CTest2 cTest2 = new CTest2()");
		CTest2 cTest2 = new CTest2();
		cTest2.itest1();
		cTest2.itest2();
		System.out
				.println("***************************************************************************");

		System.out.println("ITest1 iTest1 = new CTest1()");
		ITest1 iTest1 = new CTest1();
		iTest1.itest1();
		System.out
				.println("***************************************************************************");

		// ITest2 iTest2 = new CTest1() ; Compile Time Error

		System.out.println("ITest2 iTest2 = new CTest2()");
		ITest2 iTest2 = new CTest2();
		iTest2.itest1();
		iTest2.itest2();
		System.out
				.println("***************************************************************************");

		System.out.println("CTest3 cTest3 = new CTest3()");
		CTest3 cTest3 = new CTest3();
		cTest3.itest1();
		cTest3.itest2();
		cTest3.itest3();
		System.out
				.println("***************************************************************************");

		System.out.println("ITest3 iTest3 = new CTest3()");
		ITest3 iTest3 = new CTest3();
		iTest3.itest3();
		System.out
				.println("***************************************************************************");

	}
}
