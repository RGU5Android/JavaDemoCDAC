package in.rahul.Set.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Movie> treeHashSet = new TreeSet<Movie>();

		treeHashSet.add(new Movie("BB", "Hin"));
		treeHashSet.add(new Movie("DD", "Tel"));
		treeHashSet.add(new Movie("AA", "Eng"));
		treeHashSet.add(new Movie("CC", "Mar"));
		treeHashSet.add(new Movie("AA", "Beng"));
		// 1
		for (Movie m : treeHashSet) {
			System.out.println(m);
		}
		System.out
				.println("1************************************************************");
		// 2
		Movie temp = new Movie("AA", "Beng");
		System.out.println("Size : " + treeHashSet.size());
		System.out.println("Removed AA : " + treeHashSet.remove(temp));
		System.out.println("Contains BB : "
				+ treeHashSet.contains(new Movie("BB", "")));
		System.out.println("Size : " + treeHashSet.size());
		System.out
				.println("2************************************************************");
		// 3
		treeHashSet.add(new Movie("QEE", "Eng"));
		treeHashSet.add(new Movie("AFF", "Hin"));
		treeHashSet.add(new Movie("TGG", "Mar"));
		treeHashSet.add(new Movie("QEE", "Eng"));
		treeHashSet.add(new Movie("EHH", "Tel"));
		treeHashSet.add(new Movie("SII", "Beng"));
		treeHashSet.add(new Movie("QEE", "Eng"));

		for (Movie m : treeHashSet) {
			System.out.println(m);
		}
		System.out
				.println("3************************************************************");

		// 4
		Iterator<Movie> iterator = treeHashSet.iterator();
		while (iterator.hasNext()) {
			Movie movie = (Movie) iterator.next();
			System.out.println(movie);
		}
		System.out
				.println("4************************************************************");

		// 5

		System.out.println("Size : " + treeHashSet.size());
		System.out.println("isEmpty : " + treeHashSet.isEmpty());
		System.out.println("RemoveAll : " + treeHashSet.removeAll(treeHashSet));
		System.out.println("Size : " + treeHashSet.size());
		System.out.println("isEmpty : " + treeHashSet.isEmpty());
		System.out
				.println("5************************************************************");

	}

}
