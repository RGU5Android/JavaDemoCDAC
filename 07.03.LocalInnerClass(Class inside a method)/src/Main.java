public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		// if we add public : Illegal modifier for the local class
		// PersonInsideMethod; only abstract or final is permitted
		class PersonInsideMethod {
			int age;
			String name;

			public PersonInsideMethod(int age, String name) {
				// TODO Auto-generated constructor stub
				System.out.println("Class inside a method");
				this.age = age;
				this.name = name;
			}

			public PersonInsideMethod() {
				this(22, "Rahul G. Uppalwar");
				// TODO Auto-generated constructor stub
				System.out.println("Class inside a method");

			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return ("Name : " + this.name + "|| Age : " + this.age);
			}
		}
		PersonInsideMethod p1 = new PersonInsideMethod();
		System.out.println(p1);

	}
}
