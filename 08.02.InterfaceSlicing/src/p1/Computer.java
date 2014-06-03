package p1;

public class Computer implements Runnable {
	String name;

	public Computer() {
		// TODO Auto-generated constructor stub
		this.name = "HP";
		System.out.println("Object Of Computer Class is Created");
	}

	public void print() {
		System.out
				.println("Print Mothod Of Runnable Interface is OverRidden By Computer Class");
	}

	public void notInInterfaceMethod() {
		System.out
				.println("This method is not present in interface : Computer :: notInInterfaceMethod() ");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Name : " + this.name + " Age : " + age); // age is from
															// Interface
															// Runnable
	}

}
