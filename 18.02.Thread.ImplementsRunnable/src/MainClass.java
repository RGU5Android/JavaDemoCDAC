public class MainClass {
	public static void main(String[] args) {
		// MyThread mth = new MyThread();
		// Thread th = new Thread(mth);
		// th.start();

		new Thread(new MyThread()).start();

	}
}
