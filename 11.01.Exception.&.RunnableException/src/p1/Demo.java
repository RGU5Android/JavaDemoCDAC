package p1;

public class Demo {

	public void divide(int a, int b) throws Exception {
		int temp = a / b;
		System.out.println("TEMP : " + temp);
	}

	public static void main(String[] args) {
		Demo demo = new Demo();

		try {
			demo.divide(10, 120);
			demo.divide(10, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out
					.println("Divide by zero error. Enter a Valid number....");
		} finally {
			System.out.println("Hello World");
		}
	}
}