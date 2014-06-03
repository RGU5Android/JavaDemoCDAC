package p1;

public class Main {
	public static void main(String[] args) {
		final int i = 10;
		final int j;
		j = 20;
		Person p1 = new Person();
		p1.printInfo1();
		p1.printInfo2();
		System.out.println(p1);
		System.out
				.println("****************************************************************************");

		Student s1 = new Student();
		s1.printInfo1();
		s1.printInfo2();
		System.out.println(s1);
		System.out
				.println("****************************************************************************");

		System.out.println("I : " + i + "\t J: " + j);

	}
}
