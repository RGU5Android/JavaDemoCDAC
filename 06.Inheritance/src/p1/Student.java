package p1;

public class Student extends Person {
	double pocketMoney = 0.0;

	public Student(int age, String name, double pocketMoney) {
		super(age, name);
		this.pocketMoney = pocketMoney;
	}

	public Student() {
		this(25, "BBBBB", 5000.00);
	}

	@Override
	public String toString() {
		String var = "Name : " + this.name + "\t\t" + "Age : " + this.age
				+ "\t\t" + "Pocket Money : " + this.pocketMoney;
		return var;
	}

}
