package in.rahul.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocketMain {
	private static DataOutputStream dos;
	private static DataInputStream dis;
	private static Socket clientSocket;
	static Scanner scanner = new Scanner(System.in);
	static String msg;

	public static void main(String[] args) throws Exception {
		// Step 2 and Step 3
		int port = 9999;
		InetAddress ip = InetAddress.getLocalHost();
		clientSocket = new Socket(ip, port);
		System.out.println("Client Socket Connecting....");

		dis = new DataInputStream(clientSocket.getInputStream());
		dos = new DataOutputStream(clientSocket.getOutputStream());

		do {
			// Step 6
			System.out.print("Client : ");
			msg = scanner.nextLine();
			dos.writeUTF(msg);

			// Step 9
			msg = dis.readUTF();
			System.out.println("Server : " + msg);

		} while (!"exit".equals(msg));

		dis.close();
		dos.close();
		clientSocket.close();
		scanner.close();

	}
}
