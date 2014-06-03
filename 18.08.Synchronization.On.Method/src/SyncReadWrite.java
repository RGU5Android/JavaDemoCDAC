import java.util.Random;

public class SyncReadWrite {
	Random rnd = new Random();
	int array[] = new int[2];
	Object obj = new Object();

	public synchronized void readArray() {
		while (true) {

			for (int i = 0; i < array.length; i++) {
				System.out.println("Read :: " + array[i]);
			}
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public synchronized void writeArray() {
		while (true) {

			for (int i = 0; i < array.length; i++) {
				array[i] = rnd.nextInt(500);
				System.out.println("Write :: " + array[i]);
			}
			this.notify();
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void startWrite() {
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				writeArray();
			}
		});
		th.setDaemon(true);
		th.start();
	}

	public void startRead() {
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				readArray();
			}
		});
		th.setDaemon(true);
		th.start();
	}
}
