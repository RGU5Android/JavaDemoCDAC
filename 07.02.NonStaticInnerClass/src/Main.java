class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.printInfo();

		Person.InnerNonStaticClass1 innerNonStaticClass1 = p1.new InnerNonStaticClass1();
		innerNonStaticClass1.value1 = 10;
		innerNonStaticClass1.printValue();

		System.out.println(innerNonStaticClass1.hashCode());
		// System.out.println(innerNonStaticClass1.toString());

		Person.InnerNonStaticClass2 innerNonStaticClass2 = p1.new InnerNonStaticClass2();
		innerNonStaticClass2.printValue();

		System.out.println(innerNonStaticClass1.hashCode());
	}

}
