public class DecrementThread extends Thread {
	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println("Decrement : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Decrement Ends");
	}
}
