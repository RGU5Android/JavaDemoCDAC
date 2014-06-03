package in.rahul.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<Movie> linkedHashSet = new LinkedHashSet<Movie>();

		linkedHashSet.add(new Movie("BB", "Hin"));
		linkedHashSet.add(new Movie("DD", "Tel"));
		linkedHashSet.add(new Movie("AA", "Eng"));
		linkedHashSet.add(new Movie("CC", "Mar"));
		linkedHashSet.add(new Movie("AA", "Beng"));
		// 1
		for (Movie m : linkedHashSet) {
			System.out.println(m);
		}
		System.out
				.println("1************************************************************");
		// 2
		Movie temp = new Movie("AA", "Beng");
		System.out.println("Size : " + linkedHashSet.size());
		System.out.println("Removed AA : " + linkedHashSet.remove(temp));
		System.out.println("Contains BB : "
				+ linkedHashSet.contains(new Movie("BB", "")));
		System.out.println("Size : " + linkedHashSet.size());
		System.out
				.println("2************************************************************");
		// 3
		linkedHashSet.add(new Movie("QEE", "Eng"));
		linkedHashSet.add(new Movie("AFF", "Hin"));
		linkedHashSet.add(new Movie("TGG", "Mar"));
		linkedHashSet.add(new Movie("QEE", "Eng"));
		linkedHashSet.add(new Movie("EHH", "Tel"));
		linkedHashSet.add(new Movie("SII", "Beng"));
		linkedHashSet.add(new Movie("QEE", "Eng"));

		for (Movie m : linkedHashSet) {
			System.out.println(m);
		}
		System.out
				.println("3************************************************************");

		// 4
		Iterator<Movie> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			Movie movie = (Movie) iterator.next();
			System.out.println(movie);
		}
		System.out
				.println("4************************************************************");

		// 5
		
		System.out.println("Size : " + linkedHashSet.size());
		System.out.println("isEmpty : " + linkedHashSet.isEmpty());
		System.out.println("RemoveAll : " + linkedHashSet.removeAll(linkedHashSet));
		System.out.println("Size : " + linkedHashSet.size());
		System.out.println("isEmpty : " + linkedHashSet.isEmpty());
		System.out
				.println("5************************************************************");

	}

}
