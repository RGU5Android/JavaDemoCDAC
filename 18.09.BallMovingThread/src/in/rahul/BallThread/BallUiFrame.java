package in.rahul.BallThread;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BallUiFrame extends Frame {
	private static final long serialVersionUID = 1L;
	int xr = 0, yr = 100, sr = 50; // X - start point from X Axis ; Y - start
	// point from Y Axis ; S - Size
	int xg = 0, yg = 200, sg = 50; // R - RED ; G - GREEN ; B - BLUE
	int xb = 0, yb = 300, sb = 50;

	Object obj = new Object();

	public BallUiFrame() {
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				BallUiFrame.this.dispose();
			}
		};
		this.addWindowListener(wa);

		Thread tr = new Thread(new Runnable() {
			public void run() {
				moveRedBall();
			}
		});
		tr.setDaemon(true);
		tr.start();

		Thread tg = new Thread(new Runnable() {
			public void run() {
				moveGreenBall();
			}
		});
		tg.setDaemon(true);
		tg.start();

		Thread tb = new Thread(new Runnable() {
			public void run() {
				moveBlueBall();
			}
		});
		tb.setDaemon(true);
		tb.start();
	}

	public void delay(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void moveRedBall() {
		while (true) {
			synchronized (obj) {
				while (xr < this.getWidth() - sr) {
					xr += 5;
					repaint();
					delay(50);
				}
				// while(xr>0){
				// xr-=5;
				// repaint();
				// delay(50);
				// }
			}
		}
	}

	public void moveGreenBall() {
		while (true) {
			synchronized (obj) {
				while (xg < this.getWidth() - sg) {
					xg += 6;
					repaint();
					delay(50);
				}
				// while(xg>0){
				// xg-=6;
				// repaint();
				// delay(50);
				// }
			}
		}
	}

	public void moveBlueBall() {
		while (true) {
			synchronized (obj) {
				while (xb < this.getWidth() - sb) {
					xb += 4;
					repaint();
					delay(50);
				}
				// while(xb>0){
				// xb-=4;
				// repaint();
				// delay(50);
				// }
			}
		}
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(xr, yr, sr, sr);
		g.setColor(Color.GREEN);
		g.fillOval(xg, yg, sg, sg);
		g.setColor(Color.BLUE);
		g.fillOval(xb, yb, sb, sb);
	}
}
