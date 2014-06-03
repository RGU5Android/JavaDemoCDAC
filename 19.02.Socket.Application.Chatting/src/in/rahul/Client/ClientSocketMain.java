package in.rahul.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSocketMain {
	private static DataOutputStream dos;
	private static DataInputStream dis;
	private static Socket clientSocket;
	private static Scanner scanner = new Scanner(System.in);
	private static String msg;
	private static InetAddress ip;

	public static void main(String[] args) {
		// Step 2 and Step 3
		int port = 9999;

		try {
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		try {
			clientSocket = new Socket(ip, port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Client Socket Connecting....");

		try {
			dis = new DataInputStream(clientSocket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			dos = new DataOutputStream(clientSocket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

		do {
			// Step 6
			System.out.print("Client : ");
			msg = scanner.nextLine();
			try {
				dos.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}

			// Step 9
			try {
				msg = dis.readUTF();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Server : " + msg);

		} while (!"exit".equals(msg));

		try {
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();

	}
}
