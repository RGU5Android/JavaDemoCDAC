package p1;

//public class Male extends Student 
//This cannot be done because Student class is Final
//final <class name> - is used to break the inheritance chain.

public class Male extends Person { // This is allowed since Person is not a
									// final class
	public Male() {
		// TODO Auto-generated constructor stub
		super(23, "Rahul G. Uppalwar");
		System.out.println("Constructor Of Male Class is Called");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Male :: printInfo()");
	}

	@Override
	public String toString() {
		return "Male [age=" + age + ", name=" + name + ", toString()="
				+ super.toString() + "]";
	}
}
