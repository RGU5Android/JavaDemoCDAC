package in.rahul.Server;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerSocketMain extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton btnStart;
	private static JTextArea txtArea;
	private JTextField txtMsg;
	private JButton btnSend;

	private static ServerSocket serverSocket;
	private static Socket socket;
	private static DataInputStream dis;
	private static DataOutputStream dos;
	private static String msg;
	private static Scanner scanner = new Scanner(System.in);

	public ServerSocketMain() {
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

		btnStart = new JButton("Click Here to Connect To The Server (START)");
		btnStart.setBounds(40, 40, 430, 25);
		btnStart.addActionListener(this);
		this.add(btnStart);

		txtArea = new JTextArea();
		txtArea.setBounds(40, 80, 430, 500);
		txtArea.setEditable(false);
		this.add(txtArea);

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
		if (src == btnStart) {
			try {
				onStart();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (src == btnSend) {
			onSend();
		}
	}

	private void onStart() throws Exception {
		txtArea.setText("1. Hello World");
		// Step 1
		int port = 6666;
		serverSocket = new ServerSocket(port);
		txtArea.setText("2. Hello World");

		// Step 4
		socket = new Socket();
		socket = serverSocket.accept();
		System.out.println("Client Accepted");
		txtArea.setText("3. Hello World");

		// Step 5
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());

	}

	private void onSend() {
		do {
			// Step 7
			try {
				msg = dis.readUTF();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Client : " + msg);

			// Step 8
			System.out.print("Server : ");
			msg = scanner.nextLine();
			try {
				dos.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} while (!"exit".equals(msg));

		try {
			dis.close();
			dos.close();
			serverSocket.close();
			socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();

	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ServerSocketMain clientSocketMain = new ServerSocketMain();
	}

}
