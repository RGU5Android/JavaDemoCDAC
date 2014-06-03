public class MainClass {
	public static void main(String[] args) {
		IncrementThread icrt = new IncrementThread();
		Thread thinc = new Thread(icrt);
		// thinc.setDaemon(true);
		thinc.start();

		DecrementThread dcrt = new DecrementThread();
		Thread thdcr = new Thread(dcrt);
		thdcr.setDaemon(true);
		thdcr.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			thinc.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
