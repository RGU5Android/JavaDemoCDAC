package in.rahul.Client;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientSocketMain extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblServerIP;
	private JTextField txtServerIP;
	private JLabel lblPort;
	private JTextField txtPort;
	private JButton btnConnect;
	private JTextArea txtMsgList;
	private JTextField txtMsg;
	private JButton btnSend;

	public ClientSocketMain() {
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
		};

		this.addWindowListener(wa);
		this.setLayout(null);
		this.setSize(525, 720);
		this.setTitle("Client Chat Window");
		this.setVisible(true);

		lblServerIP = new JLabel("Server IP");
		lblServerIP.setBounds(40, 40, 60, 25);
		lblServerIP.setFocusable(true);
		this.add(lblServerIP);

		txtServerIP = new JTextField();
		txtServerIP.setBounds(110, 40, 100, 25);
		this.add(txtServerIP);

		lblPort = new JLabel("Port");
		lblPort.setBounds(240, 40, 30, 25);
		this.add(lblPort);

		txtPort = new JTextField();
		txtPort.setBounds(280, 40, 70, 25);
		this.add(txtPort);

		btnConnect = new JButton("Connect");
		btnConnect.setBounds(370, 40, 100, 25);
		btnConnect.addActionListener(this);
		this.add(btnConnect);

		txtMsgList = new JTextArea();
		txtMsgList.setBounds(40, 80, 430, 500);
		txtMsgList.setEditable(false);
		this.add(txtMsgList);

		txtMsg = new JTextField();
		txtMsg.setBounds(40, 600, 350, 25);
		this.add(txtMsg);

		btnSend = new JButton("Send");
		btnSend.setBounds(390, 600, 80, 25);
		btnSend.addActionListener(this);
		this.add(btnSend);
		repaint();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object src = ae.getSource();
		if (src == btnConnect) {
			onConnect();
		} else if (src == btnSend) {
			onSend();
		}
	}

	private void onConnect() {

	}

	private void onSend() {

	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		repaint();
	}

	public static void main(String[] args) {
		ClientSocketMain serverSocketMain = new ClientSocketMain();

	}

}
