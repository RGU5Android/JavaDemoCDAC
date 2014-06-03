package in.rahul.List.Stack;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class StackDemo {
	public static void main(String[] args) {
		List<Movie> stack = new Vector<Movie>();

		stack.add(new Movie("BB", "Hin"));
		stack.add(new Movie("DD", "Tel"));
		stack.add(new Movie("AA", "Eng"));
		stack.add(new Movie("CC", "Mar"));
		stack.add(new Movie("AA", "Beng"));
		// 1
		for (Movie m : stack) {
			System.out.println(m);
		}
		System.out
				.println("1************************************************************");
		// 2
		Movie temp = new Movie("AA", "Beng");
		System.out.println("Size : " + stack.size());
		System.out.println("Removed AA : " + stack.remove(temp));
		System.out.println("Contains BB : "
				+ stack.contains(new Movie("BB", "")));
		System.out.println("Size : " + stack.size());
		System.out
				.println("2************************************************************");
		// 3
		stack.add(new Movie("QEE", "Eng"));
		stack.add(new Movie("AFF", "Hin"));
		stack.add(new Movie("TGG", "Mar"));
		stack.add(new Movie("EHH", "Tel"));
		stack.add(new Movie("SII", "Beng"));

		for (Movie m : stack) {
			System.out.println(m);
		}
		System.out
				.println("3************************************************************");
		// 4
		Movie m = stack.get(5);
		System.out.println("Element at 5th Position : " + m);

		stack.set(5, new Movie("RGU", "RGU"));
		System.out.println("Modified Element at 5th Position"
				+ stack.get(5));

		System.out
				.println("4************************************************************");
		// 5
		ListIterator<Movie> listIterator = stack.listIterator();
		while (listIterator.hasNext()) {
			Movie movie = (Movie) listIterator.next();
			System.out.println(movie);
		}
		System.out
				.println("5************************************************************");

		// 6
		while (listIterator.hasPrevious()) {
			Movie movie = (Movie) listIterator.previous();
			System.out.println(movie);
		}
		System.out
				.println("6************************************************************");

		// 7
		System.out.println("isEmpty : " + stack.isEmpty());
		System.out.println("RemoveAll : " + stack.removeAll(stack));
		System.out
				.println("7************************************************************");

	}

}
