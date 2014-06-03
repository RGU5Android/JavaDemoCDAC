package in.rahul.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Movie> arrayList = new ArrayList<Movie>();

		arrayList.add(new Movie("AA", "Eng"));
		arrayList.add(new Movie("BB", "Hin"));
		arrayList.add(new Movie("CC", "Mar"));
		arrayList.add(new Movie("DD", "Tel"));
		arrayList.add(new Movie("AA", "Beng"));
		// 1
		for (Movie m : arrayList) {
			System.out.println(m);
		}
		System.out
				.println("1************************************************************");
		// 2
		Movie temp = new Movie("AA", "Beng");
		System.out.println("Size : " + arrayList.size());
		System.out.println("Removed AA : " + arrayList.remove(temp));
		System.out.println("Contains BB : "
				+ arrayList.contains(new Movie("BB", "")));
		System.out.println("Size : " + arrayList.size());
		System.out
				.println("2************************************************************");
		// 3
		arrayList.add(new Movie("EE", "Eng"));
		arrayList.add(new Movie("FF", "Hin"));
		arrayList.add(new Movie("GG", "Mar"));
		arrayList.add(new Movie("HH", "Tel"));
		arrayList.add(new Movie("II", "Beng"));

		for (Movie m : arrayList) {
			System.out.println(m);
		}
		System.out
				.println("3************************************************************");
		// 4
		Movie m = arrayList.get(5);
		System.out.println("Element at 5th Position : " + m);

		arrayList.set(5, new Movie("RGU", "RGU"));
		System.out.println("Modified Element at 5th Position"
				+ arrayList.get(5));

		System.out
				.println("4************************************************************");
		// 5
		ListIterator<Movie> listIterator = arrayList.listIterator();
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
		System.out.println("isEmpty : " + arrayList.isEmpty());
		System.out.println("RemoveAll : " + arrayList.removeAll(arrayList));
		System.out.println("isEmpty : " + arrayList.isEmpty());
		System.out
				.println("7************************************************************");

	}

}
