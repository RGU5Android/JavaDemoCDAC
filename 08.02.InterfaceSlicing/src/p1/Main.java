package p1;

class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.print();
		person.notInInterfaceMethod();
		System.out.println(person);

		System.out
				.println("*****************************************************************************");

		Computer computer = new Computer();
		computer.print();
		computer.notInInterfaceMethod();
		System.out.println(computer);

		System.out
				.println("*****************************************************************************");

		Runnable rc = new Computer();
		// rc.age = 50 ; //Since it is final
		rc.print();
		// rc.notInInterfaceMethod() ; //This method cannot be called using the
		// referrence of Runnable interface due to Slicing

		System.out
				.println("*****************************************************************************");

		Runnable rp = new Person();
		rp.print();
		// rp.notInInterfaceMethod() ; //This method cannot be called using the
		// referrence of Runnable interface due to Slicing
	}

}
