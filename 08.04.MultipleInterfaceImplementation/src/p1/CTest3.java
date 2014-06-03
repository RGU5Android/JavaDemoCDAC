package p1;

public class CTest3 implements ITest2, ITest3 {

	public CTest3() {
		// TODO Auto-generated constructor stub
		System.out.println("Object Of CTest3 created");
	}

	@Override
	public void itest1() {
		// TODO Auto-generated method stub
		System.out.println("CTest3 :: itest1()");
	}

	@Override
	public void itest2() {
		// TODO Auto-generated method stub
		System.out.println("CTest3 :: itest2()");
	}

	@Override
	public void itest3() {
		// TODO Auto-generated method stub
		System.out.println("CTest3 :: itest3()");
	}

}
