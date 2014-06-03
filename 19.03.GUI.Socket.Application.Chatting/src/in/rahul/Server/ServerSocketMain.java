package in.rahul.Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketMain {
	private static ServerSocket serverSocket;
	private static Socket socket;
	private static DataInputStream dis;
	private static DataOutputStream dos;
	private static String msg;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Step 1
		int port = 9999;
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Server Socket Object Created...");

		// Step 4
		socket = new Socket();
		try {
			socket = serverSocket.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Client Accepted");

		// Step 5
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

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

}
