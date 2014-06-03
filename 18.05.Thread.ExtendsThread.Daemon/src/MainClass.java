public class MainClass {
	public static void main(String[] args) {

		IncrementThread irc = new IncrementThread();
		Thread thi = new Thread(irc);
		// thi.setDaemon(true);
		thi.start();

		DecrementThread drc = new DecrementThread();
		Thread thd = new Thread(drc);
		thd.setDaemon(true);
		thd.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main Ends");
		try {
			thd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
