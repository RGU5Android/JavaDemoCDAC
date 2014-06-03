public class MainClass {
	public static void main(String[] args) {
		(new Thread(new IncrementThread())).start();
		(new Thread(new DecrementThread())).start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
