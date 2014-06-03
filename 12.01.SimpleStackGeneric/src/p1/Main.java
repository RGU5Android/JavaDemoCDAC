package p1;

public class Main {

	public static void main(String[] args) {
		// Stack<Integer> stack = new Stack<Integer>(10) ;
		// stack.push(10) ;
		// stack.push(20) ;
		// stack.push(30) ;
		// stack.push(40) ;
		// stack.push(50) ;
		// stack.push(60) ;
		// stack.push(70) ;
		// stack.push(80) ;
		// stack.push(90) ;
		// stack.push(100) ;
		//
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		// stack.pop() ;
		//
		Stack<Person> stack = new Stack<Person>(5);
		stack.pop();
		stack.push(new Person(23, "AAAAA"));
		stack.push(new Person(231, "AAAAA"));
		stack.push(new Person(232, "AAAAA"));
		stack.push(new Person(233, "AAAAA"));
		stack.push(new Person(235, "AAAAA"));
		stack.push(new Person(23, "ANNNN"));
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

	}
}
