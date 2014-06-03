import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplementation extends UnicastRemoteObject implements
		ServerInterface {

	public ServerImplementation() throws RemoteException {
		System.out.println("Server Implementation Object Created");
	}

	public int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
}