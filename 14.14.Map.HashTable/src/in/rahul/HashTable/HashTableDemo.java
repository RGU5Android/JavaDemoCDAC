package in.rahul.HashTable;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashTableDemo {
	public static void main(String[] args) {
		Map<Integer , String> hashTable = new Hashtable<>() ;
		
		hashTable.put(9123654, "Rahul") ;
		hashTable.put(8213654, "Abhishek") ;
		hashTable.put(7123654, "Piyush") ;
		hashTable.put(6213654, "Priyanka") ;
		hashTable.put(5123654, "Pappa") ;
		hashTable.put(4213654, "Mamma") ;
		
		System.out.println("***************************************************");
		Set<Integer> keys = hashTable.keySet() ;
		for(Integer integer : keys){
			System.out.println("Key : " +integer);
		}
		System.out.println("***************************************************");
		
		Collection<String> values = hashTable.values() ;
		for(String string : values){
			System.out.println("Values : " +string);
		}
		System.out.println("***************************************************");
		
		Set<Entry<Integer , String>> entries = hashTable.entrySet() ;
		for(Entry<Integer , String> entry : entries){
			System.out.println(entry.getKey() +"->" +entry.getValue());
		}
		
		
		
		
		
	}
}
