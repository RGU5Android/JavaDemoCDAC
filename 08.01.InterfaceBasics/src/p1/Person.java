package p1;

public class Person implements Runnable {
	String name;

	public Person() {
		// TODO Auto-generated constructor stub
		this.name = "RGU";
		System.out.println("Object Of Person Class is Created");
	}

	public void print() {
		System.out
				.println("Print Mothod Of Runnable Interface is OverRidden By Person Class");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Name : " + this.name + " Age : " + age); // age is from
															// Interface
															// Runnable
	}

}
