package in.rahul.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketMain {
	private static ServerSocket serverSocket;
	private static Socket socket;
	private static DataInputStream dis;
	private static DataOutputStream dos;
	static String msg;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// Step 1
		int port = 9999;
		serverSocket = new ServerSocket(port);
		System.out.println("Server Socket Object Created...");

		// Step 4
		socket = new Socket();
		socket = serverSocket.accept();
		System.out.println("Client Accepted");

		// Step 5
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());

		do {
			// Step 7
			msg = dis.readUTF();
			System.out.println("Client : " + msg);

			// Step 8
			System.out.println("Server : ");
			msg = scanner.nextLine();
			dos.writeUTF(msg);

		} while (!"exit".equals(msg));

		dis.close();
		dos.close();
		serverSocket.close();
		socket.close();
		scanner.close();

	}

}
