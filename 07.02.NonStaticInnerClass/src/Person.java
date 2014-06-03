public class Person {
	int age;
	String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Person() {
		// TODO Auto-generated constructor stub
		this(23, "Rahul G. Uppalwar");
	}

	public void printInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

	class InnerNonStaticClass1 {
		int value1;

		// static int value2 ; This cannot be done in a Non Static Inner Class
		public InnerNonStaticClass1() {
			// TODO Auto-generated constructor stub
			System.out.println("Inner Non Static Class Constructor is Called");
		}

		public void printValue() {
			System.out.println("From the Non Static Inner Class : Value : "
					+ value1);
		}

		// public static void test(){
		// System.out.println("Public Static Void Method In Non Static Inner Class");
		//
		// }
		// This is the error msg
		// Multiple markers at this line
		// - The method test cannot be declared static; static methods can only
		// be declared in a static or top
		// level type
		// - Method breakpoint:Person$InnerNonStaticClass [entry] - test()
	}

	class InnerNonStaticClass2 {
		public InnerNonStaticClass2() {
			// TODO Auto-generated constructor stub
			System.out.println("Inside Non Static class 2");
		}

		public void printValue() {
			System.out.println("From the Non Static Inner Class2");
		}

	}

	// public static void main(String []args){
	// Person p1 = new Person();
	// InnerNonStaticClass1 innerNonStaticClass1 = p1.new InnerNonStaticClass1()
	// ;
	// InnerNonStaticClass2 innerNonStaticClass2 = p1.new InnerNonStaticClass2()
	// ;
	// }

}
