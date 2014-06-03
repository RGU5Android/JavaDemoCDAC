package in.rahul.ComparableInterface;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person(35, "Rahul");
		Person p2 = new Person(45, "Rahul");
		Person p3 = new Person(35, "Rahul");

		System.out.println("*******************************************equals()*******************************************");
		
		if (p1.equals(p2)) {
			System.out.println("P1 = P2");
		} else if (p1.equals(p3)) {
			System.out.println("P1 = P3");
		} else if (p2.equals(p3)) {
			System.out.println("P2 = P3");
		}
		
		System.out.println("*******************************************compareTo()*******************************************");
		
		int result1 = p1.compareTo(p2) ;
		if(result1 == 0){
			System.out.println("P1 = P2");
		}else if(result1 == 1){
			System.out.println("P1 > P2");
		}else if(result1 == -1){
			System.out.println("P1 < P2");
		}
		
		System.out.println("*******************************************compareTo()*******************************************");
		
		int result2 = p1.compareTo(p3) ;
		if(result2 == 0){
			System.out.println("P1 = P3");
		}else if(result2 == 1){
			System.out.println("P1 > P3");
		}else if(result2 == -1){
			System.out.println("P1 < P3");
		}
	}
}
