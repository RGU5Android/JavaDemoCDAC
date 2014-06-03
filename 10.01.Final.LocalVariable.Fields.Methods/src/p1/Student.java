package p1;

public class Student extends Person {
	double pocketMoney;

	public Student(int age, String name, /* double income , */double pocketMoney) {
		// TODO Auto-generated constructor stub
		System.out.println("Student Constructor");
		this.age = age;
		this.name = name;
		// this.income = income ; Since this is final it cannot be reinitialized
		// ;
		this.pocketMoney = pocketMoney;
	}

	public Student() {
		this(23, "RGU", 5000.0);
		System.out.println("Student Constructor");
	}

	// printInfo1() - Cannot be overridden since it is final method

	@Override
	public void printInfo2() {
		// TODO Auto-generated method stub
		System.out.println("Student :: printInfo2()");
		System.out.println("public void printInfo2()");
	}

	@Override
	public String toString() {
		return "Student [pocketMoney=" + pocketMoney + ", age=" + age
				+ ", name=" + name + ", income=" + income + ", toString()="
				+ super.toString() + "]";
	}

}
