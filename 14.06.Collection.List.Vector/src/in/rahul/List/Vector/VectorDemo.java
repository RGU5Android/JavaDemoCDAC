package in.rahul.List.Vector;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		List<Movie> vector = new Vector<Movie>();

		vector.add(new Movie("BB", "Hin"));
		vector.add(new Movie("DD", "Tel"));
		vector.add(new Movie("AA", "Eng"));
		vector.add(new Movie("CC", "Mar"));
		vector.add(new Movie("AA", "Beng"));
		// 1
		for (Movie m : vector) {
			System.out.println(m);
		}
		System.out
				.println("1************************************************************");
		// 2
		Movie temp = new Movie("AA", "Beng");
		System.out.println("Size : " + vector.size());
		System.out.println("Removed AA : " + vector.remove(temp));
		System.out.println("Contains BB : "
				+ vector.contains(new Movie("BB", "")));
		System.out.println("Size : " + vector.size());
		System.out
				.println("2************************************************************");
		// 3
		vector.add(new Movie("QEE", "Eng"));
		vector.add(new Movie("AFF", "Hin"));
		vector.add(new Movie("TGG", "Mar"));
		vector.add(new Movie("EHH", "Tel"));
		vector.add(new Movie("SII", "Beng"));

		for (Movie m : vector) {
			System.out.println(m);
		}
		System.out
				.println("3************************************************************");
		// 4
		Movie m = vector.get(5);
		System.out.println("Element at 5th Position : " + m);

		vector.set(5, new Movie("RGU", "RGU"));
		System.out.println("Modified Element at 5th Position"
				+ vector.get(5));

		System.out
				.println("4************************************************************");
		// 5
		ListIterator<Movie> listIterator = vector.listIterator();
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
		System.out.println("isEmpty : " + vector.isEmpty());
		System.out.println("RemoveAll : " + vector.removeAll(vector));
		System.out
				.println("7************************************************************");

	}

}
