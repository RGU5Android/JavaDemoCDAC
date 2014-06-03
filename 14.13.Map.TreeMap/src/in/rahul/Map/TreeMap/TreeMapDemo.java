package in.rahul.Map.TreeMap;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Integer , String> treeMap = new TreeMap<>() ;
		
		treeMap.put(9123654, "Rahul") ;
		treeMap.put(8213654, "Abhishek") ;
		treeMap.put(7123654, "Piyush") ;
		treeMap.put(6213654, "Priyanka") ;
		treeMap.put(5123654, "Pappa") ;
		treeMap.put(4213654, "Mamma") ;
		
		System.out.println("***************************************************");
		Set<Integer> keys = treeMap.keySet() ;
		for(Integer integer : keys){
			System.out.println("Key : " +integer);
		}
		System.out.println("***************************************************");
		
		Collection<String> values = treeMap.values() ;
		for(String string : values){
			System.out.println("Values : " +string);
		}
		System.out.println("***************************************************");
		
		Set<Entry<Integer , String>> entries = treeMap.entrySet() ;
		for(Entry<Integer , String> entry : entries){
			System.out.println(entry.getKey() +"->" +entry.getValue());
		}
		
		
		
		
		
	}
}
