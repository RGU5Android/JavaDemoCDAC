package in.rahul.List.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<Movie> linkedList = new LinkedList<Movie>();

		linkedList.add(new Movie("BB", "Hin"));
		linkedList.add(new Movie("DD", "Tel"));
		linkedList.add(new Movie("AA", "Eng"));
		linkedList.add(new Movie("CC", "Mar"));
		linkedList.add(new Movie("AA", "Beng"));
		// 1
		for (Movie m : linkedList) {
			System.out.println(m);
		}
		System.out
				.println("1************************************************************");
		// 2
		Movie temp = new Movie("AA", "Beng");
		System.out.println("Size : " + linkedList.size());
		System.out.println("Removed AA : " + linkedList.remove(temp));
		System.out.println("Contains BB : "
				+ linkedList.contains(new Movie("BB", "")));
		System.out.println("Size : " + linkedList.size());
		System.out
				.println("2************************************************************");
		// 3
		linkedList.add(new Movie("QEE", "Eng"));
		linkedList.add(new Movie("AFF", "Hin"));
		linkedList.add(new Movie("TGG", "Mar"));
		linkedList.add(new Movie("EHH", "Tel"));
		linkedList.add(new Movie("SII", "Beng"));

		for (Movie m : linkedList) {
			System.out.println(m);
		}
		System.out
				.println("3************************************************************");
		// 4
		Movie m = linkedList.get(5);
		System.out.println("Element at 5th Position : " + m);

		linkedList.set(5, new Movie("RGU", "RGU"));
		System.out.println("Modified Element at 5th Position"
				+ linkedList.get(5));

		System.out
				.println("4************************************************************");
		// 5
		ListIterator<Movie> listIterator = linkedList.listIterator();
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
		System.out.println("isEmpty : " + linkedList.isEmpty());
		System.out.println("RemoveAll : " + linkedList.removeAll(linkedList));
		System.out.println("isEmpty : " + linkedList.isEmpty());
		System.out
				.println("7************************************************************");

	}

}
