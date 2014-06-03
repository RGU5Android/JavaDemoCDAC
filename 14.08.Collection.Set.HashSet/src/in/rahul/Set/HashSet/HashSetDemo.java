package in.rahul.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Movie> hashSet = new HashSet<Movie>();

		hashSet.add(new Movie("BB", "Hin"));
		hashSet.add(new Movie("DD", "Tel"));
		hashSet.add(new Movie("AA", "Eng"));
		hashSet.add(new Movie("CC", "Mar"));
		hashSet.add(new Movie("AA", "Beng"));
		// 1
		for (Movie m : hashSet) {
			System.out.println(m);
		}
		System.out
				.println("1************************************************************");
		// 2
		Movie temp = new Movie("AA", "Beng");
		System.out.println("Size : " + hashSet.size());
		System.out.println("Removed AA : " + hashSet.remove(temp));
		System.out.println("Contains BB : "
				+ hashSet.contains(new Movie("BB", "")));
		System.out.println("Size : " + hashSet.size());
		System.out
				.println("2************************************************************");
		// 3
		hashSet.add(new Movie("QEE", "Eng"));
		hashSet.add(new Movie("AFF", "Hin"));
		hashSet.add(new Movie("TGG", "Mar"));
		hashSet.add(new Movie("QEE", "Eng"));
		hashSet.add(new Movie("EHH", "Tel"));
		hashSet.add(new Movie("SII", "Beng"));
		hashSet.add(new Movie("QEE", "Eng"));

		for (Movie m : hashSet) {
			System.out.println(m);
		}
		System.out
				.println("3************************************************************");

		// 4
		Iterator<Movie> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Movie movie = (Movie) iterator.next();
			System.out.println(movie);
		}
		System.out
				.println("4************************************************************");

		// 5
		
		System.out.println("Size : " + hashSet.size());
		System.out.println("isEmpty : " + hashSet.isEmpty());
		System.out.println("RemoveAll : " + hashSet.removeAll(hashSet));
		System.out.println("Size : " + hashSet.size());
		System.out.println("isEmpty : " + hashSet.isEmpty());
		System.out
				.println("5************************************************************");

	}

}
