package in.rahul.StringBuilder;

public class Demo {
	String string ;					// String is Immutable class since it's value cannot be modified, 
									// The value of object of class String is changed not modified.
	StringBuilder stringBuilder ;	//StringBuilder is Mutable class since it's can be modified without changing
	public Demo() {

		string = "test1" ;
		string = "test2" ;
		string = "test3" ;
		
		stringBuilder = new StringBuilder(string);
		stringBuilder.append(" " +string) ;
		stringBuilder.append(" " +string);
	}
	@Override
	public String toString() {
		return "Demo [string=" + string + ", stringBuilder=" + stringBuilder
				+ "]";
	}
	
	public static void main(String[] args) {
		System.out.println(new Demo()) ;
	}
}
