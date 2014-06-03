import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		SyncReadWrite srw = new SyncReadWrite();
		srw.startRead();
		srw.startWrite();

		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		sc.close();
	}

}
