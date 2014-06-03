package p1;

public final class Student extends Person {
	int pocketMoney;

	public Student(int age, String name, int pocketMoney) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
		this.pocketMoney = pocketMoney;
		System.out.println("Constructor Of Student Class");
	}

	public Student() {
		// TODO Auto-generated constructor stub
		this(23, "Rahul", 5000);
		System.out.println("Constructor Of Student Class");
	}

	@Override
	public String toString() {
		return "Student [pocketMoney=" + pocketMoney + ", age=" + age
				+ ", name=" + name + "]";
	}

	@Override
	final public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Student :: PrintInfo");

	}

}
