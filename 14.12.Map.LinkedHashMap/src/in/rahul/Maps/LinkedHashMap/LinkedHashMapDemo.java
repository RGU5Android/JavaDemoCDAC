package in.rahul.Maps.LinkedHashMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put(9123654, "Rahul");
		linkedHashMap.put(8213654, "Abhishek");
		linkedHashMap.put(7123654, "Piyush");
		linkedHashMap.put(6213654, "Priyanka");
		linkedHashMap.put(5123654, "Pappa");
		linkedHashMap.put(4213654, "Mamma");

		System.out
				.println("***************************************************");
		Set<Integer> keys = linkedHashMap.keySet();
		for (Integer integer : keys) {
			System.out.println("Key : " + integer);
		}
		System.out
				.println("***************************************************");

		Collection<String> values = linkedHashMap.values();
		for (String string : values) {
			System.out.println("Values : " + string);
		}
		System.out
				.println("***************************************************");

		Set<Entry<Integer, String>> entries = linkedHashMap.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}

	}
}
