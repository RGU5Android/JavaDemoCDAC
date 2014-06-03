package in.rahul.Maps.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer , String> hashmap = new HashMap<>() ;
		
		hashmap.put(9123654, "Rahul") ;
		hashmap.put(8213654, "Abhishek") ;
		hashmap.put(7123654, "Piyush") ;
		hashmap.put(6213654, "Priyanka") ;
		hashmap.put(5123654, "Pappa") ;
		hashmap.put(4213654, "Mamma") ;
		
		System.out.println("***************************************************");
		Set<Integer> keys = hashmap.keySet() ;
		for(Integer integer : keys){
			System.out.println("Key : " +integer);
		}
		System.out.println("***************************************************");
		
		Collection<String> values = hashmap.values() ;
		for(String string : values){
			System.out.println("Values : " +string);
		}
		System.out.println("***************************************************");
		
		Set<Entry<Integer , String>> entries = hashmap.entrySet() ;
		for(Entry<Integer , String> entry : entries){
			System.out.println(entry.getKey() +"->" +entry.getValue());
		}
		
		
		
		
		
	}
}
