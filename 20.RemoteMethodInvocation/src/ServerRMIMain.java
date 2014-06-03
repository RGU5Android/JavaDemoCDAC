import java.rmi.Naming;

public class ServerRMIMain {
	public static void main(String[] args) throws Exception {
		ServerImplementation obj = new ServerImplementation();
		Naming.bind("WIMC", obj);
	}

}