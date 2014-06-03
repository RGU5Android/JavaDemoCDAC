package in.rahul.PaintMouseEvent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class PaintArea extends JFrame implements ActionListener{

	private static final long serialVersionUID = 2L;
	Point startPoint ;
	Point endPoint ;
	
	public PaintArea() {
		this.setTitle("Paint Lines") ;
		this.setVisible(true);
		this.setSize(500, 500);
		
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				PaintArea.this.dispose() ;
			}
		};
		this.addWindowListener(wa) ;
		
		MouseAdapter ma = new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				startPoint = arg0.getPoint() ;
//				repaint();
			}
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				endPoint = arg0.getPoint() ;
				
				Graphics graphics = getGraphics() ;
				graphics.setColor(Color.DARK_GRAY);
				graphics.drawOval((int)startPoint.getX(), (int)startPoint.getY(), (int)endPoint.getX(), (int)endPoint.getY());
				graphics.dispose() ;
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				repaint();
			}
			
		};
		this.addMouseListener(ma);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
}
