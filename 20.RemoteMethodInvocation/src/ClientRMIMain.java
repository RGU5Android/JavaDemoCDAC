import java.rmi.Naming;

public class ClientRMIMain {

	public static void main(String[] args) throws Exception {
		String url = "WIMC";
		ServerInterface obj = (ServerInterface) Naming.lookup(url);

		int res;
		res = obj.add(5, 5);
		System.out.println("ANSWER : " + res);
	}
}