package p1;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person() {
			int i = 10;
			int j = 20;

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return ("X : " + this.i + " Y : " + this.j);
			}
		};
		System.out.println(person1);

		Person person2 = new Person();
		System.out.println(person2);
	}

}
